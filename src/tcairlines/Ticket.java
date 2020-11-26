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
    private int seatNum;
    private Airplane airName;
    
    
    public Ticket(){
        name="";
        seatNum=0;
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
        String theSeatNum;
        int seatNumDup=seatNum;
        if(seatNum<10){
            theSeatNum="A"+seatNum;
        }else if(seatNum>=10 && seatNum<20){
            seatNumDup-=10;
            theSeatNum="B"+seatNumDup;
        }else{
            seatNumDup-=20;
            theSeatNum="C"+seatNumDup;
        }
        return theSeatNum;
    }
    
    public int getIntSeatNum(){
        return this.seatNum;
    }

    /**
     * @param seatNum the seatNum to set
     * @throws tcairlines.TCAirplaneFull
     */
    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
    
//    public String purchaseTicket(){
//        
//    }
    
    @Override
    public String toString(){
        return "Name: "+name+" "+"\n"+"Seat Number: "+this.getSeatNum()+"\n"+airName.toString(); //dont forget airName.toString()
    }
    
    public String purchaseTicket(int theSeatNum) throws TCAirplaneFull {
        boolean isFull;
        isFull=airName.checkFull(theSeatNum);
        if(isFull){
            throw new TCAirplaneFull("");
        }
        String theRealSeatNum;
        int seatNumDup=theSeatNum;
        if(theSeatNum<10){
            theRealSeatNum="A"+theSeatNum;
        }else if(theSeatNum>=10 && theSeatNum<20){
            seatNumDup-=10;
            theRealSeatNum="B"+seatNumDup;
        }else{
            seatNumDup-=20;
            theRealSeatNum="C"+seatNumDup;
        }
        return theRealSeatNum;
    }
}
