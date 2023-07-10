package execution;

// java.time.LocalDateTimeパッケージ利用の宣言
import java.time.LocalDateTime;
// java.time.format.DateTimeFormatterパッケージ利用の宣言
import java.time.format.DateTimeFormatter;
import java.util.Objects;

// 別パッケージからのクラスの呼び出し
import process.Qes22_2;

public class Qes22_1 {

	/*
	 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
	
	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
	*/

	// 実行用

	public static void main(String[] args) {

		// クラスを呼び出し、値を代入
		Qes22_2 process = new Qes22_2("日本", "寿司", "和食");

		// if文を記述し、nullチェック
		if (Objects.isNull(process.country) || Objects.isNull(process.food) || Objects.isNull(process.meal)) {

			// 値がnullの場合「値を入力してください」と出力
			System.out.println("「値を入力してください」");

		} else {

			// 国名を出力
			process.my_country();

			// 食べ物を出力
			process.like_food();

			// 食べ物の種別を出力
			process.kind_meal();

		}

		// 現在日時を取得
		LocalDateTime date = LocalDateTime.now();

		// 表示形式を「yyyy-MM-dd H:m:s」に指定
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		// 文字列型変数を宣言し、表示形式を指定した現在日時を代入
		String date_format = dtformat.format(date);

		// 現在日時を出力
		System.out.println("今の現在日時は" + date_format + "です");

	}

}
