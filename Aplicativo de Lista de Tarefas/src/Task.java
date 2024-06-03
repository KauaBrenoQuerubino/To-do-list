public class Task {
    private String description;
    private String dueDate;
    private boolean isCompleted;

    public Task(String description, String dueDate) {
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description + " (Data: " + dueDate + ")";
    }
}

