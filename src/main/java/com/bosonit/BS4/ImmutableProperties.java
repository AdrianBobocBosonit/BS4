package com.bosonit.BS4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "immutable")
        //Con la siguiente etiqueta me puedo ahorrar los setters
@ConstructorBinding
public class ImmutableProperties {
    private final String text;
    private final double number;
    private final String relaxBinding;

    public ImmutableProperties(String text, double number, String relaxBinding) {
        this.text = text;
        this.number = number;
        this.relaxBinding = relaxBinding;
    }


    @Override
    public String toString() {
        return "ImmutableProperties{" +
                "text='" + text + '\'' +
                ", number=" + number +
                ", relaxBinding='" + relaxBinding + '\'' +
                '}';
    }
}
