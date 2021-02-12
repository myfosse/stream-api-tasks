import converter.TaskConverter;
import entity.Task;
import worker.TaskWorker;

import java.util.List;

/**
 * @author Andrei Yahorau
 */
public class TaskForReadDtoStart {
  public static void main(String[] args) {

    final List<Task> tasks = TaskWorker.generateListOfTasks();

    System.out.println(tasks.toString());

    System.out.println(
            TaskConverter.convertListOfTaskToListOfTaskDto(tasks));
  }
}
