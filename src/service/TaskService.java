package service;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskService{
  private List<Task> tasks = new ArrayList<>();

  //Create
  public void addTask(Task task){
    if (task == null || task.getTitle() == null || task.getTitle().isEmpty()){
      System.out.println("Invalid task. Title is required.");
      return;
    }
    tasks.add(task);
  }

  //Read
  public List<Task> getAllTasks(){
    return tasks;
  }

  public Task getTaskById(int id){
    for (Task task : tasks){
      if (task.getId() == id){
        return task;
      }
    }
    return null;
}
  
//Update
public void updateTaskStatus(int id, String newStatus){
  Task task = getTaskById(id);
  if (task == null) {
    System.out.println("Task not found.");
    return;
  }
  task.setStatus(newStatus);
}
  //Delete
public void deleteTask(int id){
  Task task = getTaskById(id);
  if (task == null){
    System.out.println("Task not found.");
    return;
  }
  task.remove(task);
}
