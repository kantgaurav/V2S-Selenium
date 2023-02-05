package practice_selenium;


import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailBoxCapacity = 1000;
    private String companySuffix = "amazon.com";

    /*
    private is used so that we can use encapsulation property of OOPS.
    to access firstName & lastName we use getters & setters or constructors.
    */

    //Constructor for firstName and lastName to access them
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email Created : " + firstName + " " + lastName);

        //call a method which asks for a department and returns department
        this.department = setDepartment();
        System.out.println("Department : " + this.department);

        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+ department + "." + companySuffix;
//        System.out.println("Email Id : " + email);

        //call a method which generates random password
        this.password = generatePassword(defaultPasswordLength);
        System.out.println("Your Password is " + this.password);

        System.out.println("Your Mail box capacity is " + mailBoxCapacity);


    }

    //Ask for Department
    private String setDepartment(){
        System.out.print("New Employee : " + firstName + "\nDepartment Codes\n 1 for Android Developer\n 2 for Web Developer\n 3 for Machine Learning\n 0 for None\n Enter the Department : ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){ return "Android";}
        else if (deptChoice == 2){ return "Web"; }
        else if (deptChoice == 3){ return "ML";}
        else{ return "No Such Department";}
    }

    //Generate a Random Password
    private String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$&";
        char [] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    //Get the mailbox capacity
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    //Set the Alternate Email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //Get the Alternate email
    public String getAlternateEmail(){
        return alternateEmail;
    }

    //Change the Password
    public void changePassword(String password){
        this.password = password;
    }
    //Get the Password
    public String getPassword(){
        return password;
    }

    //Show all the information
    public String showInfo(){
        return "Display Name : " + firstName + " " + lastName + "\nCompany Email : " + email +  "\nMail Capacity : " + mailBoxCapacity + "mb";
    }


}
