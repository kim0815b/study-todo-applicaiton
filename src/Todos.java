import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todos {

	Map<String, Todo> todos;

	public Todos() {
		this.todos = new HashMap<>();
	}

	public void addTodo(String userName, Todo todo) {
		todos.put(userName, todo);
	}

	public Map<String, Todo> getTodos() {
		return todos;
	}

	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder("참여자별 ToDo list 진행 현황\n");

		List<String> userNames = todos.keySet()
			.stream()
			.sorted()
			.toList();

		for (String userName : userNames) {
			stringBuilder.append(todos.get(userName)).append('\n');
		}
		return  stringBuilder.toString();
	}
}
