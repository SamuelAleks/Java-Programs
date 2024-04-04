package net.codejava;

// stores info on the parked car

public class ParkedCar
{
   private String make;
   private String model;
   private String color;
   private String licenseNumber;
   private int minutesParked;

   public ParkedCar(String mk, String mod, String col,
                    String lic, int min)
   {
      make = mk;
      model = mod;
      color = col;
      licenseNumber = lic;
      minutesParked = min;
   }

   
   public ParkedCar(ParkedCar car2)
   {
      make = car2.make;
      model = car2.model;
      color = car2.color;
      licenseNumber = car2.licenseNumber;
      minutesParked = car2.minutesParked;
   }
   
   //  cars make

   public void setMake(String m)
   {
      make = m;
   }

   // car model

   public void setModel(String m)
   {
      model = m;
   }

   // set the car's color

   public void setColor(String c)
   {
      color = c;
   }

   // sets the license number

   public void setLicenseNumber(String lic)
   {
      licenseNumber = lic;
   }

   // sets the minutes car was parked

   public void setMinutesParked(int m)
   {
      minutesParked = m;
   }

   // gets car make

   public String getMake()
   {
      return make;
   }

   // gets car model
   
   public String getModel()
   {
      return model;
   }

   // returns model
   
   public String getColor()
   {
      return color;
   }

   // returns license number

   public String getLicenseNumber()
   {
      return licenseNumber;
   }

   // returns minutes parked

   public int getMinutesParked()
   {
      return minutesParked;
   }

   // String gathers inputs and generates output with all of them
   
   public String toString()
   {
      String str = "Make: " + make +
                   "\nModel: " + model +
                   "\nColor: " + color +
                   "\nLicense Number: " + 
                   licenseNumber +
                   "\nMinutes Parked: " +
                   minutesParked;
      return str;
   }
}
