package ar.edu.utn.frc.tup.lc.iv.services;

import ar.edu.utn.frc.tup.lc.iv.models.District;

import java.util.List;

public interface ElectionsService {

    List<District> getDistricts(String districtName);

}
