package com.example.Springboot.DB.tasks;

import lombok.Data;
import org.springframework.lang.Nullable;

import java.util.Date;

@Data
public class TaskDto {
    @Nullable
    String Name;
    @Nullable
    Date dueDate;
    @Nullable
    Boolean done;
}
