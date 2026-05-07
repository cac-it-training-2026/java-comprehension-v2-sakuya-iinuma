package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する

		try {
			// 9.1.1 会員IDの入力
			System.out.print("input id>>");
			inputId = cr.inputNumber();

			// 9.1.2 パスワードの入力
			System.out.print("input password>>");
			inputPassword = cr.inputString();

		} catch (NumberFormatException e) {
			// 9.1.2.1 数値変換エラー時の処理（"error"と出力してからスタックトレース）
			System.out.println("error!");
			e.printStackTrace();
			return; // 処理を止める
		} catch (IOException e) {
			// 9.1.2.1 入出力エラー時の処理
			e.printStackTrace();
			return; // 処理を止める
		}

		System.out.println("---SHOW MEMBER---");

		// 9.2 Memberオブジェクトの生成
		// id, passwordは入力値、name, age, rankは出力例に合わせた任意の値を設定
		Member member = new Member(inputId, inputPassword, "Miura Manabu", 28, 2);

		// 9.3 ユーザー情報の出力
		member.showMember();
	}
}
