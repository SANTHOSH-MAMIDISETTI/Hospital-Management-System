import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class admin {
	String addID, addName;
	int age;
    void admin_info() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("id:-");
            addID = input.nextLine();
            System.out.print("name:-");
            addName = input.nextLine();
        }
    }
    void UpdatePatient() {
    	try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter limit");
             try (Scanner in = new Scanner(System.in)) {
                int size=in.nextInt();
                 int[] myList=new int[size];
                int i;
                for (i = 0; i < myList.length; i++) {
                	System.out.print("id:-");
                    String pid = input.nextLine();
                    System.out.print("name:-");
                    String patientName = input.nextLine();
                    System.out.print("disease:-");
                    String disease = input.nextLine();
                    System.out.print("sex:-");
                    String sex = input.nextLine();
                    try{
                    	System.out.print("age:-");
                    	int age = input.nextInt();
                        age = this.age;
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
                  	  pn.println( pid+"\t"+"\t"+ patientName+"\t "+"\t"+ disease+"\t \t" + sex +"\t \t"+ age );
                  	  pn.close();
                  }
                  catch(IOException ia){
                  	   System.out.println("Exception occurred:");
                  	   ia.printStackTrace();
                    }
                }
            }
        }
    }
    static void repeatedCodes() throws IOException {
        File file =new File("patient.txt");
        if(!file.exists()){
           file.createNewFile();
        }
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pn = new PrintWriter(bw);
    }
    void UpdateDoctor() {
    	try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number  of doctor to be added");
             try (Scanner in = new Scanner(System.in)) {
                int size=in.nextInt();
                 int[] myList=new int[size];
                int i;
                for (i = 0; i < myList.length; i++) {
                	System.out.print("id:-");
                    String did = input.nextLine();
                    System.out.print("name:-");
                    String doctorName = input.nextLine();
                    System.out.print("specialization:-");
                    String specialist = input.nextLine();
                    System.out.print("work time:-");
                    String appoint = input.nextLine();
                    System.out.print("qualification:-");
                    String doctorQualification = input.nextLine();
                    System.out.println("\n");
                    try{
                        File file =new File("doctor.txt");
                  	  if(!file.exists()){
                  	 	file.createNewFile();
                  	  }
                  	  FileWriter fw = new FileWriter(file,true);
                  	  BufferedWriter bw = new BufferedWriter(fw);
                  	  PrintWriter pn = new PrintWriter(bw);
                  	  pn.println( did+"\t"+"\t"+ doctorName+"\t "+"\t"+ specialist+"\t  "+"\t" + appoint+"\t"+"\t"+ doctorQualification);
                  	  pn.close();
                  }
                  catch(IOException ia){
                  	   System.out.println("Exception occurred:");
                  	   ia.printStackTrace();
                    }
                }
            }
        }    
    }
}
