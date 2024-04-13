package Assignments4;

import java.util.Scanner;

public class TemperatureConverter {
    public static double CelsuistoFahrenheit(double celsuis){
        return ( celsuis* 9/5)+32;

    }
    public static double Celsuistokelvin(double celsuis)
    {
        return celsuis+273.15;
    }

    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value of celsuis");
      double celsuis = scanner.nextDouble();
        double Fehrenheit = CelsuistoFahrenheit(celsuis);
        System.out.println(celsuis + "degrees celsuis is equal to " + Fehrenheit + " degrees fahrenheit");
        double kelvin = Celsuistokelvin(celsuis);
        System.out.println( celsuis + "degrees celsuis is equal to " + kelvin + " kelvin");
    }
}
