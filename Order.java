/*
 * プログラム名：書籍管理システムWeb版Ver.2.0
 * プログラムの説明：書籍の管理を行なうプログラム。
 * 					登録した書籍の一覧、新規書籍の登録、書籍詳細確認、書籍データの削除
 * 					登録書籍のデータの変更、書籍の検索機能を持っている。
 *					Ver.1.0から書籍の購入、購入確認のメール送信、購入状況の確認機能を追加
 * 作成者：南里悠介
 * 作成日付：2022年06月06日
 */
package bean;

public class Order {

	//注文情報に関するフィールド変数の宣言
	private int orderno;
	private String userid;
	private String isbn;
	private String date;

	//フィールド変数の初期化（コンストラクタ引数無し）
	public Order() {
		orderno = 0;
		userid = null;
		isbn = null;
	}

	//各フィールド変数のアクセサメソッド
	//注文No
	public void setOrderNo(int orderno) {
		this.orderno = orderno;
	}

	public int getOrderNo() {
		return this.orderno;
	}
	//ユーザーID
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	//ISBN
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	//購入日
	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}

	//数量
	//このプロジェクトでは数量は１固定
	public int getQuantity() {
		return 1;

	}

}
