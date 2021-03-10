package library;

import library.utils.AccountState;
import library.utils.Address;
import library.utils.FullName;

import java.util.Calendar;

public class Client{
    private FullName name;
    private Address address;

    public Client(FullName name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getFullName() {
        return name.toString();
    }

}