package com.example.Springboot.DB.tasks;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {
    private TasksRepository tasksRepository;
    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository=tasksRepository;
    }
    public List<TaskEntity> getAllTasks() {
        return tasksRepository.findAll();
    }
    public TaskEntity getTaskById(Long id){
        return tasksRepository.findById(id).orElse(null);
    }
    public TaskEntity createNewTask(TaskDto task) {
         var tasksEntity= new TaskEntity();
         tasksEntity.setName(task.getName());
         tasksEntity.setDueDate(task.getDueDate());
         tasksEntity.setDone(task.getDone());
         return tasksRepository.save(tasksEntity);
    }
}
