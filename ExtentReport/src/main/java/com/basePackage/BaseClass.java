package com.basePackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseClass {
	
	public ExtentSparkReporter extentsparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@Test
	public void test1()
	{
		System.out.println("print");
	}
	

}
