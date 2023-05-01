package curriculum_New_question;

public class Curriculum_New_1_5 {

    public static void main(String[] args) {
    	
        // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  ローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

    	// Q1を下記に記載
    	String name = "山田太郎";
    	String age = "18歳";
    	String height = "170.5cm";
    	String weight = "62.2kg";
    	String food = "寿司";
    	
    	System.out.println("「初めまして" + name + "です」");
    	System.out.println("「年齢は" + age + "です」");
    	System.out.println("「身長は" + height + "です」");
    	System.out.println("「体重は" + weight + "です」");
    	System.out.println("「好きな食べ物は" + food + "です」");

        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
    	double w = 62.2;
    	double h = 1.705;
    	String BMI = String.format("%.1f",(w / h / h));
    	
    	System.out.println("「BMIは" + BMI + "です」");
    	    	
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
    	name = "鈴木一郎";
    	age = "24歳";
    	height = "168.5cm";
    	weight = "64.2kg";
    	food = "オムライス";
    	
    	System.out.println("「初めまして" + name + "です」");
    	System.out.println("「年齢は" + age + "です」");
    	System.out.println("「身長は" + height + "です」");
    	System.out.println("「体重は" + weight + "です」");
    	System.out.println("「好きな食べ物は" + food + "です」");
    	
    	w = 64.2;
    	h = 1.685;
    	BMI = String.format("%.1f",(w / h / h));
    	
    	System.out.println("「BMIは" + BMI + "です」");

    	
    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
    	 
     }

}