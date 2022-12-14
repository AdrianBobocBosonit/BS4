package com.bosonit.BS4;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class CustomPropertyConverter implements Converter<String, CustomProperty> {
    @Override
    public CustomProperty convert(String s) {
        final String[] fields = s.split(",");
        return new CustomProperty(fields[0], Boolean.valueOf(fields[1]));
    }
}
