package com.zzr.design_patterns.builder;

import java.util.Objects;

/**
 * @author zhaozhirong
 * @date 2022/1/10 8:45 下午
 */
public class User {

    private final String name;
    private final String card;
    private final String address;
    private final String happy;
    private final Integer age;

    public User(Builder builder) {
        this.name = builder.name;
        this.card = builder.card;
        this.address = builder.address;
        this.happy = builder.happy;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", card='" + card + '\'' +
                ", address='" + address + '\'' +
                ", happy='" + happy + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private final String name;
        private final String card;
        private String address;
        private String happy;
        private Integer age;

        public Builder(String name, String card) {
            if (Objects.isNull(name) || Objects.isNull(card)) {
                throw new IllegalArgumentException("name and card can not be null");
            }
            this.name = name;
            this.card = card;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withHappy(String happy) {
            this.happy = happy;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
