package BasicApp.demo.tasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {
    private TasksService tasksService;
    public TasksController(TasksService tasksService) {
        this.tasksService=tasksService;
    }
    @GetMapping("/")
    public List<TasksEntity> getAllTasks() {
        return tasksService.getAllTasks();
    }
    @PostMapping("/")
    public void createTask(CreateTaskRequest request) {
        tasksService.createTask(request.getName(),new Date());
    }
}
