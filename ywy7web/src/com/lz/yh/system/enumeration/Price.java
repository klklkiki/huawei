package com.lz.yh.system.enumeration;

public enum Price {
	
	SF("收费", 1),
	MF("免费", 2),
	XM("限免", 3);
	
	// 成员变量
	private String name;
	private int index;
	
	// 构造方法
    private Price(String name, int index) {
        this.name = name;
        this.index = index;
    }
    
    // 普通方法
    public static String getName(int index) {
        for (Price c : Price.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }
    
    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}
