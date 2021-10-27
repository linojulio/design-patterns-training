package linojulio.design.patterns.training.facade.service;

import linojulio.design.patterns.training.facade.service.model.ContactRepositoryModel;

import java.util.HashMap;

public class LocationRepository {

    private static HashMap<String, String> locationCache = new HashMap<>();

    private LocationRepository() {
        super();
    }

    public void addOrUpdateLocationByCpf(String cpf, String location) {
        locationCache.put(cpf, location);
    }

    public String getLocatonByCpf(String cpf) throws Exception {
        if (!locationCache.containsKey(cpf)) throw new Exception("not.found");

        return locationCache.get(cpf);
    }

    public static LocationRepository getInstance() {
        return LocationRepository.InstanceHolder.instance;
    }

    private static class InstanceHolder {
        public static LocationRepository instance = new LocationRepository();
    }
}
