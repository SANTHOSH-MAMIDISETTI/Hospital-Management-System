import java.io.*;
import java.util.*;
class doctor
{
    String  dname, specilist, appoint, doc_qual;
    int did;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        try{System.out.print("id:-");
        did = input.nextInt();
        }
        catch (InputMismatchException a){
            System.out.print("please enter a number");
        }
        try{
          File file =new File("doctor.txt");
    	  if(!file.exists()){
    	 	file.createNewFile();
    	  }
    	  FileWriter fw = new FileWriter(file,true);
    	  BufferedWriter bw = new BufferedWriter(fw);
    	  PrintWriter pn = new PrintWriter(bw);
    	  pn.println( did+"\t"+ dname+"\t "+ specilist+"\t  " + appoint+"\t"+ doc_qual);
    	  pn.close();
    }
    catch(IOException ia){
    	   System.out.println("Exception occurred:");
    	   ia.printStackTrace();
      }
        }
    void doctor_info() {
    File file = new File("doctor.txt");
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
    void patient_details() {
    	 File file = new File("patient.txt");
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