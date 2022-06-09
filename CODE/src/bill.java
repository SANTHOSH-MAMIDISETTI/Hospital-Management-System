import java.io.*;
import java.util.Arrays;
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

        for (String s : Arrays.asList("", "To verify please type again", "total_amount:-")) {
            System.out.println(s);
        }
        camount = input.nextInt();
        if (camount==TOTAL) System.out.println("Verified");
        else 
        	System.out.println("Not same . You have one more chance !! ");
            System.out.println(" Type total_amount:-");
            camount = input.nextInt();
            if (camount==TOTAL) {
            	System.out.println("Verified  !! ");
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