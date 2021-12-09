package com.SRIS.ShockSeverityType;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class WhiteSpace extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void ShockSeverityType_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForShockSeverityType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeClearMethod();
		Thread.sleep(700);
		masterdata.ShockSeverityTypeWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.PopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 5, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 5, "Fail");
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceAllowMiddlePlaceForShockSeverityType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeClearMethod();
		Thread.sleep(700);
		masterdata.ShockSeverityTypeWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure you want to submit?"))
		{
			System.out.println(msg);
			masterdata.PopupNoMethod();
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 7, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 7, "Fail");
		}
	}
	
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowInitialPlaceForShockSeverityTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.ShockSeverityTypeDescriptionWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.PopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 8, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 8, "Fail");
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceAllowMiddlePlaceForShockSeverityTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.ShockSeverityTypeDescriptionWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure you want to submit?"))
		{
			System.out.println(msg);
			masterdata.PopupNoMethod();
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 10, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, "Status", 10, "Fail");
		}
	}
	
}
