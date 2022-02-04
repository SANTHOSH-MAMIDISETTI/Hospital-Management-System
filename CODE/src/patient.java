import java.io.*; 
import java.util.*;
class patient
{
    int pid;
	String pname, disease, sex;
    int age;
   
	void new_patient()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        pname = input.nextLine();

        System.out.print("disease:-");
        disease = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        try{
        	System.out.print("age:-");
        	age = input.nextInt();
        }
        catch (InputMismatchException a){

            System.out.print("please enter a number");

        }
               
        try{
        	 System.out.print("id:-");
             pid = input.nextInt();
        }
        catch (InputMismatchException a){

            System.out.print("please enter a number");
        } 
        
        try{
            File file =new File("patient.txt");
      	   if(!file.exists()){
      	 	file.createNewFile();
      	  }
      	  FileWriter fw = new FileWriter(file,true);
      	  BufferedWriter bw = new BufferedWriter(fw);
      	  PrintWriter pn = new PrintWriter(bw);
      	  pn.println( pid+"\t"+ pname+"\t "+"\t"+ disease+"\t  "+"\t" + sex +"\t " +age);
      	  pn.close();
      }
      catch(IOException ia){
      	   System.out.println("Exception occurred:");
      	   ia.printStackTrace();
        }

    }
    void patient_info()
    {
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

    
    void view_medicine() {
   	 File file = new File("medicine.txt");
   	    BufferedInputStream bis = null;
   	    FileInputStream  fis= null;
   	    try
   	    {
   	        fis = new FileInputStream(file);

   	        bis = new BufferedInputStream(fis);
   	        while( bis.available() > 0 ){             	
   	            System.out.print((char)bis.read());
   	        }   	        
   	}
   	    catch(FileNotFoundException fnfe)
   	      {
   	          System.out.println("The specified file not found" + fnfe);
   	      }
   	      catch(IOException ioe)
   	      {
   	          System.out.println("I/O Exception: " + ioe); 
   	      }
   	      finally
   	      {
   	          try{
   	             if(bis != null && fis!=null)
   	             {
   	     	        fis.close();
   	                bis.close();
   	             }      
   	           }catch(IOException ioe)
   	            {
   	                System.out.println("Error in InputStream close(): " + ioe);
   	            }         
   	      } 
   }
  }