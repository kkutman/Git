package java8.services.impl;

import java8.dao.Database;
import java8.person.Client;
import java8.person.Taxi;
import java8.services.ClientService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClientServiceImpl implements ClientService {
    Database database = new Database();

    @Override
    public String addClient(Client client) {
        database.getClients().add(client);
        return "true";
    }

    @Override
    public String addClient(List<Client> clients) {
        database.getClients().addAll(clients);
        return "true";
    }

    @Override
    public List<Client> getClientByName(String name) {
        List<Client>clients = new ArrayList<>();
        for (Client client : database.getClients()) {
            if(client.getFullName().equalsIgnoreCase(name)){
                clients.add(client);
            }

        }
        return clients;
    }

    @Override
    public Client removeClientById(Long id) {
        for (Client client : database.getClients()) {
            if(client.getId()==id){
                database.getClients().remove(client);
                return client;
            }
        }
        return null;
    }

    @Override
    public Taxi orderTaxi(Long clientId, String taxiType) {
        return null;
    }

    @Override
    public Map<Integer, Client> getClientAge() {
        Map<Integer,Client>clientMap = new LinkedHashMap<>();
        for (Client client : database.getClients()) {
            clientMap.put(client.getDateOfBirth().getYear(),client);
        }
        return clientMap;
    }

    @Override
    public void universalSorting(String word) {

    }
}
