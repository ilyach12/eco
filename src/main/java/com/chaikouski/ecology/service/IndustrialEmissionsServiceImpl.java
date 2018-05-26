package com.chaikouski.ecology.service;

import com.chaikouski.ecology.model.Associate;
import com.chaikouski.ecology.model.IndustrialEmissions;
import com.chaikouski.ecology.repo.IndustrialEmissionsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustrialEmissionsServiceImpl implements CommonService<IndustrialEmissions> {

    private IndustrialEmissionsRepo repo;

    public IndustrialEmissionsServiceImpl(IndustrialEmissionsRepo repo) {
        this.repo = repo;
    }


    @Override
    public List<IndustrialEmissions> getForAssociate(Associate associate) {
        return null;
    }

    @Override
    public void save(IndustrialEmissions type) {

    }

    @Override
    public void delete(IndustrialEmissions type) {

    }
}
