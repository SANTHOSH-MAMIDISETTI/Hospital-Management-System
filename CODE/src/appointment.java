import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

class appointment extends patient

{
    String date, time, doctorname;
    String pname, disease, sex;
       int age;

    void makeAppointment()

    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Date (DD/MM/YY):-");
            date = input.nextLine();

            System.out.print("Time:-");
            time = input.nextLine();
            
            System.out.print("Enter the patient Name:-");
            pname = input.nextLine();
            
            System.out.print("Enter the patient disease :-");
            disease = input.nextLine();

            System.out.print("Doctor Name:-");
            doctorname = input.nextLine();
            try{
            	System.out.print("Enter the patient age :-");
                age = input.nextInt();
            }
            catch (InputMismatchException a){

                System.out.print("please enter a number");
            }
        }

        try{
        File file =new File("appointment.txt");
  	  if(!file.exists()){
  	 	file.createNewFile();
  	  }
  	  FileWriter fw = new FileWriter(file,true);
  	  BufferedWriter bw = new BufferedWriter(fw);
  	  PrintWriter pn = new PrintWriter(bw);

  	  pn.println(date+"\t"+"\t"+time+"\t"+"\t" +pname+"\t"+"\t"+ doctorname+"\t "+"\t"+age+"\t "+"\t"+ disease );
  	  pn.close();
  }
  catch(IOException ia){
  	   System.out.println("Exception occurred:");
  	   ia.printStackTrace();
    }
    
}}
