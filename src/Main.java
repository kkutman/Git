import java8.dao.Database;
import java8.person.Client;
import java8.person.Driver;
import java8.services.impl.ClientServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        List<Client>clients = new ArrayList<>(List.of(
                new Client(1L,"kutman1", LocalDate.of(2004,4,4),"233232",new BigDecimal(2000)),
                new Client(2L,"kutman2", LocalDate.of(2002,4,4),"233232",new BigDecimal(2000)),
                new Client(3L,"kutman3", LocalDate.of(2004,4,4),"233232",new BigDecimal(2000)),
                new Client(4L,"kutman4", LocalDate.of(2001,4,4),"233232",new BigDecimal(2000)),
                new Client(5L,"kutman5", LocalDate.of(2003,4,4),"233232",new BigDecimal(2000)),
                new Client(6L,"kutman6", LocalDate.of(2004,4,4),"233232",new BigDecimal(2000))
        ));



    }
}