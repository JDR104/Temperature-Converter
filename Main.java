import java.util.Scanner;

public class TempCoFree
{
    public static void main(String[]args)
    {
        Scanner jsph = new Scanner(System.in);
        double clsus, fhrnht, klvn, kTc, cTk, kTf, fTc, cTf, fTk;
        int cMethod;

        System.out.println("Please Choose a conversion method:");
        System.out.println("Kelvin to Celsius = 1");
        System.out.println("Celsius to Kelvin = 2");
        System.out.println("Kelvin to Fahrenheit = 3");
        System.out.println("Fahrenheit to Celsius = 4");
        System.out.println("Celsius to Fahrenheit = 5");
        System.out.println("Fahrenheit to Kelvin = 6");
        System.out.println("");
        System.out.println("Enter '7' to quit");

        cMethod = jsph.nextInt();
        while (cMethod >= 1 && cMethod <= 100) {

            System.out.println("Method: " + cMethod);

            klvn = 0;
            clsus = 0;
            fhrnht = 0;
            kTc = klvn - 273.15;
            cTk = clsus + 273.15;
            kTf = 1.8 * kTc + 32;
            fTc = (fhrnht - 32)/1.8; 
            cTf = 1.8 * clsus + 32;
            fTk = fTc + 273.15;

            if(cMethod == 1) { 
                System.out.print("Kelvin: ");
                klvn = jsph.nextDouble();

                kTc = klvn - 273.15;
                cTk = clsus + 273.15;
                kTf = 1.8 * kTc + 32;
                fTc = (fhrnht - 32)/1.8; 
                cTf = 1.8 * clsus + 32;
                fTk = fTc + 273.15;

                clsus = kTc;
                System.out.println("Celsus: " + clsus);

            }
            else if(cMethod == 2) {
                System.out.print("Celsius: ");
                clsus = jsph.nextDouble();

                kTc = klvn - 273.15;
                cTk = clsus + 273.15;
                kTf = 1.8 * kTc + 32;
                fTc = (fhrnht - 32)/1.8; 
                cTf = 1.8 * clsus + 32;
                fTk = fTc + 273.15;

                klvn = cTk;
                System.out.println("Kelvin: " + klvn);

            }
            else if(cMethod == 3) {
                System.out.print("Kelvin: ");
                klvn = jsph.nextDouble();

                kTc = klvn - 273.15;
                cTk = clsus + 273.15;
                kTf = 1.8 * kTc + 32;
                fTc = (fhrnht - 32)/1.8; 
                cTf = 1.8 * clsus + 32;
                fTk = fTc + 273.15;

                fhrnht = kTf;
                System.out.println("Fahrenheit: " + fhrnht);

            }
            else if(cMethod == 4) {
                System.out.print("Fahrenheit: ");
                fhrnht = jsph.nextDouble();

                kTc = klvn - 273.15;
                cTk = clsus + 273.15;
                kTf = 1.8 * kTc + 32;
                fTc = (fhrnht - 32)/1.8; 
                cTf = 1.8 * clsus + 32;
                fTk = fTc + 273.15;

                clsus = fTc;
                System.out.println("Celsius: " + clsus);

            }
            else if(cMethod == 5) {
                System.out.print("Celsius: ");
                clsus = jsph.nextDouble();

                kTc = klvn - 273.15;
                cTk = clsus + 273.15;
                kTf = 1.8 * kTc + 32;
                fTc = (fhrnht - 32)/1.8; 
                cTf = 1.8 * clsus + 32;
                fTk = fTc + 273.15;

                fhrnht = cTf;
                System.out.println("Fahrenheit: " + fhrnht);

            }
            else if(cMethod == 6) {
                System.out.print("Fahrenheit: ");
                fhrnht = jsph.nextDouble();

                kTc = klvn - 273.15;
                cTk = clsus + 273.15;
                kTf = 1.8 * kTc + 32;
                fTc = (fhrnht - 32)/1.8; 
                cTf = 1.8 * clsus + 32;
                fTk = fTc + 273.15;

                klvn = fTk;
                System.out.println("Kelvin: " + klvn);

            }
            else if(cMethod == 7){
                System.out.println("Thank you");
                break;
            }
            else if (cMethod > 7){  
                System.out.print ("Sorry the number " + cMethod + " is invalid. Please try a number between 1 and 6.");
            }

            System.out.println("Please Choose a conversion method:");
            System.out.println("Enter '7' to end");

            cMethod = jsph.nextInt();
            if(cMethod == 7){
                System.out.println("Thank you");
                break;
            }
            else if(cMethod > 9000){
                System.out.println("ITS OVER 9000!!");
            }
        }
    }
}
