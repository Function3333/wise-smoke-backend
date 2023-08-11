package com.smokeWise.demo.commmon;

public enum BoardCategory {
    CIGARETTE_REVIEW("CIGARETTE_REVIEW"),
    SMOKING_BAN_TIP("SMOKING_BAN_TIP"),
    FREE_BOARD("FREE_BOARD");

    private final String value;

    BoardCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
