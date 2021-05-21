package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	@Test public void testAppHasAGreeting() {
		App classUnderTest = new App();
		assertNotNull("app should have a greeting", classUnderTest.getGreeting());
	}
	
	@Test public void testDivideReturnResult(){
		App classUnderTest = new App();
		assertNotNull("Divide should return result: ", classUnderTest.divide(10,2));
	}	
	
	@Test(expected=ArithmeticException.class)
	public void testDenominatorZero(){
		App classUnderTest = new App();
		classUnderTest.divide(10,0);
	}
}