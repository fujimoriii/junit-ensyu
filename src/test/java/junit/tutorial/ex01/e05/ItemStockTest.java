package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(new Item("book",100));
		itemStock.add(new Item("book",100));
		itemStock.add(new Item("CD",500));
		int firstGetNum = itemStock.getNum(new Item("CD",100));//Item item = new Item();省略
		System.out.println(firstGetNum);
		
	}

}
