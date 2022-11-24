package com.ocp.day9.dao;

public class UserDao {

	public static void main(String[] args) {
						
		// Randomly output id_number by 20 times
		for(int n = 0 ; n < 20 ; n++) {
			Dao dao = new Dao();
			System.out.println(dao);
		}
		// Randomly output SAME id_number by 20 times, since Singleton
		for(int n = 0 ; n < 20 ; n++)
		System.out.println(SingleDao.getSingleDaoInstance());		
	}

}

/*

	A kind Reminder: 
	(1) you may get a different console from following, 
	because the programming of generating value of id_number from "Dao.java" is via "new Random().nextInt()"
	
	Of the "SingleDao.java", we design a Singleton pattern into this class, and you will see the generated id_number is SAME!
 	
 	(2) Since we created a public static method (i.e., "public static SingleDao getSingleDaoInstance()") to prohibit developer from 
 	creating more than one object for accessing the inside object of "SingleDao.java".
	
	(1) 請讀者留意，您產生的結果訊息，可能與底下的不同，原因是本程式碼 "Dao.java" 產生 id_number 的方式，係使用 "new Random().nextInt()"
	去產生一個隨機的數值。
	
	
	(2) 另外產書的 SingleDao 訊息，請不用懷疑，因為本設計之 "SingleDao.java"， 係使用 Singletoe 架構，外部 .class 若要調用 SingleDao.java 中的物件時，
	因為都是呼叫相同的類別物件，所以產出的 id_number 均相同，但您產出的結果可能與本內容的值不同，因為 "new Random().nextInt(int value)" 是亂數產生的 int 數值。
	
	
	
	Console:
				Dao {  id_number = 6273689 }
				Dao {  id_number = 28208821 }
				Dao {  id_number = 97186207 }
				Dao {  id_number = 64812182 }
				Dao {  id_number = 62212855 }
				Dao {  id_number = 9997062 }
				Dao {  id_number = 91780788 }
				Dao {  id_number = 56275023 }
				Dao {  id_number = 13992858 }
				Dao {  id_number = 61485036 }
				Dao {  id_number = 45489197 }
				Dao {  id_number = 56857545 }
				Dao {  id_number = 14134897 }
				Dao {  id_number = 5920962 }
				Dao {  id_number = 43104245 }
				Dao {  id_number = 91536232 }
				Dao {  id_number = 28683550 }
				Dao {  id_number = 17044462 }
				Dao {  id_number = 8936113 }
				Dao {  id_number = 14096860 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }
				SingleDao {  id_number = 48769241 }

*/