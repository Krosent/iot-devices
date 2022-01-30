package com.kuznetsov.iotdevices.controllers;

import com.kuznetsov.iotdevices.models.SmartLight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartLightController {
    @GetMapping("/light/{enabled}")
    SmartLight replaceEmployee(@PathVariable boolean enabled) {
        if (enabled) {
            return new SmartLight("light", true, "home");
        } else {
            return new SmartLight("light", false, "home");
        }
    }
}
