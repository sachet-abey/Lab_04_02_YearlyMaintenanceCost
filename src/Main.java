public class Main {
    public static void main(String[] args) {
        double springCost = 100.15; // Initialize spring cost
        double winterCost = 120.79; // Initialize winter cost
        double summerCost = 115.00; // Initialize summer cost
        double fallCost = 89.55; // Initialize fall cost
        double totalMaintenanceCost = springCost + winterCost + summerCost + fallCost; // Calculate the total maintenance yearly costs
        System.out.println("The total yearly maintenance costs for the seasonal costs "+springCost+" "+winterCost+" "+summerCost+" "+fallCost+" is "+totalMaintenanceCost); // Print results
    }
}