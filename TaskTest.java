package Contact;

import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class TaskTest {
    
    @Test
    public void testGetTaskId() {
        Task task = new Task("1", "Task 1", "Description 1");
        Assert.assertEquals("1", task.getTaskId());
       
    }
    
    @Test
    public void testGetName() {
        Task task = new Task("1", "Task 1", "Description 1");
        
        Assert.assertEquals("Task 1", task.getName());
        
    }
    
    @Test
    public void testGetDescription() {
        Task task = new Task("1", "Task 1", "Description 1");
       
        Assert.assertEquals("Description 1", task.getDescription());
    }
    
  //setters
  	@Test
  	public void testSetName() {
  		Task task = new Task("1","Task 1","Description 1");
  		task.setName("Task 1");
  		Assert.assertEquals("Task 1",task.getName());
  	}
  	
  	@Test
	public void testSetDescription() {
		Task task = new Task("1","Task 1","Description 1");
		task.setDescription("Description 1");
		Assert.assertEquals("Description 1",task.getDescription());
	}
  	
  //string length
  	@Test
  	public void testTaskIdTooLong() {
  		Assertions.assertThrows(IllegalArgumentException.class,
  				()->new Task("12345678901","Task 1","Description 1"));
  		
  	}
  	
  	@Test
	public void testSetTooLongName() {
		Task task = new Task("1","Task is too long  ","Description 1"); 
		task.setName("Task is too long");
		Assert.assertEquals("Task is too long",task.getName());
	}
  	
  	@Test
	public void testSetTooLongDescription() {
		Task task = new Task("1","Task 1","Long description but meets requirements"); 
		task.setDescription("Long description but meets requirements");
		Assert.assertEquals("Long description but meets requirements", task.getDescription());
	}
  	
  //test null
  	@Test
  	public void testTaskIdNull() {
  		Task task = new Task("1","Task 1","Description 1");  
  		Assertions.assertThrows(IllegalArgumentException.class,
  				//()->new Task("1","Task 1","Description 1"));
  				()->task.setTaskId(null));
  	}
  	
  	@Test
	public void testTaskNameNull() {
		Task task = new Task("1","Task 1","Description 1"); 
		Assertions.assertThrows(IllegalArgumentException.class,
				()->task.setName(null));
	}
  	
  	@Test
	public void testTaskDescription() {
  		Task task = new Task("1","Task 1","Description 1");
  		Assertions.assertThrows(IllegalArgumentException.class, 
			()->task.setDescription(null));
	}
  	
  	
    
}




