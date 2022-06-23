package POM;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {
	
	@Test(priority=1,timeOut=1000)
	public void test1() throws InterruptedException {
		Thread.sleep(900);
		System.out.println("Test1 done executed");
	}	
    @Test(enabled=false)
    public void test2() {
    	System.out.println("Test2 done executed");
    }
    @Test(priority=2,invocationCount=3)
    public void test3() {
    	System.out.println("Test3 done executed");
    }
    @Test(dependsOnMethods= {"test1"})
    public void test4() {
    	System.out.println("Test4 done executed");
    }
    @BeforeMethod
	public void Beforemethod() {
		System.out.println("executed Beforemethod");
	}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("executed AfterMethod");
	}
	@BeforeClass
	public void Beforeclass() {
		System.out.println("executed BeforeClass");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("executed AfterClass");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("executed BeforeTest");
	}
    
		
	
	

}
