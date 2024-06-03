import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task); //-----> adiciona novas tarefas na Array
    }

    public List<Task> getTasks() {
        return tasks;           //-----> obtem todos as tarefas das listas
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
}
