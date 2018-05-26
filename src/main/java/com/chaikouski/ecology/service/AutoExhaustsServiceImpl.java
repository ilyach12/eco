package com.chaikouski.ecology.service;

import com.chaikouski.ecology.model.Associate;
import com.chaikouski.ecology.model.AutoExhausts;
import com.chaikouski.ecology.repo.AutoExhaustsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoExhaustsServiceImpl implements CommonService<AutoExhausts> {

    private AutoExhaustsRepo repo;

    public AutoExhaustsServiceImpl(AutoExhaustsRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<AutoExhausts> getForAssociate(Associate associate) {
        return repo.findByAssociate(associate);
    }

    @Override
    public void save(AutoExhausts type) {
        repo.save(type);
    }

    @Override
    public void delete(AutoExhausts type) {
        repo.delete(type);
    }
}
