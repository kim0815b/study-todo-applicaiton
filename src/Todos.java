import java.util.Map;

public class Todos {

	Map<String, Todo> todos;

	public Todos(Map<String, Todo> todos) {
		this.todos = todos;
	}

	public void addTodo(String userName, Todo todo) {
		todos.put(userName, todo);
	}

	public Map<String, Todo> getTodos() {
		return todos;
	}

}
