package net.codejava;

public class ShipDemo
{
   public static void main(String[] args)
   {
      // # of ships constant
      final int NUM_SHIPS = 3;
      
      // Creates for ship
      Ship[] ships = new Ship[NUM_SHIPS];
      
      // Assigns objects to array elements
      ships[0] = new Ship("OceanMagic", "2021");
      ships[1] = new CruiseShip("Dreamliner", "1998", 3000);
      ships[2] = new CargoShip("QueenOfTheOcean", "1890", 70);
      
      for (int index = 0; index < 3; index++)
      {
         System.out.println(ships[index]);
         System.out.println("----------------------------");
      }
   }
}
