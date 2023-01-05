package java8.services.impl;

import java8.dao.Database;
import java8.enums.TaxiType;
import java8.person.Taxi;
import java8.services.TaxiService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaxiServiceImpl implements TaxiService {
    Database database = new Database();

    @Override
    public StringBuilder add(Taxi taxi) {
        database.getTaxis().add(taxi);
        return new StringBuilder("");
    }

    @Override
    public StringBuilder add(List<Taxi> taxis) {
        database.getTaxis().addAll(taxis);
        return new StringBuilder("true");
    }

    @Override
    public List<Taxi> findByInitialLetter(String model) {
        return database.getTaxis().stream().filter(x->x.getModel().startsWith(model)).toList();
    }

    @Override
    public Map<TaxiType, List<Taxi>> grouping() {
        Map<TaxiType,List<Taxi>>taxiTypeListMap = database.getTaxis().stream().collect(Collectors.groupingBy(Taxi::getTaxiType));
        return taxiTypeListMap;
    }

    @Override
    public List<Taxi> filterByTaxiType(String taxiType) {
        return null;
    }

    @Override
    public void update(Long id) {


    }
}
