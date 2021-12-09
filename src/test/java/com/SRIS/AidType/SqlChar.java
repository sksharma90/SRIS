package com.SRIS.AidType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class SqlChar extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void AidType_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}	
	
	@Test(priority = 2)
	public void CheckSqlCharForAidType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeClearMethod();
		Thread.sleep(700);
		masterdata.AidTypeSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.AidTypeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 12, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 12, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckSqlCharForAidTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.AidTypeDescriptionSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.AidTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 13, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 13, "Pass");
			System.out.println("Pass");
		}
	}
	
}
