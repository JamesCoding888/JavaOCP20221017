package day19;
/*
 	Of this lesson, we created testing methods with annotation of Junit @Test.
 	After running on the application of TestArea.java, you will find the some of method(s) are either Pass or Fail 
 	(refer to attached image of "test_day19.png"), according to testing structures of QA/Engineer.
 	 
 	
*/

import org.junit.Test;   
import com.ocp.day18.assertion.Area;
import junit.framework.Assert;
public class TestArea {
	@Test
	public void test1() {
		// Utilize the SOP of 3A for testing
		// Arrange - the testing instance
		Area area = new Area(30, 20);
		// Act - actually expected value
		int actArea = area.getArea();
		// Assert
		// Definition of the expected value we want
		int expectedArea = 600;
		Assert.assertEquals(expectedArea, actArea);
	}
	
	@Test
	public void test2() {
		// Utilize the SOP of 3A for testing
		// Arrange - the testing instance
		Area area = new Area(10, 10);
		// Act - actually expected value
		int actArea = area.getArea();
		// Assert
		// Definition of the expected value we want
		int expectedArea = 150;
		Assert.assertEquals(expectedArea, actArea);
	}
	
	@Test
	public void test3() {
		// Utilize the SOP of 3A for testing
		// Arrange - the testing instance
		Area area = new Area(40, 20);
		// Act - actually expected value
		int actArea = area.getArea();
		// Assert
		// Definition of the expected value we want
		int expectedArea = 800;
		Assert.assertEquals(expectedArea, actArea);
	}
	
	@Test
	public void test4() {
		// Utilize the SOP of 3A for testing
		// Arrange - the testing instance
		Area area = new Area(15, 30);
		// Act - actually expected value
		int actArea = area.getArea();
		// Assert
		// Definition of the expected value we want
		int expectedArea = 750;
		Assert.assertEquals(expectedArea, actArea);
	}
	
	@Test
	public void test5() {
		// Utilize the SOP of 3A for testing
		// Arrange - the testing instance
		Area area = new Area(40, 30);
		// Act - actually expected value
		int actArea = area.getArea();
		// Assert
		// Definition of the expected value we want
		int expectedArea = 750;
		Assert.assertEquals(expectedArea, actArea);
	}
}
