package com.SRIS.OccupancyStatus;

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
	public void OccupancyStatus_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OccupancyStatusMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForOccupancyStatus()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OccupancyStatusClearMethod();
		Thread.sleep(700);
		masterdata.OccupancyStatusWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.PopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 5, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 5, "Fail");
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceAllowMiddlePlaceForOccupancyStatus()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OccupancyStatusClearMethod();
		Thread.sleep(700);
		masterdata.OccupancyStatusWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure you want to submit?"))
		{
			System.out.println(msg);
			masterdata.PopupNoMethod();
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 7, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 7, "Fail");
		}
	}
	
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowInitialPlaceForOccupancyStatusDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OccupancyStatusDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.OccupancyStatusDescriptionWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.PopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 8, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 8, "Fail");
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceAllowMiddlePlaceForOccupancyStatusDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.OccupancyStatusDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.OccupancyStatusDescriptionWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure you want to submit?"))
		{
			System.out.println(msg);
			masterdata.PopupNoMethod();
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 10, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(OccupancyStatus_Sheet, "Status", 10, "Fail");
		}
	}
	
}
