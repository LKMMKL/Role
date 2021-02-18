package com.example.role.enums;

public enum RoleType {

    ADMIN("admin", "管理员"),

    SENIOR("senior", "高级用户"),

    NORMAL("normal", "普通用户");

    private String name;

    private String desc;

    RoleType(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
}
