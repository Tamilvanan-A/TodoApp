package com.example.Springboot.DB.note;

import com.example.Springboot.DB.common.BaseEntity;
import com.example.Springboot.DB.tasks.TaskEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity(name = "notes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NotesEntity extends BaseEntity {
    @Column(name = "title", nullable = false,length = 100)
    String title;

    @Column(name = "body",nullable = false,length = 1000)
    String body;

    @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "task id")
    TaskEntity task;
}
