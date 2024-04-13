package com.example.Springboot.DB.tasks;

import com.example.Springboot.DB.tasks.TaskEntity;
import com.example.Springboot.DB.tasks.TasksRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.security.PublicKey;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class TasksRepositoryTests {
    @Autowired private TasksRepository tasksRepository;

    @Test
    public void canCreateTask() {
        TaskEntity task= new TaskEntity();
        task.name="test task";
        task.dueDate=new Date();
        tasksRepository.save(task);
        TaskEntity savedTask=tasksRepository.findAll().get(0);
        assertEquals("test task",tasksRepository.findAll().get(0).name);
        System.out.println(savedTask);
    }
}
