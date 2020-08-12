package com.jsquoolt.linkedlist.object;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billyMand = new Employee("Billy", "Mand", 89);

        EmployeeLinkedList list = new EmployeeLinkedList();

        //method to check if the list is empty
        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();


        list.addBefore(billyMand, mikeWilson);
        list.printList();

        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();

    }
}
