package BasicApp.demo.tasks;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TasksService {
    List<TasksEntity> tasks;
    public TasksService() {
        this.tasks=new ArrayList<>();
    }
    //Get all tasks
    public List<TasksEntity> getAllTasks() {
        return tasks;
    }
    //Create new tasks
    public void createTask(String name, Date dueDate) {
        int newTaskId= tasks.size();
        TasksEntity task=new TasksEntity(newTaskId,name,dueDate,false,new ArrayList<>());
        tasks.add(task);
    }
    //Get tasks by id
    public TasksEntity getTasksById(int id) {
        return tasks.get(id);
    }
    //Delete a task by Id
    public TasksEntity deleteTasksById(int id) {
        return tasks.remove(id);
    }
    //update task by Id
    public void updateTasksById(int id,String name,Date dueDate,Boolean completed) {
        if(tasks.size() <= id) {
            throw new TaskNotFoundException(id);
        }
        TasksEntity task =tasks.get(id);
       // task.setName(name);
        if(name!=null) {
            task.setName(name);
        }
        //task.setDueDate(dueDate);
        if(dueDate!=null) {
            task.setDueDate(dueDate);
        }
        //task.setCompleted(completed);
        if(completed!=null) {
            task.setCompleted(completed);
        }
    }
    static class TaskNotFoundException extends IllegalArgumentException {
        public TaskNotFoundException(int taskId) {
            super("Task with Id =" + taskId + "not found");
        }
    }
}
