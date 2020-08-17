package com.jsquoolt.hashtable;

public class ChainedHashtableMain {

    public static void main(String[] args) {

        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Bill", billEnd);
        ht.put("Smith", marySmith);
        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.printHashtable();
    }
}
