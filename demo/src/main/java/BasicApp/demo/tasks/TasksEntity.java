package BasicApp.demo.tasks;

import BasicApp.demo.notes.NotesEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TasksEntity {
    Integer id;
    String name;
    Date dueDate;
    Boolean completed;
    List<NotesEntity>notes;
}
