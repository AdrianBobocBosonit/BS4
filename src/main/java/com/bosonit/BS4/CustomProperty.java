package com.bosonit.BS4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class CustomProperty {
    private String name;
    private boolean immutable;
}
