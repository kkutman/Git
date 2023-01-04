package java8.services;

import java8.person.Client;
import java8.person.Taxi;

import java.util.List;
import java.util.Map;

public interface ClientService {
    String addClient(Client client);
    String addClient(List<Client> clients);
    List<Client> getClientByName(String name);
    Client removeClientById(Long id);
    Taxi orderTaxi(Long clientId, String taxiType);
    Map<Integer, Client> getClientAge();
    void universalSorting(String word);
}
