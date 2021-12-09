package com.SRIS.OrganizatonType;

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
	public void AidFrequencyModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OrganizatonTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}

	@Test(priority = 2)
	public void CkeckSpecialCharForOrganizatonTypeName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OrganizatonTypeNameClearMethod();
		Thread.sleep(700);
		masterdata.OrganizatonTypeNameSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.OrganizatonTypeNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(OrganizatonType_Sheet, Column_name, 14, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(OrganizatonType_Sheet, Column_name, 14, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSpecialCharForOrganizatonTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OrganizatonTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.OrganizatonTypeDescriptionSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.OrganizatonTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(OrganizatonType_Sheet, Column_name, 15, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(OrganizatonType_Sheet, Column_name, 15, "Pass");
			System.out.println("Pass");
		}
	}
}
