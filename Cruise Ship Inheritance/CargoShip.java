package net.codejava;

/**
   Stores data for CargoShip
*/

public class CargoShip extends Ship
{
   private int tonnage;    // Cargo tonnage

   CargoShip(String n, String y, int t)
   {
      // Call the superclass constructor (Ship)
      super(n, y);
      
      // Set tonnage
      tonnage = t;
   }
   
   /**
      set maximum tonnage
   */
   public void setTonnage(int t)
   {
      tonnage = t;
   }
   
   /**
      return cargo capacity in tons
   */
   public int getTonnage()
   {
      return tonnage;
   }

   /**
      String reference for name and tonnage
   */
   public String toString()
   {
      return "Name: " + getName() + "\nCargo capacity: " +
             tonnage + " tons";
   }
}