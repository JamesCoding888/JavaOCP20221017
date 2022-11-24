package com.ocp.day9_2.polymorphism_1;

public class Tiger extends Cat {
    String name = "老虎";
    public void 叫聲() {
        System.out.println("吼~~");
    }
    public String getName() {
        return name;
    }
}
