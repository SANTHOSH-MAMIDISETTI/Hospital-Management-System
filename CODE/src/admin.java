import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class admin {
	String adid, adname;
	int age;

    void admin_info() {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        adid = input.nextLine();

        System.out.print("name:-");
        adname = input.nextLine();

    }

    void UpdatePatient() {
    	Scanner input = new Scanner(System.in);
    	
         
    	 System.out.println("Enter limit");
         Scanner in = new Scanner(System.in);  
         
         int size=in.nextInt();
         int[] myList=new int[size];
         
        
        int i;

        for (i = 0; i < myList.length; i++) {
            
        	System.out.print("id:-");
            String pid = input.nextLine();

            System.out.print("name:-");
            String pname = input.nextLine();

            System.out.print("disease:-");
            String disease = input.nextLine();

            System.out.print("sex:-");
            String sex = input.nextLine();

            try{
            	System.out.print("age:-");
            	int age = input.nextInt();
            }
            catch (InputMismatchException a){

                System.out.print("Enter number  of patient to be added");

            }
            try{
                File file =new File("patient.txt");
          	  if(!file.exists()){
          	 	file.createNewFile();
          	  }
          	  FileWriter fw = new FileWriter(file,true);
          	  BufferedWriter bw = new BufferedWriter(fw);
          	  PrintWriter pn = new PrintWriter(bw);
        
          	  pn.println( pid+"\t"+"\t"+ pname+"\t "+"\t"+ disease+"\t \t" + sex +"\t \t"+ age );
          	  pn.close();
          }
          catch(IOException ia){
          	   System.out.println("Exception occurred:");
          	   ia.printStackTrace();
            }

            
        	
        }
        
    }
    void Updatedoctor() {
    	Scanner input = new Scanner(System.in);
    	
         
    	 System.out.println("Enter number  of doctor to be added");
         Scanner in = new Scanner(System.in);  
         
         int size=in.nextInt();
         int[] myList=new int[size];
         
        
        int i;

        for (i = 0; i < myList.length; i++) {
            
          
            
        	System.out.print("id:-");
            String did = input.nextLine();

            System.out.print("name:-");
            String dname = input.nextLine();

            System.out.print("specilization:-");
            String specilist = input.nextLine();

            System.out.print("work time:-");
            String appoint = input.nextLine();

            System.out.print("qualification:-");
            String doc_qual = input.nextLine();
            
            System.out.println("\n");
            try{
                File file =new File("doctor.txt");
          	  if(!file.exists()){
          	 	file.createNewFile();
          	  }
          	  FileWriter fw = new FileWriter(file,true);
          	  BufferedWriter bw = new BufferedWriter(fw);
          	  PrintWriter pn = new PrintWriter(bw);
        
          	  pn.println( did+"\t"+"\t"+ dname+"\t "+"\t"+ specilist+"\t  "+"\t" + appoint+"\t"+"\t"+ doc_qual);
          	  pn.close();
          }
          catch(IOException ia){
          	   System.out.println("Exception occurred:");
          	   ia.printStackTrace();
            }

        }    
    }
}
    

