package basicClass;

// java.time.LocalDateTimeパッケージ利用の宣言
import java.time.LocalDateTime;
// java.time.format.DateTimeFormatterパッケージ利用の宣言
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// Dogクラスを呼び出し、変数に動物の名前、動物の数を代入
		Dog dog = new Dog("犬", 2);

		// 動物の名前を出力
		dog.name();

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// 動物の数を出力
		dog.animal_count();

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在日時を取得
		LocalDateTime date = LocalDateTime.now();

		// 表示形式を「yyyy-MM-dd H:m:s」に指定
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");

		// 文字列型変数を宣言し、表示形式を指定した現在日時を代入
		String date_format = dtformat.format(date);

		// 現在日時を出力
		System.out.println(date_format);

	}
}
