package process;

import java.util.Arrays;
import java.util.Collections;

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

	// フィールドに昇順、降順を判定する数値の変数を宣言
	private int sortBy;

	// フィールドに昇順、降順を判定する数値のgetterメソッド
	public int getSortBy() {
		return sortBy;
	}

	// フィールドに昇順、降順を判定する数値のsetterメソッド
	public void setSortBy(int sortBy) {
		this.sortBy = sortBy;
	}

	public void output() {

		// 入力した数値を","で区切って格納
		String[] input = this.inputNum.split(",");

		// if文を記述し、昇順か降順かを判定
		if (this.sortBy == 0) {

			// 格納した数値を昇順にする
			Arrays.sort(input);

		} else if (this.sortBy == 1) {

			// 格納した数値を降順にする
			Arrays.sort(input, Collections.reverseOrder());

		} else {

			// 入力した値が0か1でない場合に出力
			System.out.println("0か1を入力してください");

			// 入力した値が0か1でない場合、処理を停止
			System.exit(0);

		}

		String[] prefectures = { "北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275", "宮城県:仙台市:7282",
				"秋田県:秋田市:11638", "山形県:山形市:9323", "福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362", "埼玉県:さいたま市:3798" };

		for (int i = 0; i < input.length; i++) {

			int number = Integer.parseInt(input[i]);
			String[] city = prefectures[number].split(":");

			System.out.println("都道府県名：" + city[0]);
			System.out.println("　　県庁所在地：" + city[1]);
			System.out.println("　　面積：" + city[2] + ".0km2" + "\n");

		}

	}

}
