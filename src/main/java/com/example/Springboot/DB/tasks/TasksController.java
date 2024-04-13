package com.example.Springboot.DB.tasks;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {
    private TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }
    @GetMapping("")
    ResponseEntity<List<TaskEntity>> getAllTasks() {
        var tasks=tasksService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }
    @PostMapping("")
    void createNewTask(@RequestBody TaskDto task) {}
    @GetMapping("/{id}")
    void getTaskById() {}
    @PatchMapping("/{id}")
    void updateTaskById() {}
}
