package net.codejava;

import java.text.DecimalFormat;

/**
   Stores data for the parking ticket
*/

public class ParkingTicket
{
   private ParkedCar car;           
   private PoliceOfficer officer;
   private int minutes;
   private double fine;


   // base fine constant
   public final double BASE_FINE = 25.0;
   
   // hourly fine constant
   public final double HOURLY_FINE = 10.0;

   // Constructs Parked car, police officer, and minutes illegally parked
   
   public ParkingTicket(ParkedCar aCar, 
                        PoliceOfficer anOfficer,
                        int min)
   {
      car = new ParkedCar(aCar);
      
      officer = new PoliceOfficer(anOfficer);
      
      minutes = min;

      calculateFine();
   }

      
   public ParkingTicket(ParkingTicket ticket2)
   {
      car = new ParkedCar(ticket2.car);
      
      officer = new PoliceOfficer(ticket2.officer);
      
      // Assign the fine.
      fine = ticket2.fine;
   }

   //   calculates amount for fine

   private void calculateFine()
   {
      // Gets time parked in hours
      double hours = minutes / 60.0;
      
      // int hours for ticket
      int hoursInt = (int)hours;
      
      // If only part of an hour, then round up
      if ((hours - hoursInt) > 0)
         hoursInt++;

      fine = BASE_FINE;
      
      // Adds the extra hourly fines
      fine += (hoursInt * HOURLY_FINE);
   }

   public void setCar(ParkedCar c)
   {
      // Make a copy of object refernced by c.
      car = new ParkedCar(c);
   }

   // set Officer method

   public void setOfficer(PoliceOfficer o)
   {
      // copy of object in o
      officer = new PoliceOfficer(o);
   }

   // copy of car field

   public ParkedCar getCar()
   {
      return new ParkedCar(car);
   }

   // return fine amount

   public double getFine()
   {
      return fine;
   }

   // returns copy of officer field

   public PoliceOfficer getOfficer()
   {
      return new PoliceOfficer(officer);
   }
   
   public String toString()
   {
      // Creates a decimal format for formatting
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      String str = "Car Data:\n" + car +
                   "\nOfficer Data:\n" + officer +
                   "\nMinutes Illegally Parked: " + minutes +
                   "\nFine: $" + dollar.format(fine);
      return str;
   }
}
