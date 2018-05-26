package com.chaikouski.ecology.service;

import com.chaikouski.ecology.model.Associate;

import java.util.List;

public interface CommonService<T> {

    List<T> getForAssociate(Associate associate);

    void save(T type);

    void delete(T type);
}
