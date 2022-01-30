package com.kuznetsov.iotdevices.controllers;

import com.kuznetsov.iotdevices.models.SmartLight;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SmartLightController {

    @GetMapping("/light/{enabled}")
    SmartLight enableOrDisableLight(@PathVariable boolean enabled) {
        return new SmartLight("smart light 1", enabled, "home");
    }

    @GetMapping("/light")
    SmartLight statusLight() {
        return new SmartLight("smart light 1", true, "home");
    }

}
