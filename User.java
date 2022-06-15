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

public class User {

	//	ユーザー情報に関するフィールド変数の宣言
	private String userid;
	private String password;
	private String email;
	private String authority;

	//フィールド変数の初期化（コンストラクタ)
	public User() {
		userid = null;
		password = null;
		email = null;
		authority = null;
	}

	//各フィールド変数のアクセサメソッドの作成
	//ユーザーID
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}
	//パスワード
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	//メールアドレス
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}
	//著者
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return this.authority;
	}

}
