package com.SRIS.WorkingFrequency;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class Mandatory extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void WorkingFrequencyModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.WorkingFrequencyMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}

	@Test(priority = 2)
	public void CheckMandatoryForWorkingFrequencyName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.PopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Please Enter Name"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(WorkingFrequency_Sheet, "Status", 2, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(WorkingFrequency_Sheet, "Status", 2, "Fail");
		}
	}
	@Test(priority = 3)
	public void CheckNonMandatoryForWorkingFrequencyDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.WorkingFrequencyNameTextFieldMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure you want to submit?"))
		{
			System.out.println(msg);
			masterdata.PopupNoMethod();
			AutoConstant.fileone.setCellData(WorkingFrequency_Sheet, "Status", 3, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(WorkingFrequency_Sheet, "Status", 3, "Fail");
		}
	}
	
}
