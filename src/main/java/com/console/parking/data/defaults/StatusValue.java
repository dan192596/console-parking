package com.console.parking.data.defaults;

public enum StatusValue {

    ENABLED(1L),
    DISABLED(2L)

    ;

    private final Long value;

    StatusValue(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }

}
