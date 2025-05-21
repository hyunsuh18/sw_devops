package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	StudentManager sManager;

	@BeforeEach
	void setUp() throws Exception {
		sManager = new StudentManager();
	}

	@Test
	void testAddStudent() {
		sManager.addStudent("이현서");
		assertTrue(sManager.hasStudent("이현서"));
	}

	@Test
	void testRemoveStudent() {
		sManager.addStudent("이현서");
		sManager.removeStudent("이현서");
		assertFalse(sManager.hasStudent("이현서"));
	}
	
	@Test
	void addExceptionTest() {
		sManager.addStudent("이현서");
		assertThrows(IllegalArgumentException.class, () -> sManager.addStudent("이현서"));
	}
	
	@Test
	void removeExceptionTest() {
		assertThrows(IllegalArgumentException.class, () -> sManager.removeStudent("이현서"));
	}

}
