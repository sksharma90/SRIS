package com.SRIS.ResidenceStatus;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class AlphaNumeric extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void ResidenceStatusModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ResidenceStatusMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForResidenceName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ResidenceNameClearMethod();
		Thread.sleep(700);
		masterdata.ResidenceNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.ResidenceNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 17, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 17, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForResidenceDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ResidenceDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.ResidenceDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.ResidenceDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 18, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 18, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 4)
	public void CheckAlphabetsForResidenceName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ResidenceNameClearMethod();
		Thread.sleep(700);
		masterdata.ResidenceNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.ResidenceNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 19, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 19, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 5)
	public void CheckAlphabetsForResidenceDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		//masterdata.AddMethod();
		masterdata.ResidenceDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.ResidenceDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.ResidenceDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 20, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, Column_name, 20, "Fail");
			System.out.println("Fail");
		}
	}
}
