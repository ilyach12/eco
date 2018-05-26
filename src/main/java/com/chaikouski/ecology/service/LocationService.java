package com.chaikouski.ecology.service;

import com.chaikouski.ecology.model.Associate;
import com.chaikouski.ecology.model.Location;

import java.util.List;

public interface LocationService {

    List<Location> getAllForAssociate(Associate associate);

    void save(Location location);

    void delete(Location location);
}
