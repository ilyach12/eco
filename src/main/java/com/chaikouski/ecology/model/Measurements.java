package com.chaikouski.ecology.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Measurements {

    private List<AutoExhausts> autoExhausts;
    private List<IndustrialEmissions> industrialEmissions;
    private List<LakePollution> lakePollutions;
    private List<RadioactivePollution> radioactivePollutions;
    private List<RiverPollution> riverPollutions;
    private List<SeaPollution> seaPollutions;
    private List<SoilPollution> soilPollutions;

    public List<AutoExhausts> getAutoExhausts() {
        if (autoExhausts == null) {
            autoExhausts = new ArrayList<>();
        }
        return autoExhausts;
    }

    public List<IndustrialEmissions> getIndustrialEmissions() {
        if (industrialEmissions == null) {
            industrialEmissions = new ArrayList<>();
        }
        return industrialEmissions;
    }

    public List<LakePollution> getLakePollutions() {
        if (lakePollutions == null) {
            lakePollutions = new ArrayList<>();
        }
        return lakePollutions;
    }

    public List<RadioactivePollution> getRadioactivePollutions() {
        if (radioactivePollutions == null) {
            radioactivePollutions = new ArrayList<>();
        }
        return radioactivePollutions;
    }

    public List<RiverPollution> getRiverPollutions() {
        if (riverPollutions == null) {
            riverPollutions = new ArrayList<>();
        }
        return riverPollutions;
    }

    public List<SeaPollution> getSeaPollutions() {
        if (seaPollutions == null) {
            seaPollutions = new ArrayList<>();
        }
        return seaPollutions;
    }

    public List<SoilPollution> getSoilPollutions() {
        if (soilPollutions == null) {
            soilPollutions = new ArrayList<>();
        }
        return soilPollutions;
    }
}
