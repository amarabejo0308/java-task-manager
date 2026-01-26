package service;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskService{
  private List<Task> tasks = new ArrayList<>();
  public void addTask(Task task){
    tasks.add(task);
  }
  public List<Task> getAllTasks(){
    return tasks;
  }
}
