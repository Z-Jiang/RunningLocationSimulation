package demo.service;

import demo.domain.SupplyLocation;

import java.util.List;

public interface SupplyLocationService {
    List<SupplyLocation> saveSupplyLocationsZipContains30339(List<SupplyLocation> locations);
}
