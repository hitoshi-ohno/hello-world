package Curriculum_1_31;

public class Vehicle {

	// 問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
	private String owner;

	// 問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。

	// ownerフィールドのゲッター「getOwner」を定義
	public String getOwner() {
		return owner;
	}

	// ownerフィールドのセッター「setOwner」を定義
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
