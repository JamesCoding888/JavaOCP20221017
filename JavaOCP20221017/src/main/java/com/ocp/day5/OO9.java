package com.ocp.day5;
// Application of 4th pattern of Object-Oriented to design a Roughly Account System
public class OO9 {
    public static void main(String[] args) {
    	// Firstly Create Account, initialized 
    	// 開戶建檔，初始化
    	// Generally speaking, the policy of Bank in Taiwan, will request their client(s) to deposit 1,000 NT dollars for 1st account created 
    	// 在台銀行之一般規定，第一次開戶，需存入 1000 元 
        Account account1 = new Account("James", 1000);
        Account account2 = new Account("Betty", 1000);
                
        account1.printAccount();
        // 存款 $500
        account1.deposit(500);
        account1.printAccount();
        // 提款 $3000
        account1.withDraw(3000);
        account1.printAccount();
        // James 轉給 Betty 1500 元
        account1.transferMoney(account2, 1500);
        account1.printAccount();
        account2.printAccount();
        // James 轉給 Betty 100 元
        account1.transferMoney(account2, 100);
        account1.printAccount();
        account2.printAccount();       
    }
}

/*
	Console:
			Name of Account: James : $1000
			Name of Account: James : $1500
			[Error Code: A-0002] Insufficent Account Balance
			[Error Code: A-0002-0002] Insufficent Account Balance, because amount > accountBalance
			Name of Account: James : $1500
			Name of Account: James : $0
			Name of Account: Betty : $2500
			[Error Code: A-0002] Insufficent Account Balance
			[Error Code: A-0002-0002] Insufficent Account Balance, because amount > accountBalance
			[Error Code: A-0001] Transfer Error, please contanct Service Team
			[Error Code: A-0001-0001] Transfer Error - Account Balance is out of limit
			Name of Account: James : $0
			Name of Account: Betty : $2500
*/