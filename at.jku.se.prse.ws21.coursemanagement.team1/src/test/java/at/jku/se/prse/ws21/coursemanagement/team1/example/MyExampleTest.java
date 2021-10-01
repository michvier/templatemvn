package at.jku.se.prse.ws21.coursemanagement.team1.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyExampleTest {

	MyExample exampleClass;

	@BeforeEach
	void setUp() {
		exampleClass = new MyExample();
	} 

	@Test
	@DisplayName("Test Insert Method")
	void testInsertUniqueItem() {
		exampleClass.addItem("TestItem1");
		exampleClass.addItem("TestItem2");
		exampleClass.addItem("TestItem3");
		assertEquals(3,exampleClass.getItems().size());
		assertEquals(Arrays.asList("TestItem1","TestItem2","TestItem3"),exampleClass.getItems());
	}
	
	@Test
	@DisplayName("Test Insert Method with duplicate Items")
	void testInsertDuplicate() {
		exampleClass.addItem("TestItem1");
		exampleClass.addItem("TestItem2");
		
		
		assertThrows(IllegalArgumentException.class, () -> {
			exampleClass.addItem("TestItem1");
	    });
		assertEquals(2,exampleClass.getItems().size());
		
	}
	
	@Test
	@DisplayName("This test fails!")
	void testAlwaysFails() {
		assertEquals(0, 1);
		
	}

	

}
