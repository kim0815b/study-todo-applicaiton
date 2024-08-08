import java.util.ArrayList;
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
		"미정",
		"완료"
	);
	private final String userName;
	private final List<Integer> todo;

	public Todo(String userName) {
		this.userName = userName;
		this.todo = new ArrayList<>();
	}

	public String getUserName() {
		return userName;
	}

	public void add(int todoNum) {

		if(todoNum < 1 || 5 < todoNum) {
			throw new IllegalArgumentException("[ERROR] 1~5 사이의 숫자만 입력해주세요");
		}

		todo.add(todoNum - 1);
	}

	public String getTodoName(int todoNum) {
		return todoNames.get(todoNum);
	}

	public boolean isFinish(String command) {

		return switch (command.toLowerCase()) {
			case "c" -> false;
			case "q" -> true;
			default -> throw new IllegalArgumentException("[ERROR] c 또는 q만 입력해주세요");
		};
	}

	public String getStatusName(int statusOption) {
		return statusNames.get(statusOption);
	}

	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder("- " + userName + "\n");

		for (int i = 0; i < 5; i++) {
			stringBuilder.append(i + 1).append(". ").append(todoNames.get(i));
			if (todo.contains(i)) {
				stringBuilder.append(" (").append(getStatusName(1)).append(")").append("\n");
				continue;
			}

			stringBuilder.append(" (").append(getStatusName(0)).append(")").append("\n");

		}

		return stringBuilder.toString();
	}
}
