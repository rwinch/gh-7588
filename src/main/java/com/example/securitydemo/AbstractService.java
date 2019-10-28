package com.example.securitydemo;

abstract class AbstractService<E extends AbstractEntity> implements IEntityService<E> {

    @Override
    public String methodWithoutParameter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String methodWithParameter(E entity) {
        throw new UnsupportedOperationException();
    }
}
