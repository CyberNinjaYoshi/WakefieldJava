import java.util.Scanner;
public class Unit2Project_Calculators {
    public static void main(String[] args){
        //Subject: Physics
        //setting up scanner 
        Scanner s = new Scanner(System.in);

        //asking user for which equation they would like to use
        System.out.println("\n\n\nPhysic Equations:");
        System.out.print("Displacement (1)\nNewtons 2nd Law (2)\nDensity (3)\nType number of the equation: ");
        int equation = s.nextInt();

        //if number inputted does not match an equation number, it will end
        while(equation==1 || equation == 2 || equation == 3 ){
        
        // Conditional Statements that will only use the number 
        //inputted that matches one of the numbers to an equation
        // if not, it will end the loop

        if(equation == 1){
            //equation for displacement that will show the formula and ask for values
            System.out.println("\n\n\n\n\n\n\n\n\nDisplacement: d = vi * t + 1/2 * a * t^2");
            System.out.print("Initial velocity (vi): ");
            double vi = s.nextDouble();
            System.out.print("Time (t): ");
            double t = s.nextDouble();
            //logic check for negative time
            while(t<0){
                System.out.print("Time (t) can't be negative: ");
                t = s.nextDouble();
            }
            System.out.print("Acceleration (a): ");
            double a = s.nextDouble();
            double d = (vi * t) + (1/2 * a) * (t*t);
            System.out.println("\nDisplacement: "+d);

            
        }   
        else if(equation == 2){
            //equation for force that will show the formula and ask for values
            System.out.println("\n\n\n\n\n\n\n\n\nNewtons 2nd Law: F = m * a");
            System.out.print("Mass (m): ");
            double m = s.nextDouble();
            //logic check for negative mass
            while(m<0){
                System.out.print("Mass (m) can't be negative: ");
                m = s.nextDouble();
            }
            System.out.print("Acceleration (a): ");
            double a = s.nextDouble();
            double F = m*a;
            System.out.println("\nNewtons 2nd Law (Force): "+F);


        }
        else if(equation == 3){
            //equation for density that will show the formula and ask for values
            System.out.println("\n\n\n\n\n\n\n\n\nDensity: d = m / v");
            System.out.print("Mass (m): ");
            double m = s.nextDouble();
            //logic check for negative mass
            while(m<0){
                System.out.print("Mass (m) can't be negative: ");
                m = s.nextDouble();
            }
            System.out.print("Volume (v): ");
            double v = s.nextDouble();
            //logic check for negative volume
            while(v<0){
                System.out.print("Volume (v) can't be negative: ");
                m = s.nextDouble();
            }
            double d = m/v;
            System.out.println("\nNewtons 2nd Law (Force): "+d);


        }
        //asks the user once again for which other equation they would like to use
        System.out.println("\n\n\n\n\n\n\n\n\nPhysic Equations:");
        System.out.print("Displacement (1)\nNewtons 2nd Law (2)\nDensity (3)\nType number of the equation: ");
        equation = s.nextInt();

        }
        //ends when they dont input any of the equation numbers
        System.out.println("\n\n\n\n\n\n\n\nIts been fun! Bye!");



    }
}
