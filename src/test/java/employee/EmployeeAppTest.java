package employee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeAppTest {

    @Test
    public void testData() {

        Employee testEmp = getEmployeeTest();
        assertEquals(testEmp.name, "John");
        assertEquals(testEmp.emailAddress, "john@baeldung.com");
        assertEquals(testEmp.yearOfBirth, 1978);
    }

    private Employee getEmployeeTest() {

        Employee employee = new Employee();
        employee.name = "John";
        employee.emailAddress = "john@baeldung.com";
        employee.yearOfBirth = 1978;

        return employee;
    }
}