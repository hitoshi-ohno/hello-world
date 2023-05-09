package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		
		// Q1 下記9個をローカル変数として宣言のみしてください
		// ・バイト型・短整数型・整数型・長整数型	
		// ・単精度浮動小数点数型・倍精度浮動小数点数型
		// ・文字型・文字列型
		// ・ブーリアン型
		
		byte b;
   	 	short s;
   	 	int i;
   	 	long l;
   	 	float f;
   	 	double d;
   	 	char c;
   	 	String st; 
   	 	boolean bo;
   	 	
   	 	// Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
   	 	
	   	 b = 0;
		 s = 0;
		 i = 0;
		 l = 0L;
		 f = 0.0f;
		 d = 0.0d;
		 c = '\u0000';
		 st = null; 
		 bo = false;
   	 	
		 // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		 // ・バイト型				10
		 // ・短整数型				100
		 // ・整数型				1000
		 // ・長整数型				10000
		 // ・単精度浮動小数点数型	9.5
		 // ・倍精度浮動小数点数型	10.5
		 // ・文字型	 			a
		 // ・文字列型				ハロー
		 // ・ブーリアン型			true

		 b = 10;
    	 s = 100;
    	 i = 1000;
    	 l = 10000;
    	 f = 9.5f;
    	 d = 10.5;
    	 c = 'a';
    	 st = "ハロー";
    	 bo = true;
    	 
  		 // Q4 下記の通りにコンソール出力されるようにしてください
		 // 上記で作成した変数を必ず使用すること
		 // 11110	
		 // 20	
		 // a ハロー true	
		 // 11130			数字を全て足す
		 // 10000000000		小数点以外の数字を全てかける
		 // 0.105			10.5割る100をする
		 // -90				10引く100をする

    	 System.out.println( b + s + l + i);
    	 System.out.println( f + d);
    	 System.out.println( c + " " + st + " " + bo);
    	 System.out.println( b + s + l + i + f + d);
    	 System.out.println( b * s * l * i);
    	 System.out.println( d / s);
    	 System.out.println( b - s);

    	 // Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	 // 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
    	 
    	 // String num = "20";
    	 int num = 20;
    	 int num1 = 23;
    	 System.out.println("ハローJAVA" + (num + num1));

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

    	 System.out.println("「初めまして" + name + "です」");
    	 System.out.println("「年齢は" + age + "歳です」");
    	 System.out.println("「身長は" + height + "cmです」");
    	 System.out.println("「体重は" + weight + "kgです」");
    	 System.out.println("「好きな食べ物は" + food + "です」");

    	 // Q7 Q6で作成した自己紹介に続いてBMIが出力されるようにしてください
    	 // 「BMIは○○です」
    	 // ただし計算は数値を直書きせず、全て変数を使ってすること


    	 String BMI = String.format("%.1f",(weight / (height / 100) / (height / 100)));

    	 System.out.println("「BMIは" + BMI + "です」");
    	 
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

    	 System.out.println("「初めまして" + name + "です」");
    	 System.out.println("「年齢は" + age + "歳です」");
    	 System.out.println("「身長は" + height + "cmです」");
    	 System.out.println("「体重は" + weight + "kgです」");
    	 System.out.println("「好きな食べ物は" + food + "です」");


    	 BMI = String.format("%.1f",(weight / (height / 100) / (height / 100)));

    	 System.out.println("「BMIは" + BMI + "です」");


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
    	 
    	 System.out.println("「初めまして" + name + "です」");
    	 System.out.println("「年齢は" + age + "歳です」");
    	 System.out.println("「身長は" + height + "cmです」");
    	 System.out.println("「体重は" + weight + "kgです」");
    	 System.out.println("「好きな食べ物は" + food + "です」");
    	 
    	 BMI = String.format("%.2f",(weight / (height / 100) / (height / 100)));

    	 System.out.println("「BMIは" + BMI + "です」");

    	 // Q10 Q8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
    	 
    	 boolean isOverTwentyfiveage;
    	 isOverTwentyfiveage = (age >= 25);
    	 
    	 System.out.println(isOverTwentyfiveage);
    	 
    	 // Q11 Q8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
    	 
    	 String str_age = String.valueOf(age);
    	 String str_height = String.valueOf(height);
    	 String str_weight = String.valueOf(weight);
    	 
    	 System.out.println(str_age + str_height + str_weight);

    	 // Q12 Q11で変換した【年齢・身長】を整数型に変換して出力してください
    	     	     	 
    	 int int_age = Integer.parseInt(str_age);
    	 double double_height = Double.parseDouble(str_height);
    	 
    	 System.out.println(int_age);
    	 System.out.println(double_height);
    	 
    	 // Q13 Q12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
    	 // ただしif文は使わないでください
    	 
    	 boolean ageOrHeight;
    	 ageOrHeight = (int_age >= 25 || double_height >= 160);
    	 System.out.println(ageOrHeight);


    	 
    	 






	}

}
