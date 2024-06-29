package Contact;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        taskService = new TaskService();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("T123", "Task Name", "Task Description");
        taskService.addTask(task);

        Assertions.assertEquals(task, taskService.getTask("T123"));
    }

    @Test
    public void testDeleteTask() {
        Task task = new Task("T123", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.deleteTask("T123");

        Assertions.assertNull(taskService.getTask("T123"));
    }

    @Test
    public void testUpdateTaskName() {
        Task task = new Task("T123", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.updateTaskName("T123", "New Task Name");

        Assertions.assertEquals("New Task Name", taskService.getTask("T123").getName());
    }

    @Test
    public void testUpdateTaskDescription() {
        Task task = new Task("T123", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.updateTaskDescription("T123", "New Task Description");

        Assertions.assertEquals("New Task Description", taskService.getTask("T123").getDescription());
    }
}



