package com.bosonit.BS4;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "simple")
public class SimplePorperties2 {
    private String text;
    private int number;

    public void setText(String text) {
        this.text = text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SimplePorperties{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
