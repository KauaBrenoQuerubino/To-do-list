import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Visualizar tarefa");
            System.out.println("3. completar tarefa");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (choice) {
                case 1:
                    System.out.print("Descricao da Tarefa: ");
                    String description = scanner.nextLine();
                    System.out.print("Escreva a data (DD-MM-YYYY): ");
                    String dueDate = scanner.nextLine();
                    taskManager.addTask(new Task(description, dueDate));
                    break;
                case 2:
                    for (int i = 0; i < taskManager.getTasks().size(); i++) {
                        System.out.println(i + ": " + taskManager.getTasks().get(i));
                    }
                    break;
                case 3:
                    System.out.print("Escolha a lista que voce quer marcar como completa: ");
                    int completeIndex = scanner.nextInt();
                    taskManager.completeTask(completeIndex);
                    break;
                case 4:
                    System.out.print("Digite o numero da Tarefa que voce quer remover: ");
                    int removeIndex = scanner.nextInt();
                    taskManager.removeTask(removeIndex);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valor invalido, tente novamente:");
                    break;
            }
        }
    }
}
