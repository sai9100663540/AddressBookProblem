package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddContact {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);


        System.out.println("===== WELCOME TO ADDRESS BOOK MANAGEMENT =======");
        Methods display1 = new Methods();
        display1.addcontact();
        display1.print();





      /*  char input = 'X';
        System.out.println("Enter X if you wish to add contacts :");
        input = sc1.next().charAt(0);
        while (input == 'X') {
            p1.addcontact();
            p1.displayAddressbook();
            System.out.println("Enter X if you wish to add contacts :");
            input = sc1.next().charAt(0);
        }
       */


    }
}
