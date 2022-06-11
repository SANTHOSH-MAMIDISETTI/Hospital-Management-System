import java.io.*;
import java.util.*;
class cashier {
    String cid, cname;
    int camount;
    ArrayList<String> mname = new ArrayList<>();
    ArrayList<Integer> mprice = new ArrayList<>();
    void cashier() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("id:-");
            cid = input.nextLine();
            System.out.print("name:-");
            cname = input.nextLine();
        }
    }
    void add_medicine() {
    	try (Scanner input = new Scanner(System.in)) {
            while (true){
                System.out.print("Enter medicine name: ");
                String a = input.next();
                System.out.print("Enter medicine price: ");
                int b = input.nextInt();
                mname.add(a);
                mprice.add(b);
                System.out.print("Do you want to add more? (y / n): ");
                String x = input.next();
                if (x.equals("n")){
                    break;
                }
            }
        }
        try{
            File f2 = new File("E:/from_github/New folder/Hospital-Management-System/CODE/text_files/medicine.txt");
            if(!f2.exists()){
                f2.createNewFile();
            }
            FileWriter fw = new FileWriter(f2,true);
          	BufferedWriter bw = new BufferedWriter(fw);
          	PrintWriter pw = new PrintWriter(bw);
            for (int k = 0; k < mname.size(); k++){
                pw.println( mname.get(k) + "   " + mprice.get(k));
            }
            pw.close();
        }
        catch (IOException e){
            System.out.println("Something went wrong...");
        }
   }
}