import model.Task;
import service.TaskService;

public class Main{
  
  public static void main(String[] args){
    TaskService service = new TaskService();

    //Create
    service.addTask(new Task(1, "Learn Java backend", "OPEN"));
    service.addTask(new Task(2, "Build portfolio project", "IN_PROGRESS"));
    service.addTask(new Task(3, "Prepare for interviews", "OPEN"));

    //Read
    System.out.println("All Tasks:");
    printTasks(service);

    //Update
    service.updateTaskStatus(2, "Completed");
    System.out.println("\nAfter updating task 2:");
    printTasks(service);

    //Delete
    service.deleteTask(1);
    System.out.println("\nAfter deleting task 1:");
    printTasks(service)
}

  private static void printTasks(TaskService service) {
    for (Task task : service.getAllTasks()) {
      System.out.println(task.getId() + " - " + task.getTitle() + " [" + task.getStatus() + "]");
    }
  }
}
