import model.Task;
import service.TaskService;

public class Main{
  public static void main(String[] args){
    TaskService service = new TaskService();
    
    service.addTask(new Task(1, "Learn Java backend", "OPEN"));
    service.addTask(new Task(2, "Build portfolio project", "IN_PROGRESS"));
    
    for (Task task : service.getAllTasks()){
      System.out.println(task.getId() + " - " + task.getTitle() + " [" + task.getStatus() + "]");
    }
  }
}
