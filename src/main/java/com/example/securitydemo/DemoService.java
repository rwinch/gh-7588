package com.example.securitydemo;


public class DemoService extends AbstractService<DemoEntity> implements IDemoService {

    @Override
    public String methodWithoutParameter() {
        return "Restricted method without parameter";
    }

    @Override
    public String methodWithParameter(DemoEntity entity) {
        return "Restricted method having a parameter";
    }
}
