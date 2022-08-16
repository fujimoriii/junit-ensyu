package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

	@Nested
	class group1 {
		Range range = new Range(0.0, 10.5);

		@ParameterizedTest
		@DisplayName("境界値のテスト")
		@ValueSource(doubles = { -0.1, 10.6 })
		void test01(double value) {
			boolean falseResult = range.contains(value);
			assertEquals(false, falseResult, "(-0.1,10.6)失敗");
		}

		@ParameterizedTest
		@ValueSource(doubles = { 0.0, 10.5 })
		void test02(double value) {
			boolean trueResult = range.contains(value);
			assertEquals(true, trueResult, "(0.0,10.5)失敗");
		}
	}

	@Nested
	class group2 {
		Range range2 = new Range(-5.1, 5.1);

		@ParameterizedTest
		@ValueSource(doubles = { -5.2, 5.2 })
		void test03(double value) {
			boolean falseResult = range2.contains(value);
			assertEquals(false, falseResult, "(-5.2,5.2)失敗");
		}

		@ParameterizedTest
		@ValueSource(doubles = { -5.1, 5.1 })
		void test04(double value) {
			boolean trueResult = range2.contains(value);
			assertEquals(true, trueResult, "(-5.1,5.1)失敗");

		}

	}
}
