package com.company;
import java.time.Year;
import java.util.*;
import java.util.concurrent.Flow;

//Flowershop Online
//in progress
public class Main {

    public static void main(String[] args) {

      // order o1 = new order(101,d1,c1,f1);
       //System.out.println(o1.toString());

        Bouquet redRoses = new Bouquet("Bouquet of red roses", 100, "Roses",9, "red");
        Bouquet whiteRoses = new Bouquet("Bouquet of white roses", 99.9, "Roses",9, "white");
        Bouquet colorfulRoses = new Bouquet("Bouquet of colorful roses", 120, "Roses",9, "colorful");
        Bouquet redTulips = new Bouquet("Bouquet of red tulips", 50, "Tulips",9, "red");
        Bouquet whiteTulips = new Bouquet("Bouquet of white tulips", 50.5, "Tulips",9,"white");
        Bouquet colorfulTulips = new Bouquet("Bouquet of colorful tulips", 65.49, "Tulips", 9,"colorful");

        GiftBox beautySmall = new GiftBox("Small GiftBox with beauty products", 150, "small", "Beauty");
        GiftBox beautyMedium = new GiftBox("Medium GiftBox with beauty products", 300, "medium", "Beauty");
        GiftBox beautyLarge = new GiftBox("Large GiftBox with beauty products", 450, "large", "Beauty");
        GiftBox sweetsSmall = new GiftBox("Small GiftBox with sweets products", 50, "small", "Sweets");
        GiftBox deluxeSmall = new GiftBox("Small GiftBox with champagne and flowers", 150, "small", "Deluxe");
        GiftBox deluxeLarge = new GiftBox("Large GiftBox with champagne and flowers", 250, "large", "Deluxe");

        Address adFlowerShop1 = new Address("Bacau", "Bacau", "Nicu Enea", "15", 600190);
        Address adFlowerShop2 = new Address("Bucuresti", "Sector 1", "Academiei", "12A", 729302);
        FlowerShop f1 = new FlowerShop("Floraria din Povesti", "0234484909", "florariadinpovestibacau@gmail.com",adFlowerShop1);
        FlowerShop f2 = new FlowerShop("Floraria din Povesti", "0231849540", "florariadinpovestibucuresti@gmail.com", adFlowerShop2);


        Date dc1 = new Date(16,12,2000);
        Customer c1 = new Customer("Buiciuc", "Ana", 'f',  "0735239310", "anabuiciuc@gmail.com", dc1, "1028282910111");

        Address adRecipient1 = new Address("Bacau", "Bacau", "Stefan cel Mare", "17B", 600191);
        Recipient r1 = new Recipient("Buiciuc", "Cristina", 'f', "0756941010", "cristinabuiciuc@yahoo.com", adRecipient1);

        Address adRecipient2 = new Address("Bucuresti", "Sector 1", "Calea Grivitei", "178", 746091);
        Recipient r2 = new Recipient ("Popa", "Radu", 'm', "07477474018", "popa.radu@yahoo.ro", adRecipient2);

        Date dorder1 = new Date(30,3,2021);
        List<Product> fl1 = new ArrayList<>();
        fl1.add(whiteRoses); fl1.add(colorfulTulips); fl1.add(deluxeLarge);
        Order order1 = new Order(0,dorder1,c1,r1,3,fl1,f1);
        System.out.println(order1);

        Date dorder2 = new Date(2,4,2021);
        List<Product> fl2 = new ArrayList<>();
        fl2.add(sweetsSmall); fl2.add(deluxeSmall);
        Order order2 = new Order(1, dorder2, c1, r2, 2, fl2,f2);
        System.out.println(order2);

     //   System.out.println("Your total: "+ordernew.getTotalCost());
       // System.out.println("\nYour products includes these cards: ");
      //  ordernew.showMessages();

       // Scanner scanner = new Scanner(System.in);
      //  Date d1 = new Date(16,12,2000);
      //  customer c1 = new customer("Buiciuc", "Ana", d1, 16290, 'f', "0735239310", "anabuiciuc@gmail.com");


      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! ");
        Customer newCustomer = new Customer();
        System.out.println("What is your (first) name?");
        String customerFirstName = null;
        customerFirstName = scanner.next();
        newCustomer.firstName = customerFirstName;

       System.out.println( "Nice to meet you! "
               + "I'm your assistant, Ana. ");*/
      /*int option = 0;
        option = scanner.nextInt();
        Order newOrder = new Order();
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

                                case 1 -> newOrder.setMyProduct((List<Product>) redRoses);
                                case 2 -> newOrder.setMyProduct((List<Product>) whiteRoses);
                                case 3 -> newOrder.setMyProduct((List<Product>) colorfulRoses);
                            }
                        }

                        case 2 -> {

                            switch(optionColorFlowers){

                                case 1 -> newOrder.setMyProduct((List<Product>) redTulips);
                                case 2 -> newOrder.setMyProduct((List<Product>) whiteTulips);
                                case 3 -> newOrder.setMyProduct((List<Product>) colorfulTulips);
                            }
                        }
                    }




            }

            case 2 ->
                    {
                        System.out.println("in progress");

                    }



        }


*/
      /*  int option = 0;
        Order newOrder = new Order();
        System.out.println("These are our available products:\n");
        int i=0;
        System.out.println(i+". "+redRoses+"\n"); i++;
        System.out.println(i+". "+whiteRoses+"\n"); i++;
        System.out.println(i+". "+colorfulRoses+"\n"); i++;
        System.out.println(i+". "+redTulips+"\n"); i++;
        System.out.println(i+". "+whiteTulips+"\n"); i++;
        System.out.println(i+". "+colorfulTulips+"\n"); i++;
        System.out.println(i+". "+beautySmall+"\n"); i++;
        System.out.println(i+". "+beautyMedium+"\n"); i++;
        System.out.println(i+". "+beautyLarge+"\n"); i++;
        System.out.println(i+". "+sweetsSmall+"\n"); i++;
        System.out.println(i+". "+deluxeSmall+"\n"); i++;
        System.out.println(i+". "+deluxeLarge+"\n");*/




      //  System.out.println("Your order:\n "+newOrder.getNumberOfProducts()+" "+newOrder.getMyProduct()+".");
       // System.out.println("\n Your price is "+ newOrder.getTotalCost()+" RON.");
        //System.out.println("\nNow, please let me know you better. ");




     // customer newCustomer = new customer();
   //    System.out.println("Last name:");
     //  String customerLastName = null;
     //  customerLastName = scanner.next();
     //  newCustomer.lastName = customerLastName;

       /* System.out.println("First name:");
        String customerFirstName = null;
        customerFirstName = scanner.next();
        newCustomer.firstName = customerFirstName;*/

      /*  System.out.println("When were you born? Digits only!\n");
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

        System.out.println("\nNow, tell me how can we contact you?\n");
        System.out.println("Complete Your telephone number:");
        String customerTelephoneNumber = null;
        customerTelephoneNumber = scanner.next();
        newCustomer.telephoneNumber = customerTelephoneNumber;

        System.out.println("\nYour mail address: " );
        String customerMailAddress = null;
        customerMailAddress = scanner.next();
        newCustomer.mailAddress=customerMailAddress;

        System.out.println("Make sure you wrote the correct information!\n "+newCustomer);
        //System.out.println("\nRecap your order:\n "+newOrder);

        System.out.println("\nThank you for you order! \n You will receive an email for confirmation in the next 5 minutes.");
*/


    }
}
