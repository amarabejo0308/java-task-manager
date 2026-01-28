package service;

import model.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

  @Test
  void testAddTask() {
      TaskService service = new TaskService();
      Task task = new Task(1, "Test task", "OPEN");

    service.addTask(task);

    assertEquals(1, service.getAllTasks().size());
}
  @Test
  void testUpdateTaskStatus(){
    TaskService service = new TaskService();
    Task task = new Task(1, "Test task", "OPEN");

    service.addTask(task);
    service.updateTaskStatus(1, "COMPLETED");

    assertEquals("COMPLETED", service.getTaskById(1).getStatus());
  }
}
