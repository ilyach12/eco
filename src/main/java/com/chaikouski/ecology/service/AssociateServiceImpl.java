package com.chaikouski.ecology.service;

import com.chaikouski.ecology.model.Associate;
import com.chaikouski.ecology.model.Measurements;
import com.chaikouski.ecology.repo.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociateServiceImpl implements AssociateService {

    private AssociateRepo associateRepo;
    private AutoExhaustsRepo autoExhaustsRepo;
    private IndustrialEmissionsRepo industrialEmissionsRepo;
    private LakePollutionRepo lakePollutionRepo;
    private RadioactivePollutionRepo radioactivePollutionRepo;
    private RiverPollutionRepo riverPollutionRepo;
    private SeaPollutionRepo seaPollutionRepo;
    private SoilPollutionRepo soilPollutionRepo;

    public AssociateServiceImpl(AssociateRepo associateRepo, AutoExhaustsRepo autoExhaustsRepo,
                                IndustrialEmissionsRepo industrialEmissionsRepo, LakePollutionRepo lakePollutionRepo,
                                RadioactivePollutionRepo radioactivePollutionRepo,
                                RiverPollutionRepo riverPollutionRepo, SeaPollutionRepo seaPollutionRepo,
                                SoilPollutionRepo soilPollutionRepo) {
        this.associateRepo = associateRepo;
        this.autoExhaustsRepo = autoExhaustsRepo;
        this.industrialEmissionsRepo = industrialEmissionsRepo;
        this.lakePollutionRepo = lakePollutionRepo;
        this.radioactivePollutionRepo = radioactivePollutionRepo;
        this.riverPollutionRepo = riverPollutionRepo;
        this.seaPollutionRepo = seaPollutionRepo;
        this.soilPollutionRepo = soilPollutionRepo;
    }

    @Override
    public List<Associate> getAll() {
        return populateMeasurement(associateRepo.findAll());
    }

    @Override
    public List<Associate> getByPosition(String position) {
        return populateMeasurement(associateRepo.findByPosition(position));
    }

    @Override
    public List<Associate> getByLastName(String lastName) {
        return populateMeasurement(associateRepo.findByLastName(lastName));
    }

    @Override
    public Associate getById(Long id) {
        return populateMeasurement(associateRepo.getOne(id));
    }

    @Override
    public void save(Associate associate) {
        associateRepo.save(associate);
    }

    @Override
    public void delete(Associate associate) {
        associateRepo.delete(associate);
    }

    private List<Associate> populateMeasurement(List<Associate> associates) {
        for (Associate associate : associates) {
            Measurements measurements = new Measurements();

            measurements.setAutoExhausts(autoExhaustsRepo.findByAssociate(associate));

            associate.setMeasurements(measurements);
        }
        return associates;
    }

    private Associate populateMeasurement(Associate associate) {
        Measurements measurements = new Measurements();



        associate.setMeasurements(measurements);
        return associate;
    }
}
