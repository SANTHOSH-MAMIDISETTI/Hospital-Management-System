import java.util.Scanner;
interface doctor_login{
	void doctor_login();
	}
interface admin_login{
	void admin_login();
	}
interface cashier_login{
	void cashier_login();
	}
 class login implements doctor_login, admin_login ,cashier_login{
        public static login doctor_login;
        private final int Username = 123;
        private final int Password = 123;
         int EnteredUsername, EnteredPassword;
        public void doctor_login() {
        	Scanner in = new Scanner(System.in);
            for(int k=0;k<=3;k++)
            {
            	if (k<2)
            {
            		System.out.println("Enter Username");
		            EnteredUsername = in.nextInt();
		            System.out.println("Username Entered is " + EnteredUsername);
		            System.out.println("");
		            System.out.println("Enter Password");
		            EnteredPassword = in.nextInt();
		            System.out.println("Password Entered is " + EnteredPassword);
		            System.out.println("");
            if (Username == EnteredUsername && (Password == EnteredPassword)) {
                System.out.println("");
                break;
            }
            else {
                System.out.println("Wrong Username or  Password ");
                System.out.println(" Please try again ");
            }
            }
                else
            {
                System.out.println("You waste your 2 chances ");
                System.exit(k);
                break;
            }           
        }
    }
       public void admin_login() {
        	Scanner in = new Scanner(System.in);
            for(int k=0;k<=3;k++)
            {
            	if (k<2)
            {
            		System.out.println("Enter Username");
                    EnteredUsername = in.nextInt();
                    System.out.println("Username Entered is " + EnteredUsername);
                    System.out.println("");
                    System.out.println("Enter Password");
                    EnteredPassword = in.nextInt();
                    System.out.println("");
            if (Username == EnteredUsername && (Password == EnteredPassword)) {
                System.out.println("");
                break;
            }
            else {
                System.out.println("Wrong Username or  Password ");
                System.out.println(" Please try again ");
            }
            }
                else
            {
                System.out.println("You waste your 2 chances ");
                System.exit(k);
                break;
            }
        }
    }
		public void cashier_login() {
              try (Scanner console = new Scanner(System.in)) {
                for(int k=0;k<=3;k++)
                {
                	if (k<2)
                {
                		System.out.println("Enter Username");
		                EnteredUsername = console.nextInt();
		                System.out.println("Username Entered is " + EnteredUsername);
		                System.out.println("");
		                System.out.println("Enter Password");
		                EnteredPassword = console.nextInt();
		                System.out.println("");
                if (Username == EnteredUsername && (Password == EnteredPassword)) {
                    System.out.println("");
                    break;
                }
                else {
                    System.out.println("Wrong Username or  Password ");
                    System.out.println(" Please try again ");
                	System.out.println("");
                }
                }
                    else
                {
                        System.out.println("You wasted your 2 chances !!");
                    System.exit(k);
                    break;  
                }
            }
            }
        }
	}
			