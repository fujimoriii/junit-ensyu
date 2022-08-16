package junit.tutorial.ex02.e02;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	@DisplayName("JAVABEANSのアサーション")
	void test() {
		try {
					
			InputStream in = new FileInputStream("/env/springworkspace/junit-ensyu/src/main/java/junit/tutorial/ex02/e02/Employee.txt");
			List<Employee> empList = Employee.load(in);
			//System.out.println(empList.size());
			assertAll(
					() -> assertEquals("Ichiro",empList.get(0).getFirstName()),
					() -> assertEquals("Tanaka",empList.get(0).getLastName()),
					() -> assertEquals("ichiro@example.com",empList.get(0).getEmail())
					);
			for (Employee emp : empList) {
				System.out.println(emp.getFirstName());
				System.out.println(emp.getLastName());
				System.out.println(emp.getEmail());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
