package com.company;
import java.time.Year;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.Scanner;
//Flowershop Online
//in progress
public class Main {

    public static void main(String[] args) throws ParseException{

      /* bouquet b1 = new bouquet("Buchet trandafir", 100, 9, "rosii");
       bouquet b2 = new bouquet("Buchet gladiole", 50, 15, "mov");
       Date d1 = new Date(16,12,2000);
       Date do1 = new Date(30,3,2021);
       customer c1 = new customer("Buiciuc", "Ana", d1, 16290, 'f', "0735239310", "anabuiciuc@gmail.com");
       flowerShopAddress ad1 = new flowerShopAddress("Bacau", "Bacau", "Nicu Enea", "15", 600190);
      flowerShop f1 = new flowerShop("Floraria din Povesti", "0234484909", "florariadinpovestibacau@gmail.com",ad1);
    */
      // order o1 = new order(101,d1,c1,f1);
       //System.out.println(o1.toString());
        bouquet redRoses = new bouquet("Bouquet of red roses", 100, "Roses",9, "red");
        bouquet whiteRoses = new bouquet("Bouquet of white roses", 99.9, "Roses",9, "white");
        bouquet colorfulRoses = new bouquet("Bouquet of colorful roses", 120, "Roses",9, "colorful");
        bouquet redTulips = new bouquet("Bouquet of red tulips", 50, "Tulips",9, "red");
        bouquet whiteTulips = new bouquet("Bouquet of white tulips", 50.5, "Tulips",9, "white");
        bouquet colorfulTulips = new bouquet("Bouquet of colorful tulips", 65.49, "Tulips",9, "colorful");
        Scanner scanner = new Scanner(System.in);
      //  Date d1 = new Date(16,12,2000);
      //  customer c1 = new customer("Buiciuc", "Ana", d1, 16290, 'f', "0735239310", "anabuiciuc@gmail.com");

        customer newCustomer = new customer();
       System.out.println("Hello! What is your first name?\n");
       String customerFirstName = null;
       customerFirstName = scanner.nextLine();
        newCustomer.firstName = customerFirstName;
       System.out.println( "Nice to meet you, "+customerFirstName + "! "
               + "I'm your assistant, Ana. "
               + " Let me know want do you want to buy today.\n For Bouquet write 1. For Gift Box write 2.");
        int option = 0;
        option = scanner.nextInt();
        order newOrder = new order();
        switch(option){


            case 1 -> {
                System.out.println("Choose the flowers: \n 1.Roses \n 2. Tulips \n Please write the corresponding number.");
                int optionFlowers = 0;
                optionFlowers = scanner.nextInt();
                int optionNumberOfBouquets=0;

                  //  System.out.println("You selected "+b1.getProductName()+".\n");
                  //  +".\nYour price is: "+b1.getProductPrice()+ " lei.\n");
                    System.out.println("The bouquet contain 9 flowers. How many bouquets do you wish?\n");
                    optionNumberOfBouquets = scanner.nextInt();
                    System.out.println("What color do you like?\n You can choose: \n 1.Red\n 2.White\n 3.Colorful\n Please write the corresponding number.\n");
                    int optionColorFlowers = 0;
                    optionColorFlowers = scanner.nextInt();


                    newOrder.setNumberOfProducts(optionNumberOfBouquets);

                    switch (optionFlowers)
                    {
                        case 1 -> {

                            switch(optionColorFlowers){

                                case 1 -> newOrder.setMyProduct(redRoses);
                                case 2 -> newOrder.setMyProduct(whiteRoses);
                                case 3 -> newOrder.setMyProduct(colorfulRoses);
                            }
                        }

                        case 2 -> {

                            switch(optionColorFlowers){

                                case 1 -> newOrder.setMyProduct(redTulips);
                                case 2 -> newOrder.setMyProduct(whiteTulips);
                                case 3 -> newOrder.setMyProduct(colorfulTulips);
                            }
                        }
                    }




            }

            case 2 ->
                    {
                        System.out.println("in progress");

                    }



        }


        System.out.println("Your order:\n "+newOrder.getNumberOfProducts()+" "+newOrder.getMyProduct()+".");
        System.out.println("\n Your price is "+ newOrder.calculateTotal()+" RON.");
        System.out.println("\nNow, please let me know you better. \n What is your Last name? ");
        String customerLastName = scanner.nextLine();
        customerLastName = null;
        customerLastName = scanner.nextLine();
        newCustomer.lastName=customerLastName;

        System.out.println("When were you born? Digits only!\n");
        Date customerBirthday = new Date();
        int DayCustomerBirthday = 0;
        int MonthCustomerBirthday = 0;
        int YearCustomerBirthday = 0;
        System.out.println("Day: ");
        DayCustomerBirthday = scanner.nextInt();
        customerBirthday.setDay(DayCustomerBirthday);
        System.out.println("\nMonth: ");
        MonthCustomerBirthday = scanner.nextInt();
        customerBirthday.setMonth(MonthCustomerBirthday);
        System.out.println("\nYear: ");
        YearCustomerBirthday = scanner.nextInt();
        customerBirthday.setYear(YearCustomerBirthday);
        newCustomer.dateOfBirth = customerBirthday;

        System.out.println("\nWe also need your Identification Number (CNP): " );
        long customerCnp = 0;
        customerCnp = scanner.nextLong();
        newCustomer.identificationNumber=customerCnp;

        System.out.println("\nAre you male or female? Please write just f or m.");
        char customerGender = '0';
        customerGender = scanner.next().charAt(0);
        newCustomer.gender=customerGender;



        System.out.println("\nNow, tell me how can we contact you? Complete \nYour telephone number: ");
        String customerTelephoneNumber = "";
        customerTelephoneNumber = scanner.nextLine();
        newCustomer.telephoneNumber = customerTelephoneNumber;

        System.out.println("\nYour mail address: " );
        String customerMailAddress = null;
        customerMailAddress = scanner.nextLine();
        newCustomer.mailAddress=customerMailAddress;

        System.out.println("Make sure you wrote the correct information!\n "+newCustomer);
        //System.out.println("\nRecap your order:\n "+newOrder);

        System.out.println("\nThank you for you order! \n You will receive an email for confirmation in the next 5 minutes.");


    }
}
