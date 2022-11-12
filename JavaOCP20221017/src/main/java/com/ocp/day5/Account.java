package com.ocp.day5;

public class Account {
	String accountName; // 用戶名稱
	private int accountBalance; // 帳戶餘額
	public Account(String accountName, int accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	// Deposit
	// 存款
	public boolean deposit(int amount) {
		if(amount > 0) {
			accountBalance += amount;
			return true;
		}
		return false;
	}
	
	// WithDraw
	// 提款
	public boolean withDraw(int amount) {
		if(amount > 0 && amount <= accountBalance) {
			accountBalance -= amount;
			return true;		
		}
		// 提出的錢 >= accountBalance
		if(amount > 0 && amount > accountBalance) {
			// For end-user error message 
			// 給終端使用者看的錯誤訊息
			// Generally speaking, if this error message is NOT sensitive and confidential, 
			// we do write JavaScript to handle with error and present the error message on front-end
			// 一般來說，若錯誤訊息非敏感且機密性的，我們會用 JavaScript 的語法在前端網頁拋出錯誤訊息
			System.out.println("[Error Code: A-0002] Insufficent Account Balance"); 
			// Supposed to show this error message to engineer for debug, 
			// since the error message with covering the variables of programming 
			// 給工程師看的錯誤訊息，因夾帶專業的術語 (在此為變數名稱)，好讓工程師判斷問題的根因
			System.out.println("[Error Code: A-0002-0002] Insufficent Account Balance, because amount > accountBalance");
		}
		// 根本就沒有輸入提錢的 amount 或 輸入提出金額小於 0
		if(amount == 0 | amount < 0) {
			System.out.println("[Error Code: A-0003] The placeholder of withdraw money shall not be empty"); 
			System.out.println("[Error Code: A-0003-0003] The placeholder of withdraw money <= 0");		
		}
		return false;
	}
	
	// To design a method of transfer money
	// 設計一支轉帳 (transfer money) 的方法
	public boolean transferMoney(Account otherAccount, int amount) {
		// Original Account 先提款
		if(withDraw(amount)) {
			// Deposit into otherAccount
			// 轉入到另一個帳戶
			otherAccount.deposit(amount);
			return true;
		}
		// 轉帳失敗，請洽詢客服
		// 本程式在於提交錯誤訊息給客戶
		// 因基於現階段課程尚未教授例外處理 (Exception / Throws)，僅在 Console 中提報錯誤訊息
		// 再者，例外處理拋出的訊息可分為二：
		// 1. 第一種錯誤訊息，係給客戶端閱讀，其訊息應淺顯易懂，不包含專業術語。此錯誤處理的程式碼可直接寫在前端網頁 
		// 當然本錯誤是發生轉帳出了問題，需經過資料庫中的 accountBalance 查詢帳戶餘額，在判斷是否符合規定。
		// 如果此錯誤訊息只限於輸入欄位之英文不可小寫，那錯誤訊息的程式碼，可直接在前端網頁處理 (通常使用 JavaScript 處理之)
		// 後端)。
		// 2. 第二種錯誤訊息，係給工程師辨識的專業術語，可讓工程人員快速的修復錯誤
		System.out.println("[Error Code: A-0001] Transfer Error, please contanct Service Team"); // 第一種
		System.out.println("[Error Code: A-0001-0001] Transfer Error - Account Balance is out of limit"); // 第二種
		return false;
	}
	
	public void printAccount() {
		System.out.println("Name of Account: " + accountName + " : " + "$" + accountBalance);
	}
}
