import java.util.Calendar;
import java.util.Scanner;
public class HospitalManagement
{
    public static void main(String[] args)
    {
        String[] months = {  "Jan","Feb", "Mar", "Apr", "May", "Jun", "Jul","Aug", "Sep", "Oct", "Nov", "Dec" };
        Calendar calendar = Calendar.getInstance();
        System.out.println("\n//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("\n                      Hospital Management System                                       ");
        System.out.println("\n//////////////////////////////////////////////////////////////////////////////////");
        System.out.print("\n Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        login l =new login();
        bill b = new bill(); 
        admin ad = new admin();
        appointment ap = new appointment();
        try (Scanner input = new Scanner(System.in)) {
            int choice, c11, s1 = 1, s2,s3,s4;
            while (true)
            {
                System.out.println("\n                                    MAIN MENU ");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("1.Doctors  2. Patients 3.Cashier 4.Admin 5.Exit");
                System.out.println("-----------------------------------------------------------------------------------");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        l.doctor_login();
                        System.out.println();
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println();
                        doctor d = new doctor();
                        s1 = 1;
                        while (s1 == 1) {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List\n3.View Patient List\n4.Logout");
                            c11 = input.nextInt();
                            switch (c11) {
                                case 1 -> {
                                    d.new_doctor();
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s1 = input.nextInt();
                                }
                                case 2 -> {
                                    d.doctor_info();
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s1 = input.nextInt();
                                }
                                case 3 -> {
                                    d.patient_details();
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s1 = input.nextInt();
                                }
                                case 4 -> {
                                    System.out.println(" logged out Successfully");
                                    System.out.println("\nReturn to  Main Menu Press 0");
                                    s1 = input.nextInt();
                                }
                                case 5 -> {
                                    System.out.println("Invalid choice!!!");
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s1 = input.nextInt();
                                }
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println();
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println();
                        s2 = 1;
                        while (s2 == 1) {
                            System.out.println(" 1 .Add New Entry \n 2 .Make an appointment \n 3 .Existing Patients List\n 4 . Medicine List");
                            c11 = input.nextInt();
                            switch (c11) {
                                case 1 -> {
                                    ap.new_patient();
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s2 = input.nextInt();
                                }
                                case 2 -> {
                                    ap.makeAppointment();
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s2 = input.nextInt();
                                }
                                case 3 -> {
                                    ap.patient_info();
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s2 = input.nextInt();
                                }
                                case 4 -> {
                                    b.view_medicine();
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s2 = input.nextInt();
                                }
                                case 5 -> {
                                    System.out.println("Admin logged out Successfully");
                                    System.out.println("\nReturn to  Main Menu Press 0");
                                    s2 = input.nextInt();
                                }
                                case 6 -> {
                                    System.out.println("Invalid choice!!!");
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s1 = input.nextInt();
                                }
                            }
                        }
                    }
                    case 3 -> {
                        l.cashier_login();
                        System.out.println();
                        System.out.println("                      **CASHIER SECTION**");
                        System.out.println();
                        s3 = 1;
                        while (s3 == 1) {
                            System.out.println("1.Cashier Info\n2.Total Amount\n3.Add Medicine\n4.Log out");
                            c11 = input.nextInt();
                            switch (c11) {
                                case 1 -> {
                                    b.cashier();
                                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                    s3 = input.nextInt();
                                }
                                case 2 -> {
                                    {
                                        b.cashier_bill();
                                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                        s3 = input.nextInt();
                                    }
                                }
                                case 3 -> {
                                    {
                                        b.add_medicine();
                                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                        s3 = input.nextInt();
                                    }
                                }
                                case 4 -> {
                                    System.out.println(" logged out Successfully");
                                    System.out.println("\nReturn to  Main Menu Press 0");
                                    s3 = input.nextInt();
                                }
                                case 6 -> {
                                    System.out.println("Invalid choice!!!");
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s1 = input.nextInt();
                                }
                                default -> throw new IllegalStateException("Unexpected value: " + c11);
                            }
                        }
                    }
                    case 4 -> {
                        l.admin_login();
                        System.out.println();
                        System.out.println("                      **ADMIN SECTION**");
                        System.out.println();
                        s4 = 1;
                        while (s4 == 1) {
                            System.out.println("1.Admin Info\n2.Add Doctor\n3. Add Patient\n4.Log out");
                            c11 = input.nextInt();
                            switch (c11) {
                                case 1 -> {
                                    ad.admin_info();
                                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                    s4 = input.nextInt();
                                }
                                case 2 -> {
                                    {
                                        ad.UpdateDoctor();
                                    }
                                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                    s4 = input.nextInt();
                                }
                                case 3 -> {
                                    ad.UpdatePatient();
                                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                    s4 = input.nextInt();
                                }
                                case 4 -> {
                                    System.out.println("Admin logged out Successfully");
                                    System.out.println("\nReturn to  Main Menu Press 0");
                                    s4 = input.nextInt();
                                }
                                case 5 -> {
                                    System.out.println("Invalid choice!!!");
                                    System.out.println("\nReturn to Main Menu Press 0 and for  Back Press 1");
                                    s4 = input.nextInt();
                                }
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("Thank You For using!!!");
                        System.exit(s1);
                    }
                    case 6 -> System.out.println("Invalid choice");
                    default -> throw new IllegalStateException("Unexpected value: " + choice);
                }
                }
        }
        } 
    }
   