package com.example.securitydemo;

public interface IEntityService<E> {

    String methodWithoutParameter();

    String methodWithParameter(E entity);
}
