/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcairlines;

import java.util.Scanner;

/**
 *
 * @author JRios15_17
 */
public class TCAirlines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TCAirplaneFull {
        Airplane TC200=new Airplane();
        Airplane TC400=new Airplane();
        Ticket myTicket=new Ticket();
        int[] seatTC200=new int[30];
        int[] seatTC400=new int[30];
        
        for(int i=0; i<30; i++){
            seatTC200[i]=0;
            seatTC400[i]=0;
        }
        
        TC200.setAirplaneName("TC200");
        TC200.setArrivalTime("11:30 AM");
        TC200.setDepartCity("Greensboro");
        TC200.setDepartDate("December 12, 2020");
        TC200.setDepartTime("10 AM");
        TC200.setDestination("Newark");
        TC200.setAllSeats(seatTC200);
        
        TC400.setAirplaneName("TC400");
        TC400.setArrivalTime("5:30 PM");
        TC400.setDepartCity("Newark");
        TC400.setDepartDate("December 12, 2020");
        TC400.setDepartTime("4 PM");
        TC400.setDestination("Greensboro");
        TC400.setAllSeats(seatTC400);
        
        System.out.println("Option 1: ");
        System.out.print(TC200.toString());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Option 2:");
        System.out.print(TC400.toString());
        
        int option;
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Choose which option you want?");
        option=myScanner.nextInt();
        if(option==1){
            myTicket.setAirName(TC200);
        }else if(option == 2){
            myTicket.setAirName(TC400);
        }else{
            System.out.println("Please try again later");
            option = myScanner.nextInt();
            if(option==1){
                myTicket.setAirName(TC200);
            }else if(option == 2){
                myTicket.setAirName(TC400);
            }
        }
        Scanner nameScanner=new Scanner(System.in);
        String myName="";
        System.out.println("Please enter name: ");
        myName=nameScanner.nextLine();
        myTicket.setName(myName);
        
        int mySeatNum=0;
        System.out.println("Enter desired seat:    (Please choose in betwee 1-30)");
        mySeatNum=myScanner.nextInt();
        mySeatNum-=1;
        myTicket.setSeatNum(mySeatNum);
        
        myTicket.purchaseTicket(mySeatNum);
        
        System.out.println("Here is your ticket information. Have a Nice Day!");
        System.out.println(myTicket.toString());
        
        int wantReturn;
        System.out.println("Would you like to return? (Enter 1 for yes, 0 for no");
        wantReturn=myScanner.nextInt();
        
        if(wantReturn==1){
            myTicket.getAirName().removeSeat(mySeatNum);
            myTicket=new Ticket();
            System.out.println("Your order has been canceled. Try again later");
        }else{
            System.out.println("Thank you for you purchase!");
        }
    }
    
}
