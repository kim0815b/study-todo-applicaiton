public class Main {
    public static void main(String[] args) {
        TodoController todoController = new TodoController();

        try {
            todoController.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}