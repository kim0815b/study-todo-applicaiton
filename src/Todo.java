import java.util.List;

public class Todo {

	private static final List<String> todoNames = List.of(
		"주간 보고서 작성",
		"이메일 확인 및 응답",
		"회의 준비",
		"프로젝트 계획서 수정",
		"팀 멤버와의 1:1 면담"
	);

	private static final List<String> statusNames = List.of(
		"완료",
		"미정"
	);

	List<Integer> todo;

	public Todo(List<Integer> todo) {
		this.todo = todo;
	}

	public void add(int todoNum) {
		todo.add(todoNum);
	}

	public String getTodoName(int todoNum) {
		return todoNames.get(todoNum - 1);
	}

	public boolean isContinue(String command) {

		return switch (command.toLowerCase()) {
			case "c" -> true;
			case "q" -> false;
			default -> throw new IllegalArgumentException("Invalid command: " + command);
		};
	}

	public String getStatusName(int statusOption) {
		return statusNames.get(statusOption - 1);
	}

}
