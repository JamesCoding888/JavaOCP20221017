package com.ocp.day12.InnerClass.innerclass;
/*
 * 關於 Java Inner Class Rules 整理重點
 * 1. 區域變數若要被內部類別調用，必須具備 final 特性（JDK 8 之前的規則）
 * 2. JDK 8 之後的改變：即使變數未使用 final，但它必須是 "effectively final"
 * 3. 成員內部類別（Member Inner Class）可以存取外部類別的 private 成員
 * 4. 靜態內部類別（Static Inner Class）只能存取外部類別的靜態成員
 * 5. 匿名內部類別（Anonymous Inner Class）
 * 
 * 參考文件: Java_Inner_Class_Rules.docx
 */
public class OuterClass {
	private String message = "Hello from OuterClass!";
    private static String staticMessage = "Hello from Static Inner Class!";
    
    public void methodWithInnerClass() {
        final int number1 = 100; // 必須是 final 在 JDK 8 之前
        int number2 = 100; // JDK 8 之後，不需要宣告 final，但必須保持不變
        // 成員內部類別
        class LocalInnerClass {
            public void printNumber() {
                System.out.printf("The number1 is: %d | number2 is: %d\n", number1, number2);
            }
            public void displayMessage() {
                System.out.println(message); // 可以存取外部類別的 private 成員
            }
        }

        LocalInnerClass inner = new LocalInnerClass();
        inner.printNumber();
        inner.displayMessage();
    }
    // 靜態內部類別
    public static class StaticInnerClass {
        public void displayStaticMessage() {
            System.out.println(staticMessage); // 只能存取外部類別的靜態成員
        }
    }
    
    public void createAnonymousClass() {
        // 使用匿名內部類別來即時實作接口
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running from Anonymous Inner Class");
            }
        };

        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.methodWithInnerClass();
        OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass(); // 直接透過類別名稱實例化
        inner.displayStaticMessage();
        outer.createAnonymousClass();
    }
}
