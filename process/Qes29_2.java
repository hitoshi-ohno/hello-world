package process;

import java.util.Arrays;

public class Qes29_2 {

	/*
	 	
	 	0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"
	 	
	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
	
	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2
	
	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2
		
	 */

	// フィールドに入力する数値の変数を宣言
	private String inputNum;

	// 入力する数値のgetterメソッド
	public String getInputNum() {
		return inputNum;
	}

	// 入力する数値のsetterメソッド
	public void setInputNum(String inputNum) {
		this.inputNum = inputNum;
	}

	public void output() {

		// 入力した数値を","で区切って格納
		String[] input = this.inputNum.split(",");

		// 格納した数値を昇順にする
		Arrays.sort(input);

		// 整数型変数を宣言し、配列の要素を出力する際に使用
		int count = 0;

		// 文字列型変数を宣言し、北海道の情報を格納
		String str0 = "北海道:札幌市:83424";

		// 文字列型変数を宣言し、青森県の情報を格納
		String str1 = "青森県:青森市:9646";

		// 文字列型変数を宣言し、岩手県の情報を格納
		String str2 = "岩手県:盛岡市:15275";

		// 文字列型変数を宣言し、宮城県の情報を格納
		String str3 = "宮城県:仙台市:7282";

		// 文字列型変数を宣言し、秋田県の情報を格納
		String str4 = "秋田県:秋田市:11638";

		// 文字列型変数を宣言し、山形県の情報を格納
		String str5 = "山形県:山形市:9323";

		// 文字列型変数を宣言し、福島県の情報を格納
		String str6 = "福島県:福島市:13784";

		// 文字列型変数を宣言し、茨城県の情報を格納
		String str7 = "茨城県:水戸市:6097";

		// 文字列型変数を宣言し、栃木県の情報を格納
		String str8 = "栃木県:宇都宮市:6408";

		// 文字列型変数を宣言し、群馬県の情報を格納
		String str9 = "群馬県:前橋市:6362";

		// 文字列型変数を宣言し、埼玉県の情報を格納
		String str10 = "埼玉県:さいたま市:3798";

		// 配列を宣言し、区切り文字を指定して都道府県の情報を格納
		String[] city0 = str0.split(":");
		String[] city1 = str1.split(":");
		String[] city2 = str2.split(":");
		String[] city3 = str3.split(":");
		String[] city4 = str4.split(":");
		String[] city5 = str5.split(":");
		String[] city6 = str6.split(":");
		String[] city7 = str7.split(":");
		String[] city8 = str8.split(":");
		String[] city9 = str9.split(":");
		String[] city10 = str10.split(":");

		// for文を記述し、都道府県の情報を繰り返し出力
		for (int i = 0; i < input.length; i++) {

			switch (input[count]) {

			// 入力した値が“0”の場合の処理を記述
			case "0":
				System.out.println("都道府県名：" + city0[0]);
				System.out.println("　　県庁所在地：" + city0[1]);
				System.out.println("　　面積：" + city0[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“1”の場合の処理を記述
			case "1":
				System.out.println("都道府県名：" + city1[0]);
				System.out.println("　　県庁所在地：" + city1[1]);
				System.out.println("　　面積：" + city1[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“2”の場合の処理を記述
			case "2":
				System.out.println("都道府県名：" + city2[0]);
				System.out.println("　　県庁所在地：" + city2[1]);
				System.out.println("　　面積：" + city2[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“3”の場合の処理を記述
			case "3":
				System.out.println("都道府県名：" + city3[3]);
				System.out.println("　　県庁所在地：" + city3[1]);
				System.out.println("　　面積：" + city3[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“4”の場合の処理を記述
			case "4":
				System.out.println("都道府県名：" + city4[0]);
				System.out.println("　　県庁所在地：" + city4[1]);
				System.out.println("　　面積：" + city4[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“5”の場合の処理を記述
			case "5":
				System.out.println("都道府県名：" + city5[0]);
				System.out.println("　　県庁所在地：" + city5[1]);
				System.out.println("　　面積：" + city5[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“6”の場合の処理を記述
			case "6":
				System.out.println("都道府県名：" + city6[0]);
				System.out.println("　　県庁所在地：" + city6[1]);
				System.out.println("　　面積：" + city6[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“7”の場合の処理を記述
			case "7":
				System.out.println("都道府県名：" + city7[0]);
				System.out.println("　　県庁所在地：" + city7[1]);
				System.out.println("　　面積：" + city7[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“8”の場合の処理を記述
			case "8":
				System.out.println("都道府県名：" + city8[0]);
				System.out.println("　　県庁所在地：" + city8[1]);
				System.out.println("　　面積：" + city8[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“9”の場合の処理を記述
			case "9":
				System.out.println("都道府県名：" + city9[0]);
				System.out.println("　　県庁所在地：" + city9[1]);
				System.out.println("　　面積：" + city9[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が“10”の場合の処理を記述
			case "10":
				System.out.println("都道府県名：" + city10[0]);
				System.out.println("　　県庁所在地：" + city10[1]);
				System.out.println("　　面積：" + city10[2] + ".0km2" + "\n");
				count++;
				break;

			// 入力した値が上記以外の場合の処理を記述
			default:
				System.out.println("指定の値ではありません" + "\n");
				count++;

			}

		}

	}

}
