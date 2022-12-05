package com.ocp.day12.anonymous;
/*
 	Description of FuntionalInterface: 
	Given an annotation of @FunctionalInterface, to make sure the interface class, only has ONE abstraction method
	Java 1.8 version, released an annotation of @FunctionalInterface, to help developer to check up the current interface class if meet the specification of FunctionalInterface.
	Just in case of 2 abstraction method existance in one interface class, the compiler will present the error message as following - Invalid '@FunctionalInterface' annotation; Calc is not a functional interface
	Java 1.8 版本，提供了此註解 @FunctionalInterface，可協助開發者檢查其中的程式碼，是否滿足一個介面，只有一個抽象方法
	如果有 2 個以上之抽象方法，則 compiler 時，會出現 - Invalid '@FunctionalInterface' annotation; Calc is not a functional interface
*/
@FunctionalInterface
public interface Calc {
	
	int submit(int x, int y); // same as "public abstract int submit(int x, int y)"
	
	
}
