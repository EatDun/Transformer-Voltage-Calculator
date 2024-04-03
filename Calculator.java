import java.lang.Math;
import java.util.Scanner;

class TransformerCalculator{
    
    public static double secondaryVoltage (int wind1, int wind2, double e) {
        
        double windRatio = wind1 / wind2;
        
        return e / windRatio;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter number of primary windings\n");
        
        Scanner primaryWind = new Scanner(System.in);
        
        int primWinds = primaryWind.nextInt();
        
        System.out.println("Enter number of secondary windings\n");
        
        Scanner secondWind = new Scanner(System.in);
        
        int secWinds = secondWind.nextInt();
        
        System.out.println("Enter primary side voltage\n");
        
        Scanner primaryVoltage = new Scanner(System.in);
        
        double primVolt = primaryVoltage.nextDouble();
        
        double secVolt = secondaryVoltage(primWinds, secWinds, primVolt);
        
        System.out.println("The secondary voltage is " + secVolt);
        
    }
}
