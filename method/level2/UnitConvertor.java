public class UnitConvertor {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        double km = 10;
        System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles");

        double miles = 6.2;
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");

        double meters = 5;
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");

        double feet = 16.4;
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}