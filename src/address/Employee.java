package address;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {

    private Map<String,Address> addressList;

    private Scanner scanner;

    public Employee() {
        addressList = new HashMap<>();
        scanner = new Scanner(System.in);
    }


    private void listAddress( ){
        for (Map.Entry<String,Address> actual :addressList.entrySet()){
            System.out.println(actual.getValue());
        }
    }

    private void addAddress (){
        System.out.println("Adja meg az orszag nevet!");
        String country = scanner.nextLine();
        System.out.println("Adja meg a varos iranyitoszamat!");
        int cityNumber = scanner.nextInt();
        System.out.println("Adja meg az utca nevet");
        String street = scanner.nextLine();
        System.out.println("Adja meg az emeletet");
        int level = scanner.nextInt();


        Address address = new Address(country,cityNumber,street,level);
      //  this.addressList.put(address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "addressList=" + addressList +
                '}';
    }
}
