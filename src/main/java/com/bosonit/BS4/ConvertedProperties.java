package com.bosonit.BS4;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.util.unit.DataSize;

import java.time.Duration;
import java.time.Period;

@ConfigurationProperties(prefix = "converted")
@ToString
@ConstructorBinding
@AllArgsConstructor
public class ConvertedProperties {
    private Duration duration;
    private Period period;
    private DataSize dataSize;
    private CustomProperty customProperty;
}
