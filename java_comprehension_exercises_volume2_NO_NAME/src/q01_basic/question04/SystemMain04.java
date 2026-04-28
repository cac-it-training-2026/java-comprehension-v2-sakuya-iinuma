package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		//TODO ここから実装する
		Member[] members = {
				new Member(1, "Password", "Miura Manabu", 28, 2),
				new Member(2, "aaaAAA", "Sato Kensuke", 43, 1)
		};

		MemberManager.showAllMembers(members);

	}

}
