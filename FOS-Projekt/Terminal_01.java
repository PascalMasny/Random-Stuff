//Imports
import java.sql.Date; //Import für das Datum
import java.util.Scanner; //Import für den Scanner im User Input


public class Terminal_01 {

    //General Var's 
    static String account_holder = "Elisabeth Nejedli"; //Account Beseitzer
    static String bank_name = "Turbo-Pascal Bank"; //Bank Name
    static int CORRECT_PIN = 1234; //Bank Pin
    static double balance = 2341.11; //Kontostand [Wir immer geupdated]


    //main Methode
    public static void main(String[] args) {


        // Pin abfrage
        boolean pin_status = pin_input();

        //main abfrage
        if(pin_status == true){

            //Menue zur auswahl der Aktion
            System.out.println("\n\nWilkommen!");
                  
            System.out.println("\n");
            System.out.println("1. Kontostand");
            System.out.println("2. Einzahlung");
            System.out.println("3. Auszahlung");
            System.out.println("4. Exit");
            System.out.println("\n");

            //User input für die Menu wahl
            Scanner menue_innput = new Scanner(System.in);
            System.out.println("Wählen Sie eine Aktion: ");
            String menu_inn_str = menue_innput.nextLine();
            int menue_number = Integer.parseInt(menu_inn_str);

            //menu switch case backend
            switch(menue_number){

                //Case 1: Zeige Kontostand
                case 1:
                    amount_account(balance);

                    break;

                //Case 2: Einzahlung
                case 2:
                    Scanner cash_innput = new Scanner(System.in);
                    System.out.println("Wählen Sie die Menge an Geld die Sie einzahlen möchten in €: ");
                    String cash_in_str = cash_innput.nextLine();
                    int cash_amount = Integer.parseInt(cash_in_str);
                    
                    balance = chash_in(cash_amount, balance);  

                    break;

                //Case 3: Auszahlung
                case 3:
                    Scanner cash_innput_2 = new Scanner(System.in);
                    System.out.println("Wählen Sie die Menge an Geld die Sie auszahlen möchten in €: ");
                    String cash_out_str = cash_innput_2.nextLine();
                    int cash_amount_2 = Integer.parseInt(cash_out_str);

                    balance = chash_out(cash_amount_2, balance);

                    break;

                //Case 4: Exit option
                case 4:
                    System.out.println("Exit! \n Danke das Sie die TurboPascal Bank nutzen.");

                    break;

                //Default mit Error meldung zu debuggen
                default:
                    System.out.println("ERR0R!");

                    break;
            }   
   
        }

       //Pin abfrage Fehlgeschalgen 
        else if(pin_status == false){
            System.out.println("Zugriff verweigert!");
        }
        //Default Error meldung zu debuggen
        else{
            System.out.println("Fatal ERR0R!");
        }


        
    }

    //Pinabfrage funktion
    public static boolean pin_input(){

        
        int attemps = 0; //Versuche der Pineingabe (max 3 Versuche)
        int PIN = 0; //Default Pin 
        boolean pin_status = false; //Pin Status für die Main abfrage
        
        Scanner keyboard = new Scanner(System.in); //User Input für den Pin
        System.out.print("\nEnter Pin Code: \n");

        //Pin abfrage solange Pin versuche < 3
        while(PIN != CORRECT_PIN && attemps < 3){

            PIN  = keyboard.nextInt();
            attemps++;

            //Pin nicht korrekt aber > 3 ==> erneut versuchen
            if (PIN != CORRECT_PIN && attemps < 3) { 
                pin_status = false;
                System.out.println("Falscher Pin!");
                System.out.print("\n Enter Pin Code: \n");
                Scanner menue_innput = new Scanner(System.in);
            }

            //Pin abfrage korrekt ==> weiter zur Main abfrage
            if (PIN == CORRECT_PIN && attemps <= 3) {  
                pin_status = true;
            }
        }
        return pin_status;
    }



    //Kontostand Prozedur
    static void amount_account(double balance){

        java.util.Date date = new java.util.Date(); //Datum deffinition

        //Printen der Informationen (Siehe Aufgabenstellung)
        System.out.println("\n");
        System.out.println(bank_name);
        System.out.println("Ihr Kontostand: " + balance + "€");
        System.out.println("Name: " + account_holder);
        System.out.println("Datum: " + date);
    } 



    //Auszahlungs Funktion
    static double chash_out(double amount, double balance){  

        double old_balance = balance; //Deklarieren des alten Kontostands
        
        //If abfrage der Auszahlung (siehe Aufgabenstellung)
        if(amount < 2000){
            System.out.println("\nAuszahlung genehmigt!");
            balance = balance - amount;
        }
        else if(amount >= 2000){
            System.out.println("Üblicher Tageslohn überschritten!");
        }
        else if(amount > 5000){
            System.out.println("Auzahlung abgeleht!");
        }
        //Default mit Error meldung zu debuggen
        else{
            System.out.println("ERR0R!");
        }

        java.util.Date date = new java.util.Date();//Datum deffinition


        //Printen der Informationen (Siehe Aufgabenstellung)
        System.out.println("\n");
        System.out.println(bank_name);
        System.out.println("Ihr alter Kontostand: " + old_balance + "€");
        System.out.println("Ihr alter Kontostand: " + balance + "€");
        System.out.println("Name: " + account_holder);
        System.out.println("Datum: " + date);


        return balance;

    }



    //Auszahlung Funktion
    static double chash_in(int amount, double balance){

        double old_balance = balance; 

        balance = balance + amount;

        java.util.Date date = new java.util.Date();//Datum deffinition

        //Printen der Informationen (Siehe Aufgabenstellung)
        System.out.println("\n");
        System.out.println(bank_name);
        System.out.println("Ihr alter Kontostand: " + old_balance + "€");
        System.out.println("Ihr alter Kontostand: " + balance + "€");
        System.out.println("Name: " + account_holder);
        System.out.println("Datum: " + date);

        return balance;
    }

    
}
