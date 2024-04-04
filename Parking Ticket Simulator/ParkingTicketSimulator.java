package net.codejava;

public class ParkingTicketSimulator
{
   public static void main(String[] args)
   {
      // creates a ParkedCar object.
      // car is parked for set time
      ParkedCar car = new ParkedCar("Honda", "20012", "Black",
                                    "PR009", 231);
      
      // Creates a ParkingMeter object, 60 minutes is time at meter
      ParkingMeter meter = new ParkingMeter(60);

      // Creates PoliceOfficer object
      PoliceOfficer officer = new PoliceOfficer("Steve Gordons",
                                                "912");
                                                
      // officer patrols
      ParkingTicket ticket = officer.patrol(car, meter);
      
      // if else statement for officer issuing ticket
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");
   }
}
