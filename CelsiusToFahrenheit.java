public class CelsiusToFahrenheit {

    // Function to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Convert Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        // Assign a predefined value for temperature in Celsius
        double celsius = 25.0;

        // Call the convertCelsiusToFahrenheit function and store the result
        double fahrenheit = convertCelsiusToFahrenheit(celsius);

        // Display the converted temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
