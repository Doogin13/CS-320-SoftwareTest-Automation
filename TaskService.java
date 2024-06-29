package Contact;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<String, Task> tasks;

    public TaskService() {
        this.tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    public void deleteTask(String taskId) {
        tasks.remove(taskId);
    }

    public void updateTaskName(String taskId, String newName) {
        Task task = tasks.get(taskId);
        if (task != null) {
            task.setName(newName);
        }
    }

    public void updateTaskDescription(String taskId, String newDescription) {
        Task task = tasks.get(taskId);
        if (task != null) {
            task.setDescription(newDescription);
        }
    }

    public Task getTask(String taskId) {
        return tasks.get(taskId);
    }
}