package com.example.Springboot.DB.tasks;

import com.example.Springboot.DB.common.BaseEntity;
import com.example.Springboot.DB.note.NotesEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity(name="tasks")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskEntity extends BaseEntity {

    @Column(name="name",nullable = false)
     String name;

    @Column(name = "due_Date",nullable = false)
     Date dueDate;

    @Column(name="done",nullable = false,columnDefinition = "boolean default false")
    boolean done;

    @OneToMany(mappedBy = "task",cascade = CascadeType.ALL)
    @ToString.Exclude
    List<NotesEntity>notes;
}
