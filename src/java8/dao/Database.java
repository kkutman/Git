package java8.dao;

import java8.person.Client;
import java8.person.Driver;
import java8.person.License;
import java8.person.Taxi;

import java.util.LinkedHashSet;
import java.util.Set;

public class Database {
    Set<Client>clients = new LinkedHashSet<>();
    Set<Driver>drivers = new LinkedHashSet<>();
    Set<Taxi>taxis = new LinkedHashSet<>();
    Set<License>licenses = new LinkedHashSet<>();

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Set<Taxi> getTaxis() {
        return taxis;
    }

    public void setTaxis(Set<Taxi> taxis) {
        this.taxis = taxis;
    }

    public Set<License> getLicenses() {
        return licenses;
    }

    public void setLicenses(Set<License> licenses) {
        this.licenses = licenses;
    }
}
