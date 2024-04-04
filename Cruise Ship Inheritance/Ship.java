package net.codejava;

/**
   stores data for ship
*/

public class Ship
{
   private String name;         // Ship name
   private String yearBuilt;    // Year constructed
   
   
   public Ship(String n, String y)
   {
      name = n;
      yearBuilt = y;
   }
   
   /**
      sets name
   */
   public void setName(String n)
   {
      name = n;
   }

   /**
      sets year built
   */
   public void setYearBuilt(String y)
   {
      yearBuilt = y;
   }


   /**
      returns name
   */
   public String getName()
   {
      return name;
   }

   /**
      returns year built
   */
   public String getYearBuilt()
   { 
      return yearBuilt;
   }
   
   /**
      return string with name and year of construction
   */
   public String toString()
   {
      return "Name: " + name + "\nYear built: " +
             yearBuilt;
   }
}