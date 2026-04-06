package Week2Restart;

public class TempreatureConverter {

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }
    static double fahrenheitTocelsius(double fahrenheit ) {
        return (fahrenheit - 32) * 5/9;
    }



    public static void main(String[] args) {

        double result1 = celsiusToFahrenheit(100);
        System.out.println(result1);

        double result2 = fahrenheitTocelsius(100);
        System.out.println(result2);
    }
}
