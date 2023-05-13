package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		// Q1 下記9個をローカル変数として宣言のみしてください
		// ・バイト型・短整数型・整数型・長整数型	
		// ・単精度浮動小数点数型・倍精度浮動小数点数型
		// ・文字型・文字列型
		// ・ブーリアン型

		byte by;
		short sh;
		int in;
		long lo;
		float fl;
		double dou;
		char ch;
		String st; 
		boolean bo;
		// それぞれの役割を分かりやすくする為、それぞれの型名の先頭2文字を変数名として宣言。
		// 倍精度浮動小数点数型は上記のように変数名を宣言するとエラーが発生する為、型名の先頭3文字を変数名として宣言。


		// Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください

		by = 0;
		sh = 0;
		in = 0;
		lo = 0L;
		fl = 0.0f;
		dou = 0.0d;
		ch = '\u0000';
		st = null; 
		bo = false;
		// Q1で宣言したローカル変数に初期値を代入。 


		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		// ・バイト型				10
		// ・短整数型				100
		// ・整数型					1000
		// ・長整数型				10000
		// ・単精度浮動小数点数型	9.5
		// ・倍精度浮動小数点数型	10.5
		// ・文字型	 				a
		// ・文字列型				ハロー
		// ・ブーリアン型			true

		by = 10;
		sh = 100;
		in = 1000;
		lo = 10000L;
		fl = 9.5f;
		dou = 10.5d;
		ch = 'a';
		st = "ハロー";
		bo = true;
		// それぞれの変数に指定の値を代入。


		// Q4 下記の通りにコンソール出力されるようにしてください
		// 上記で作成した変数を必ず使用すること
		// 11110	
		// 20	
		// a ハロー true	
		// 11130			数字を全て足す
		// 10000000000		小数点以外の数字を全てかける
		// 0.105			10.5割る100をする
		// -90				10引く100をする

		System.out.println( by + sh + in + lo);
		System.out.println( fl + dou);
		System.out.println( ch + " " + st + " " + bo);
		System.out.println( by + sh + in + lo + fl + dou);
		System.out.println( by * sh * in * lo);
		System.out.println( dou / sh);
		System.out.println( by - sh);
		System.out.println();
		// 指示通りにコンソール出力されるように記述。


		// Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。

		// String num = "20";
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		System.out.println();
		// 最初に記述されているString型の場合は文字データになってしまい、
		// num1との合算が出来ない為、numをint型で記述をすることでnum1と合算出来るように修正。
		

		// Q6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		//
		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」

		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		// 『』で囲われた人の情報を変数に代入。

		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");
		System.out.println();
		// formatの通りコンソールに出力。
		

		// Q7 Q6で作成した自己紹介に続いてBMIが出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること

		int hundred = 100;
		// BMIの計算に利用する数値を変数に代入。

		String BMI = String.format("%.1f",(weight / (height / hundred) / (height / hundred)));
		// BMIの計算を変数に代入。

		System.out.println("「BMIは" + BMI + "です」");
		System.out.println();
		// BMIの計算結果を出力。
		

		// Q8 Q6で宣言した変数に再代入し下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です

		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		// Q6で宣言した変数に再代入。

		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");
		// 再代入した変数を使用してコンソールに出力。

		BMI = String.format("%.1f",(weight / (height / hundred) / (height / hundred)));
		// 再代入した変数を使用して、BMIの計算を変数に代入。

		System.out.println("「BMIは" + BMI + "です」");
		System.out.println();
		// BMIの計算結果を出力。


		// Q9 Q8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		//  初めまして鈴木一郎です
		//  年齢は48歳です
		//  身長337.0cmです
		//  体重は128.4kgです
		//  好きな食べ物はオムライスです
		//  BMIは11.31です

		age += 24; 
		height += 168.5;
		weight += 64.2;
		// Q8で使用した変数【年齢・身長・体重】の数値を和算で自己代入。

		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");
		// 和算で自己代入した変数を使用してコンソール出力。

		BMI = String.format("%.2f",(weight / (height / hundred) / (height / hundred)));
		// 和算で自己代入した変数を使用して、BMIの計算を変数に代入。

		System.out.println("「BMIは" + BMI + "です」");
		System.out.println();
		// BMIの計算結果を出力。


		// Q10 Q8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません

		age = 24;
		// Q9の時点で、Q8で使用した変数に変更を加えている為、Q8の時点の値に戻す。

		boolean isOverTwentyfiveage;
		isOverTwentyfiveage = (age >= 25);
		// boolean型の変数を宣言し、25歳以上ならtrueが出力されるように記述。

		System.out.println(isOverTwentyfiveage);
		System.out.println();
		// 変数の出力。
		

		// Q11 Q8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		height = 168.5;
		weight = 64.2;
		// Q9の時点で、Q8で使用した変数に変更を加えている為、Q8の時点の値に戻す。

		String str_age = String.valueOf(age);
		String str_height = String.valueOf(height);
		String str_weight = String.valueOf(weight);
		// 【年齢・身長・体重】を文字列型に型変換

		System.out.println(str_age + str_height + str_weight);
		System.out.println();
		// 文字列型に型変換した【年齢・身長・体重】を出力。


		// Q12 Q11で変換した【年齢・身長】を整数型に変換して出力してください

		int int_age = Integer.parseInt(str_age);
		int int_height = (int)Double.parseDouble(str_height);
		// Q11で変換した【年齢・身長】を整数型に変換。

		System.out.println(int_age);
		System.out.println(int_height);
		System.out.println();
		// 整数型に変換した【年齢・身長】を出力。
		

		// Q13 Q12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		// ただしif文は使わないでください

		boolean ageOrHeight;
		ageOrHeight = (int_age >= 25 || int_height >= 160);
		// boolean型の変数を宣言し、Q12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueが出力されるように記述。
		
		System.out.println(ageOrHeight);
		System.out.println();
		// 変数の出力。


	}

}
