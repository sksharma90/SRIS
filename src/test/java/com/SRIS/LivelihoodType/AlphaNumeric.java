package com.SRIS.LivelihoodType;

import java.util.regex.Matcher;
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
	public void LivelihoodType_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForLivelihoodType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeClearMethod();
		Thread.sleep(700);
		masterdata.LivelihoodTypeAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.LivelihoodTypeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == false) {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 17, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 17, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForLivelihoodTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.LivelihoodTypeDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.LivelihoodTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == false) {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 18, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 18, "Fail");
			System.out.println("Fail");
		}
	}
	@Test(priority = 4)
	public void CheckAlphabetsForLivelihoodType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeClearMethod();
		Thread.sleep(700);
		masterdata.LivelihoodTypeAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.LivelihoodTypeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 19, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 19, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 5)
	public void CheckAlphabetsForLivelihoodTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.LivelihoodTypeDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.LivelihoodTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 20, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 20, "Fail");
			System.out.println("Fail");
		}
	}
}
