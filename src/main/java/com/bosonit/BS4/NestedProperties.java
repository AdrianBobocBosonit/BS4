package com.bosonit.BS4;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "nested")
@ConstructorBinding
@AllArgsConstructor
@ToString
public class NestedProperties {
    private List<String> strings;
    private Map<String, String> dictionary;
    private final Item item;
}
