import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TodoController {

	public void run() throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Status 기호 : 완료, 미정 -> 번호 선택 시 자동 부여\n"
			+ "진행 기호 : c - 계속 입력, q - 다음 참여자로 넘기기, x - 모든 입력 종료"
		);
		System.out.println();

		Todos todos = new Todos();

		Loop:
		while (true) {

			System.out.print("Input Your Name: ");
			String userName = bufferedReader.readLine();
			Todo todo = new Todo(userName);

			while (true) {
				System.out.println("ToDo List 중 하나 선택 하세요!");

				for (int i = 0; i < 5; i++) {
					System.out.println((i + 1) + ". " + todo.getTodoName(i));
				}

				System.out.print("Title 번호 : ");
				int todoNum = Integer.parseInt(bufferedReader.readLine());
				todo.add(todoNum);
				System.out.println("Status : " + todo.getStatusName(1));

				System.out.print("종료 여부 : ");
				String command = bufferedReader.readLine();
				System.out.println();

				if (command.equalsIgnoreCase("x")) {
					System.out.println("-----------------");
					break Loop;
				}

				if (todo.isFinish(command)) {
					todos.addTodo(todo.getUserName(), todo);
					System.out.println("-----------------");
					break;
				}

			}
		}

		System.out.println(todos);

	}
}
