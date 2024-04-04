package net.codejava;

/**
   Stores data on police officer
*/
public class PoliceOfficer
{
   private String name;          // Officer's name
   private String badgeNumber;   // Badge number

   public PoliceOfficer(String n, String bn)
   {
      name = n;
      badgeNumber = bn;
   }

   public PoliceOfficer(PoliceOfficer officer2)
   {
      name = officer2.name;
      badgeNumber = officer2.badgeNumber;
   }

   // sets officer name

   public void setName(String n)
   {
      name = n;
   }

   // sets badge number

   public void setBadgeNumber(String b)
   {
      badgeNumber = b;
   }

   // returns officer name

   public String getName()
   {
      return name;
   }

   // return badge #

   public String getBadgeNumber()
   {
      return badgeNumber;
   }

   // looks at minutes parked and minutes puchased and returns either a fine or null
   
   public ParkingTicket patrol(ParkedCar car, 
                               ParkingMeter meter)
   {
      ParkingTicket ticket = null;  // references ticket

      // gets minutes over time that was purchased
      int illegalMinutes = car.getMinutesParked() - 
                           meter.getMinutesPurchased();
      
      // determines if parking was illegal     
      if (illegalMinutes > 0)
      {
         // it is parked illegally
         ticket = new ParkingTicket(car, this, illegalMinutes);
      }  
      // return ticket if applicable
      return ticket;
   }

   public String toString()
   {
      String str = "Name: " + name +
                   "\nBadgeNumber: " + badgeNumber;  
      // Return string
      return str;
   }
}
