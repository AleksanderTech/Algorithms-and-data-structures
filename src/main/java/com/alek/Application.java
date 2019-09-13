package com.alek;

import com.alek.dataStructures.LinkedList.SingleLinkedList.SinglyLinkedList;
import com.alek.dataStructures.LinkedList.SingleLinkedList.Employee;
import com.alek.dataStructures.LinkedList.SingleLinkedList.User;

public class Application {

    public static void main(String[] args) {

        Employee employee1 = new Employee("emp1", 22);
        Employee employee2 = new Employee("emp2", 23);
        Employee employee3 = new Employee("emp3", 24);
        Employee employee4 = new Employee("emp4", 25);
        Employee employee5 = new Employee("emp5", 26);

        User user1 = new User("login1", "password1");
        User user2 = new User("login2", "password2");
        User user3 = new User("login3", "password3");
        User user4 = new User("login4", "password4");
        User user5 = new User("login5", "password5");

        SinglyLinkedList<Employee> employeeList = new SinglyLinkedList<>();

        employeeList.addToFront(employee1);
        employeeList.addToFront(employee2);
        employeeList.addToFront(employee3);
        employeeList.addToFront(employee4);
        employeeList.addToFront(employee5);

        employeeList.printList();


        SinglyLinkedList<User> userList = new SinglyLinkedList<>();

        userList.addToFront(user1);
        userList.addToFront(user2);
        userList.addToFront(user3);
        userList.addToFront(user4);
        userList.addToFront(user5);
        userList.removeFromFront();
        userList.removeFromFront();
        userList.removeFromFront();
        userList.removeFromFront();

        userList.printList();
    }
}
