package com.chaikouski.ecology.service;

import com.chaikouski.ecology.model.Associate;

import java.util.List;

public interface AssociateService {

    List<Associate> getAll();

    List<Associate> getByPosition(String position);

    List<Associate> getByLastName(String lastName);

    Associate getById(Long id);

    void save(Associate associate);

    void delete(Associate associate);
}
