package com.example.securitydemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class DemoService extends AbstractService<DemoEntity> implements IDemoService {

    @Override
    @PreAuthorize("isAuthenticated()")
    public String methodWithoutParameter() {
        return "Restricted method without parameter";
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public String methodWithParameter(DemoEntity entity) {
        return "Restricted method having a parameter";
    }
}
