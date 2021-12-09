package com.SRIS.PMTMaster;

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
	public void PMTMasterModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.PMTMasterMethod();
		Thread.sleep(1000);
		//masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CkeckSpecialCharForTopCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.TopCutOffClearMethod();
		Thread.sleep(700);
		masterdata.TopCutOffSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.TopCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 15, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 15, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSpecialCharForButtomCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ButtomCutOffClearMethod();
		Thread.sleep(700);
		masterdata.ButtomCutOffSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.ButtomCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 16, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 16, "Pass");
			System.out.println("Pass");
		}
	}
	
}
