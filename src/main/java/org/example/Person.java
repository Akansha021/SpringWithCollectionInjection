package org.example;

import java.util.*;

public class Person {
    List<String> addresses = new ArrayList<>();
    Set<Long> phones=new HashSet<>();
    Map<Integer,String> identity=new HashMap<>();

    public void getPhones() {
        System.out.println(phones);
    }

    public void setPhones(Set<Long> phones) {
        this.phones = phones;
    }

    public void getIdentity() {
        System.out.println(identity);
    }

    public void setIdentity(Map<Integer, String> identity) {
        this.identity = identity;
    }

    public void getAddresses() {
        for(int a = 0; a< addresses.size(); a++){
            System.out.println(addresses.get(a));
        }
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
}
