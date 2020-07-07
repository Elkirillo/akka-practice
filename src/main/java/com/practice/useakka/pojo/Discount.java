package com.practice.useakka.pojo;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
public class Discount {
    long value;
    Type type;

    public boolean isTypeEquals(Type type) {
        return this.type.equals(type);
    }

    @AllArgsConstructor
    public enum Type {
        PERCENT("%"),
        VALUE("M");

        private final String name;

        @Override
        public String toString() {
            return name;
        }
    }
}
