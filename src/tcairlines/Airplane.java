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
public class Airplane {
    private String departCity;
    private String destination;
    private String departDate;
    private String departTime;
    private String arrivalTime;
    private String airplaneName;
    private int[] allSeats;
    
    public Airplane(){
        departCity="";
        destination="";
        arrivalTime="";
        departDate="";
        departTime="";
        airplaneName="";
        allSeats=new int[30];
    }

    /**
     * @return the departCity
     */
    public String getDepartCity() {
        return departCity;
    }

    /**
     * @param departCity the departCity to set
     */
    public void setDepartCity(String departCity) {
        this.departCity = departCity;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the departDate
     */
    public String getDepartDate() {
        return departDate;
    }

    /**
     * @param departDate the departDate to set
     */
    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    /**
     * @return the departTime
     */
    public String getDepartTime() {
        return departTime;
    }

    /**
     * @param departTime the departTime to set
     */
    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    /**
     * @return the airplaneName
     */
    public String getAirplaneName() {
        return airplaneName;
    }

    /**
     * @param airplaneName the airplaneName to set
     */
    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    /**
     * @return the allSeats
     */
    public int[] getAllSeats() {
        return allSeats;
    }

    /**
     * @param allSeats the allSeats to set
     */
    public void setAllSeats(int[] allSeats) {
        this.allSeats = allSeats;
    }
    
    @Override
    public String toString(){
        return "Airplane Name:"+airplaneName+"\n"+"Depart Date: "+departDate+"\n"+"Departing: "+departCity+"\n"+"Depart Time: "+departTime+"\n"+"Destination: "+destination+"\n"+"Arrive at:"+arrivalTime+"\n";
    }

    /**
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public boolean checkFull(int seatNum){
        int count =0;
        if (allSeats[seatNum] == 1){
            System.out.print("Seat not Available");
         for (int i =0; i<allSeats.length; i++){
            int hold=allSeats[i];
            if (hold != 1){
                break;
            }
            count ++;
            if (count >= 30){
                System.out.print("Plane full");
                return true;
            }
         }
        }
        return false;
    }
    
    public void removeSeat(int seatNum){
        allSeats[seatNum]=0;
    }
}
