package net.codejava;


// stores parking meter info



public class ParkingMeter
{
   private int minutesPurchased;

   // number of minutes purchased

   public ParkingMeter(int m)
   {
      minutesPurchased = m;
   }

   public void setMinutesPurchased(int m)
   {
      minutesPurchased = m;
   }

   // return minutes purchased

   public int getMinutesPurchased()
   {
      return minutesPurchased;
   }
}
