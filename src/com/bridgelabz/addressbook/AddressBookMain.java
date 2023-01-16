package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);


            System.out.println("===== WELCOME TO ADDRESS BOOK MANAGEMENT =======");
            AddressBook_UC1 p1 = new AddressBook_UC1();
            AddressBook_UC1[] obj1 = new AddressBook_UC1[1];


            obj1[0] = new AddressBook_UC1();
            p1.setFirstName("saikumar");
            p1.setLastName("Gampa");
            p1.setPhoneNumber(9100663540l);
            p1.setAddress("Mancherial Hyderabad");
            p1.setCity("Mancherial");
            p1.setState("Telangana");
            p1.setPincode(504302);
            p1.Addressbook();


        }

}
