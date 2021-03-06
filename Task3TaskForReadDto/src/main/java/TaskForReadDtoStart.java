import static converter.TaskConverter.*;
import static worker.TaskWorker.*;

import entity.Task;

import java.util.List;

/** @author Andrei Yahorau */
public class TaskForReadDtoStart {
  public static void main(String[] args) {

    final List<Task> tasks = generateListOfTasks();

    System.out.println(tasks);

    System.out.println(convertListOfTaskToListOfTaskDto(tasks));
  }
}
