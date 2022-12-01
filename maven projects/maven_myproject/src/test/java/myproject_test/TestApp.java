package myproject_test;

import org.testng.Assert;

import maven_myproject.APP;

public class TestApp {
public void login1() {
	APP myApp=new APP();
	Assert.assertEquals(0,myApp.userlogin("ravi", "ravi@199"));
}
public void login2() {
APP myapp=new APP();
Assert.assertEquals(1,myapp.userlogin("ravi", "ravi@1999"));
}
}