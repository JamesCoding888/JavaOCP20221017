package com.ocp.day15.treeset.comparable;

public enum SortType {
    小到大(true), 大到小(false);
    private boolean value;
    SortType(boolean value) {
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }
}

