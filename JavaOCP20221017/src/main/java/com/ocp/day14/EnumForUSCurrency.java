package com.ocp.day14;

// enum 列舉
public enum EnumForUSCurrency {
	// PENNY: 1美分, NICKLE: 5美分,
	// DIME: 10美分, QUARTER: 25美分
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

	private Integer value;

	private EnumForUSCurrency(Integer value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}