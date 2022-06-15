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

public class OrderedItem {

	//フィールド変数の宣言
	private String userid;
	private String title;
	private String date;

	//コンストラクタ（変数の初期化）
	public OrderedItem() {
		this.userid = null;
		this.title = null;
		this.date = null;
	}

	//各フィールド変数のアクセサメソッド
	//userid
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return this.userid;
	}
	//タイトル
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}
	//購入日付
	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}
}
