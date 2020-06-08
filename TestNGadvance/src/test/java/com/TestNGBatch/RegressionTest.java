package com.TestNGBatch;

import org.testng.annotations.Test;

public class RegressionTest {
	{System.out.println("RegressionTest");};	
@Test(priority = 1)
public void test1() {
System.out.println("test one");	
}

@Test(priority = 2)
public void test2() {
System.out.println("test two");	
}

@Test(priority = 3)
public void test3() {
System.out.println("test three");	
}

@Test(priority = 4)
public void test4() {
System.out.println("test four");	
}

@Test(priority = 5)
public void test5() {
System.out.println("test five");	
}

@Test(priority = 6)
public void test6() {
System.out.println("test six");	
}

}
