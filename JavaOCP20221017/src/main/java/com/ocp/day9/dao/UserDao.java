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