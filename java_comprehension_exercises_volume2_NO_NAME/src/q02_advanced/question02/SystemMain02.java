package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader reader = new ConsoleReader();

		Member member1 = Member.getInstance(1, "Password", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(member1);
		members.add(member2);

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");
		try {
			System.out.println("input target id>>");
			int targetId = reader.inputNumber();

			System.out.println("input new password>>");
			String newPassword = reader.inputString();

			MemberManager.updatePassword(members, targetId, newPassword);

			System.out.println("---SHOW DATA---");
			MemberManager.showAllMembers(members);

		} catch (NumberFormatException | IOException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;

		}
	}
}
