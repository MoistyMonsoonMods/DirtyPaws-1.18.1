package com.moistymonsoon.dirtypaws.common.entity.variant;


import java.util.*;

public enum BorderCollieVariant {
    POPPY(0),
    BROWN(1),
    BLACK(2),
    DAPPLE(3);

    private static final BorderCollieVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(BorderCollieVariant::getId)).toArray(BorderCollieVariant[]::new);
    private final int id;

    BorderCollieVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static BorderCollieVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}