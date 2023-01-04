package java8.services;
import java8.enums.TaxiType;
import java8.person.Taxi;

import java.util.List;
import java.util.Map;

public interface TaxiService {
    StringBuilder add(Taxi taxi);
    StringBuilder add(List<Taxi> taxis);
    List<Taxi> findByInitialLetter(String model);
    Map<TaxiType, List<Taxi>> grouping();
    List<Taxi> filterByTaxiType(String taxiType);
    void update(Long id);
}
