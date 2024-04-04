package net.codejava;

/**
   stores data for cruise ship
*/

public class CruiseShip extends Ship
{
   private int passengers;    // Maxi num passengers

   CruiseShip(String n, String y, int p)
   {
      // Call the superclass constructor (Ship)
      super(n, y);
      
      // Set passengers.
      passengers = p;
   }
   
   /**
      sets passengers
   */
   public void setPassengers(int p)
   {
      passengers = p;
   }
   
   /**
      sets max num of passengers
   */
   public int getPassengers()
   {
      return passengers;
   }

   /**
      return ship name and max num of passengers
   */
   public String toString()
   {
      return "Name: " + getName() + "\nMaximum passengers: " +
             passengers;
   }
}