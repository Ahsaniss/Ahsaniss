public class EarthSurfaceArea {
    
    // Function to calculate the surface area of the Earth
    public static double calculateEarthSurfaceArea() {
        double radius = 6378.1; // in kilometers
        double flatteningFactor = 1.0 / 298.257223563;
        double eccentricity = 0.08181919;
        
        double sinInverse = Math.asin(flatteningFactor);
        double area = 4 * Math.PI * radius * radius * (1 + (Math.pow(1 - flatteningFactor, 2) / (1 + Math.pow(eccentricity, 2))) * sinInverse);
        
        return area;
    }

    public static void main(String[] args) {
        double earthSurfaceArea = calculateEarthSurfaceArea();
        System.out.println("Surface area of the Earth: " + earthSurfaceArea + " square kilometers");
    }
}
