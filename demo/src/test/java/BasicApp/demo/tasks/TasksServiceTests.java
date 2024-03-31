package BasicApp.demo.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

public class TasksServiceTests {
    private TasksService tasksService=new TasksService();
    //Create a new task
    @Test
    void canCreateTask() {
        tasksService.createTask("task1",new Date());

        Assertions.assertEquals(1,tasksService.getAllTasks().size());
        Assertions.assertEquals("tasks1",tasksService.getAllTasks().get(0).getName());
    }
}
