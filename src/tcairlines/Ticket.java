/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcairlines;

/**
 *
 * @author JRios15_17
 */
public class Ticket {
    private String name;
    private String seatNum;
    private Airplane airName;
    
    
    public Ticket(){
        name="";
        seatNum="";
        airName=new Airplane();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the airName
     */
    public Airplane getAirName() {
        return airName;
    }

    /**
     * @param airName the airName to set
     */
    public void setAirName(Airplane airName) {
        this.airName = airName;
    }

    /**
     * @return the seatNum
     */
    public String getSeatNum() {
        return seatNum;
    }

    /**
     * @param seatNum the seatNum to set
     */
    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }
    
//    public String purchaseTicket(){
//        
//    }
    
    @Override
    public String toString(){
        return "Name: "+name+" "+"Seat Number: "+seatNum; //dont forget airName.toString()
    }
    
}
