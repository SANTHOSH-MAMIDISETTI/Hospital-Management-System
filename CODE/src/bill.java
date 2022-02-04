import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class bill extends cashier{

    void cashier_bill() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("No of medicine of price 100:-");
    	int a = input.nextInt();
    	System.out.println("No of medicine of price 200:-");
    	int b = input.nextInt();
    	System.out.println("No of medicine of price 300:-");
    	int c = input.nextInt();
    	int TOTAL  = (a*100)+(b*200)+(c*300);
    	System.out.println("TOTAL AMOUNT =" + TOTAL  );
    	
    	System.out.println("");
    	System.out.println("To verify please type again" );
        System.out.println("total_amount:-");
        camount = input.nextInt();
        if (camount==TOTAL) {
        	System.out.println("Verfied");
        }
        else 
        	System.out.println("Not same . You have one more chance !! ");
            System.out.println(" Type total_amount:-");
            camount = input.nextInt();
            if (camount==TOTAL) {
            	System.out.println("Verfied  !! "); 	
            }
            else 
            	System.out.println("Not same !! ");
    }

    void view_medicine() {
    	 File file = new File("medicine.txt");
    	 BufferedInputStream bis = null;
 	    
         try (BufferedReader br = new BufferedReader(new FileReader(file)))
         {
             String line;
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
 	
 }
}