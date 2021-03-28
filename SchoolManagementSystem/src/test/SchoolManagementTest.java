package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import schoolManagment.Class;
import schoolManagment.School;
import schoolManagment.Teacher;

class SchoolManagementTest {

	@Test
	void testCreateSchool(){
        School school = new School("QueensChapel");
        assertEquals("QueensChapel", school.getSchoolName());
    }
	
	@Test
	void testAddSecondTeacherToClass(){
		Class classA = new Class("G1A");
		assertEquals(true, classA.addTeacher(new Teacher("Joe", "Cardinas")));
		assertEquals(false, classA.addTeacher(new Teacher("Angela", "Lee")));
    }
	
	@Test
	void testSetSalary(){
		Teacher t1 = new Teacher("Virginia", "Jackson");
		assertEquals(false, t1.setSalary(0));
		assertEquals(true, t1.setSalary(2500));
    }

}
