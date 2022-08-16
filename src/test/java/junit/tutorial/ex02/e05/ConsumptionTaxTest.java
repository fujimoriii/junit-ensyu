package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

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
	}

	ConsumptionTax tax5 = new ConsumptionTax(5);

	@ParameterizedTest
	@CsvSource({ "100,105", "3000,3150", "50,52" })
	void test01(int price, int expected) {
		assertEquals(expected, tax5.apply(price));

	}

	@Test
	void test02() {
		ConsumptionTax tax10 = new ConsumptionTax(10);
		assertEquals(55, tax10.apply(50));
	}

	@Test
	@DisplayName("パラメーター化テスト")
	void test03() {
		ConsumptionTax tax3 = new ConsumptionTax(3);
		assertEquals(51, tax3.apply(50));
	}

	@ParameterizedTest
	@CsvSource({ "5,100,105", "5,3000,3150", "10,50,55", "5,50,52", "3,50,51" })
	void test04(int rate, int price, int expected) {
		ConsumptionTax tax = new ConsumptionTax(rate);
		assertEquals(expected, tax.apply(price));

	}
}
