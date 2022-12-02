package com.ocp.day11_1.observer;

public class Demo {
	public static void main(String[] args) {
		// 建立觀察者(讀者)
		Observer user1 = new UserObserver("John");
		Observer user2 = new UserObserver("Mary");
		Observer user3 = new UserObserver("Helen");

		// 建立被觀察者(主題/新聞)
		Subject news = new NewsSubject();

		// 訂閱
		news.add(user1);
		news.add(user2);
		news.add(user3);

		// 發送新聞(第一次)
		news.notifyObserver("周六要選舉!");

		// 取消訂閱
		news.remove(user2);

		// 發送新聞(第二次)
		news.notifyObserver("本周日要聚餐!");

	}
}