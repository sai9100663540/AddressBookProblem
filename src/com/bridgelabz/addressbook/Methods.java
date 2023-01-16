package com.bridgelabz.addressbook;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

    }
    AddressBook_UC1[] ad1 = new AddressBook_UC1[100];


    void addcontact() {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to add: ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            AddressBook_UC1 p1 = new AddressBook_UC1();
            System.out.println("Enter your First Name ");
            String firstname = sc.next();
            p1.setFirstName(firstname);
            System.out.println("Enter your Last Name ");
            String lastname = sc.next();
            p1.setLastName(lastname);
            System.out.println("Enter your Phone Number: ");
            long phnumber = sc.nextLong();
            p1.setPhoneNumber(phnumber);
            System.out.println("Enter your address: ");
            String addr = sc.next();
            p1.setAddress(addr);
            System.out.println("Enter your City: ");
            String city1 = sc.next();
            p1.setCity(city1);
            System.out.println("Enter your State: ");
            String state1 = sc.next();
            p1.setState(state1);
            System.out.println("Enter your PINCODE: ");
            int pin = sc.nextInt();
            p1.setPincode(pin);
            System.out.println("\n");
            ad1[i] = p1;
        }
    }

    public void print() {
        for (int j = 0; j < ad1.length; j++) {
            if (ad1[j] == null)
                continue;
            System.out.println(ad1[j]);
        }
    }


    void editContact() {
        Scanner sc = new Scanner(System.in);
        AddressBook_UC1 p1 = null;

        System.out.println("Do you want to make changes in any contact (Press 'Y' to continue:) ");
        char decision = sc.next().charAt(0);
        if (decision == 'Y') {
            System.out.println("Enter the first name of the person whose data you want to edit");
            String nameOfPerson = sc.next();
            for (int i = 0; i < ad1.length; i++) {
                AddressBook_UC1 person = ad1[i];
                if(person == null) {
                    break;
                }
                if (person.getFirstName().equals(nameOfPerson)) {
                    p1 = ad1[i];
                    break;
                }
            }
            if (p1 == null) {
                System.out.println("Person not found");
            }
            else {
                System.out.println("Select A : for editing and B: for deleting:");
                char choice = sc.next().charAt(0);
                if (choice == 'A') {
                    System.out.println("Enter the index number for editing 1 : last name 2:phone number 3:adddress 4:city 5:state 6:pincode");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Enter the lastname to change");
                            String userNewLastName = sc.next();
                            p1.setLastName(userNewLastName);
                            break;
                        case 2:
                            System.out.println("Enter the Phone number to change");
                            long userNewPhoneNumber = sc.nextLong();
                            p1.setPhoneNumber(userNewPhoneNumber);
                            break;
                        case 3:
                            System.out.println("Enter the address to change");
                            String userNewAddress = sc.next();
                            p1.setAddress(userNewAddress);
                            break;
                        case 4:
                            System.out.println("Enter the city to change");
                            String userNewCity = sc.next();
                            p1.setCity(userNewCity);
                            break;
                        case 5:
                            System.out.println("Enter the state to change");
                            String userNewState = sc.next();
                            p1.setState(userNewState);
                            break;
                        case 6:
                            System.out.println("Enter the pincode to change");
                            int userNewPincode = sc.nextInt();
                            p1.setPincode(userNewPincode);
                            break;

                    }
                }
                else if (choice == 'B') {
                    p1.setFirstName(null);
                    p1.setLastName(null);
                    p1.setPhoneNumber(0);
                    p1.setAddress(null);
                    p1.setPincode(0);
                    p1.setState(null);
                    p1.setCity(null);

                }
                else {
                    System.out.println("Not a relevant choice");
                }
            }
        } else {
            System.out.println("=============== Thank you for using the service ==========");
        }
    }

    public void AddContact() {
    }
}
