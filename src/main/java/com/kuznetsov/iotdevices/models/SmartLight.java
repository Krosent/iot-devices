package com.kuznetsov.iotdevices.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmartLight {
    private String name;
    private boolean enabled;
    private String environment;
}
