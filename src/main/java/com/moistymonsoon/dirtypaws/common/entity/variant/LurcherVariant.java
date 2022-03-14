package com.moistymonsoon.dirtypaws.common.entity.variant;


import java.util.*;

public enum LurcherVariant {
    BROWN(0),
    BLACK(1),
    DAPPLE(2);

    private static final LurcherVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(LurcherVariant::getId)).toArray(LurcherVariant[]::new);
    private final int id;

    LurcherVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static LurcherVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}