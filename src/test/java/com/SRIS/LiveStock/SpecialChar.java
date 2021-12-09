package com.SRIS.LiveStock;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class SpecialChar extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void LiveStock_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LiveStockMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}	
	
	@Test(priority = 2)
	public void CheckSpecialCharForLiveStock()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LiveStockClearMethod();
		Thread.sleep(700);
		masterdata.LiveStockSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.LiveStockGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(LiveStock_Sheet, Column_name, 14, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(LiveStock_Sheet, Column_name, 14, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckSpecialCharForLiveStockDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LiveStockDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.LiveStockDescriptionSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.LiveStockDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(LiveStock_Sheet, Column_name, 15, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(LiveStock_Sheet, Column_name, 15, "Pass");
			System.out.println("Pass");
		}
	}
}
