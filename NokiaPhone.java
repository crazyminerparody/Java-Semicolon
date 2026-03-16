import java.util.Scanner;

    public class NokiaPhone{
        public static void main(String[]args){    
                    String menu = """ 
-----------------List of Menu Functions--------------------
    1.  Phone Book
    2.  Messages
    3.  Chat
    4.  Call Register
    5.  Tones
    6.  Settings
    7.  Call Divert
    8.  Games
    9.  Calculator
    10. Reminder
    11. Clock
    12. Profiles
    13. SIM services

        """;
    
    System.out.println(menu);
    System.out.print("Enter an option: ");
    Scanner inputCollector = new Scanner(System.in);
    int selectOption = inputCollector.nextInt();

    switch(selectOption){
        case 1 -> {
            String phoneBookMenu = """
    1. Phone book
       1. Search
       2. Service Nos
       3. Add Name
       4. Erase
       5. Edit
       6. Assign tone
       7. Send b'card
       8. Options
       9. Speed dials
      10. Voice Tags
      11. Back

        """;

            System.out.println(phoneBookMenu);
            System.out.print("Select and enter an option: ");
            int selectPhoneBookOption = inputCollector.nextInt();
            switch(selectPhoneBookOption){
                case 1 -> System.out.println("You have selected Search. You have reached the end of your program. Bye!");
                
                case 2 -> System.out.println("You have selected Service Nos. You have reached the end of your program. Bye!");

                case 3 -> System.out.println("You have selected Add Name. You have reached the end of your program. Bye!");

                case 4 -> System.out.println("You have selected Erase. You have reached the end of your program. Bye!");
                case 5-> System.out.println("You have selected Edit. You have reached the end of your program. Bye!");
                case 6 -> System.out.println("You have selected Assign Tone. You have reached the end of your program. Bye!");
                case 7 -> System.out.println("You have selected Send b'card'. You have reached the end of your program. Bye!");

                case 8 -> {
                            String phoneBookOptionsMenu = """
                               8. Options
                                1. Type of view 
                                2. Memory status

                            """;
                            System.out.println(phoneBookOptionsMenu);
                            System.out.print("Enter an option: ");
                    Scanner optionsinputCollector = new Scanner(System.in);
                    int selectOptionsOption = inputCollector.nextInt();
                    switch(selectOptionsOption) {
                        case 1 -> System.out.println("You have selected Type of view. You have reached the end of your program. Bye!");
                        case 2 -> System.out.println("You have selected Memory status. You have reached the end of your program. Bye!");
    }
            }
                case 9 -> System.out.println("You have selected Speed dials. You have reached the end of your program. Bye!");    
                case 10 -> System.out.println("You have selected Voice Tags. You have reached the end of your program. Bye!");
                   
    }
        }
            
 case 2 -> {
            String ReadmessagesMenu = """
    1. Messages
       1. Write Messages
       2. Inbox
       3. Outbox
       4. Picture Messages
       5. Templates
       6. Smileys
       7. Message settings
       8. Info service
       9. Voice mailbox number
      10. Service command editor
      11. Back

        """;

        System.out.println(ReadmessagesMenu);
        System.out.println("Select and enter an option: ");
        int readandSendMessages = inputCollector.nextInt();
            switch(readandSendMessages){
            case 1 -> System.out.println("You have selected Write Messages. You have reached the end of your program. Bye!");
            case 2 -> System.out.println("You have selected Inbox. You have reached the end of your program. Bye!");
            case 3 -> System.out.println("You have selected Outbox. You have reached the end of your program. Bye!");
            case 4 -> System.out.println("You have selected Picture Messages. You have reached the end of your program. Bye!");
            case 5 -> System.out.println("You have selected Templates. You have reached the end of your program. Bye!");
            case 6 -> System.out.println("You have selected Smileys. You have reached the end of your program. Bye!");
            case 7 -> {String viewMessageSettingsMenu = """
                                    8. Message settings
                                1. Set 1
                                2. Common
                                3. Back                
                            """;

                            System.out.println(viewMessageSettingsMenu);
                            System.out.print("Enter any option: ");
                            int viewMessageSetting = inputCollector.nextInt();
                            switch (viewMessageSetting){
                            
                    case 1 -> {String selectMessageSettingMenu = """
                                1. Message centre number
                                2. Message sent as
                                3. Message validity
                                4. Back
                            """;

    
                            System.out.println(selectMessageSettingMenu);
                            System.out.println("Enter any option: ");
                            int viewMessageOptions = inputCollector.nextInt();
                            switch(viewMessageOptions){
            
                   case 2 -> {
                     String selectMessagingOptions = """
                        1. Delivery Reports
                        2. Reply via same centre
                        3. Character Support
                        4. Back
                            """;


    System.out.println(selectMessagingOptions);
    System.out.println("Enter any option: ");
    int readMessageOptions = inputCollector.nextInt();
    switch(viewMessageOptions) {

        case 8 -> {
            System.out.println("You have selected Info Service. You have reached the end of your program. Bye!");
        }

        case 9 -> {
            System.out.println("You have selected Voice mailbox number. You have reached the end of your program. Bye!");
        }
        case 10 -> {
                     
              System.out.println("You have selected Voice mailbox number. You have reached the end of your program. Bye!");
        }
    }
}

                            

}
}                     
}
}
            
}
        
}


        case 3 -> System.out.println("Chat");

        case 4 -> {
                    String callRegisterMenu = """
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers 
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call costs settings
                        8. Prepaid credit
                        9. Back

                            """;

                        System.out.println(callRegisterMenu);
                         System.out.println("Enter any option: ");
                         int callRegisterOptions = inputCollector.nextInt();
                         switch(callRegisterOptions){
         case 1 -> System.out.println("You have selected Missed calls. You have reached the end of your program. Bye!");
         case 2 -> System.out.println("You have selected Received calls. You have reached the end of your program. Bye!");
         case 3 -> System.out.println("You have selected Dialled numbers. You have reached the end of your program. Bye!");
         case 4 -> System.out.println("You have selected Erase recent call lists. You have reached the end of your program. Bye!");
         case 5 -> {
                            String callRegisterOptionsMenu = """
                               5.Show call duration
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls duration
                                5. Clear timers
                                6. Back 

                                    """;
                        
                                System.out.println(callRegisterOptionsMenu);
                                System.out.println("Enter any option: ");
                                int callCostsOptions = inputCollector.nextInt();
                                switch(callCostsOptions){
                                case 1 -> System.out.println("You have selected last call duration. You have reached the end of your program. Bye!");
         case 2 -> System.out.println("You have selected All calls' duration. You have reached the end of your program. Bye!");
         case 3 -> System.out.println("You have selected Received calls' duration. You have reached the end of your program. Bye!");
         case 4 -> System.out.println("You have selected Dialled calls duration. You have reached the end of your program. Bye!");
         case 5 -> System.out.println("You have selected Clear timers. You have reached the end of your program. Bye!");
            }
}
         case 6 -> {
                            String callCostsMenu = """
                                6. Show call costs
                                 1. Last call cost
                                 2. All calls cost
                                 3. Clear counters
                                 4. Back

                                    """;

                                System.out.println(callCostsMenu);
                                System.out.println("Enter any option: ");
                                int allCallOptions = inputCollector.nextInt();
                                switch(allCallOptions){
                                    case 1 -> System.out.println("You have selected last call cost. You have reached the end of your program. Bye!");
                                    case 2 -> System.out.println("You have selected All calls cost. You have reached the end of your program. Bye!");
                                    case 3 -> System.out.println("You have selected Clear counters. You have reached the end of your program. Bye!");
}
} 
        case 7 -> {
                            String callCostSettings = """
                                7. Call costs settings
                                 1. Call cost limits
                                 2. Show costs in
                                 3. Back

                                    """;

                                System.out.println(callCostSettings);
                                System.out.println("Enter any option: ");
                                int allCallCosts = inputCollector.nextInt();
                                switch(allCallCosts){
                                    case 1 -> System.out.println("You have selected Call cost limits. You have reached the end of your program. Bye!");
                                    case 2 -> System.out.println("You have selected Show costs in. You have reached the end of your program. Bye!");
}
        
}       
                        
case 8 -> System.out.println("You have selected Prepaid credit. You have reached the end of your program. Bye!");
} 

        }
    case 5 -> {
                          String tonesMenu = """
                    5. Tones
                     1. Ringing Tone
                     2. Ringing volume
                     3. Incoming call alert
                     4. Composer
                     5. Message alert tone
                     6. Keypad tones
                     7. Warning and game tones
                     8. Vibrating alert
                     9. Screen saver                    
                     10. Back
                        """;

                     System.out.println(tonesMenu);
                     System.out.print("Enter any option: ");
                     int allMenuTones = inputCollector.nextInt();
                     switch(allMenuTones) {
                    case 1 -> System.out.println("You have selected Ringing Tone. You have reached the end of your program. Bye!");
                    case 2 -> System.out.println("You have selected Ringing volume. You have reached the end of your program. Bye!");
                    case 3 -> System.out.println("You have selected Incoming call alert. You have reached the end of your program. Bye!");
                    case 4 -> System.out.println("You have selected Composer. You have reached the end of your program. Bye!");
                    case 5 -> System.out.println("You have selected Message alert tone. You have reached the end of your program. Bye!");
                    case 6 -> System.out.println("You have selected Keypad tones. You have reached the end of your program. Bye!");
                    case 7 -> System.out.println("You have selected Warning games and tones. You have reached the end of your program. Bye!");
                    case 8 -> System.out.println("You have selected Vibrating alert. You have reached the end of your program. Bye!");
                    case 9 -> System.out.println("You have selected Screen saver. You have reached the end of your program. Bye!");
                }
            }
                  case 6 -> {
                menu = """
           6. SETTINGS
            1. Call settings
            2. Phone Settings
            3. Security Settings
            4. Restore Factory Settings
            5. Back

                       """;
            System.out.println(menu);
            System.out.print("Enter any option: ");
            int option1 = inputCollector.nextInt();
                switch(option1){
                case 1 -> {
                                menu = """
                   1. CALL SETTINGS 
                    1. Automatic redial
                    2. Speed dialing
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                    7. Back

                                 """;
                        System.out.println(menu);
                    System.out.print("Enter any option: ");
                   int option = inputCollector.nextInt();
                        switch(option){
                            case 1 -> {System.out.println("You have selected Automatic Redial. You have reached the end of your program. Bye!");}
                            case 2 -> {System.out.println("You have selected Speed dialing. You have reached the end of your program. Bye!");}
                            case 3 -> {System.out.println("You have selected call waiting options. You have reached the end of your program. Bye!");}
                            case 4 -> {System.out.println("You have selected Own number sending. You have reached the end of your program. Bye!");}
                            case 5 -> {System.out.println("You have selected Phone line in use. You have reached the end of your program. Bye!");}
                            case 6 -> {System.out.println("You have selected Automatic Answer. You have reached the end of your program. Bye!");}
                    } }
                  case 2 ->{
                        menu = """
                   2. PHONE SETTINGS 
                    1. Language
                    2. Cell info display
                    3. Welcome note
                    4. Network Selection
                    5. Lights
                    6. Confirm SIM service actions
                    7. Back
  
                                  """;
                    System.out.println(menu);
                    System.out.print("Enter any option: ");
                   int option3 = inputCollector.nextInt();
                        switch (option3){
                            case 1 -> {System.out.println("You have selected Language. You have reached the end of your program. Bye!");}
                            case 2 -> {System.out.println("You have selected Cell info display. You have reached the end of your program. Bye!");}
                            case 3 -> {System.out.println("You have selected Welcome Note. You have reached the end of your program. Bye!");}
                            case 4 -> {System.out.println("You have selected Network Selection. You have reached the end of your program. Bye!");}
                            case 5 -> {System.out.println("You have selected Lights. You have reached the end of your program. Bye!");}
                            case 6 -> {System.out.println("You have selected Confirm SIM service actions. You have reached the end of your program. Bye!");}
                           
                      }
                   }

                    case 3 -> {
                       menu = """
                   3. SECURITY SETTINGS 
                    1. PIN code request
                    2. Call barring service
                    3. Fixed dailing
                    4. closed user group
                    5. Phone security
                    6. Change access codes
                    7. Back

                             """;
                    System.out.println(menu);
                    System.out.print("Enter any option ");
                   int option4 = inputCollector.nextInt();
                        switch (option4){
                            case 1 -> {System.out.println("You have selected PIN code request. You have reached the end of your program. Bye!");}
                            case 2 -> {System.out.println("You have selected call barring service. You have reached the end of your program. Bye!");}
                            case 3 -> {System.out.println("You have selected Fixed dialing. You have reached the end of your program. Bye!");}
                            case 4 -> {System.out.println("You have selected closed user group. You have reached the end of your program. Bye!");}
                            case 5 -> {System.out.println("You have selected Phone Security. You have reached the end of your program. Bye!");}
                            case 6 -> {System.out.println("You have selected Change access codes. You have reached the end of your program. Bye!");}
                    }
                } 
                case 4 -> {System.out.println("You have selected Restore Factory settings. You have reached the end of your program. Bye!");}
            
         }
      }   
        case 7 ->{System.out.println("You have selected call divert. You have reached the end of your program. Bye!");} 
        case 8 ->{System.out.println("You have selected Games. You have reached the end of your program. Bye!");} 
        case 9 ->{System.out.println("You have selected Calculator. You have reached the end of your program. Bye!");}
        case 10 ->{System.out.println("You have selected Reminders. You have reached the end of your program. Bye!");}
        case 11 ->{
            menu = """
       11. CLOCK 
        1. Alarm clock
        2. Clock settings
        3. Date settings
        4. StopWatch
        5. Countdown timer
        6. Auto update of date and time
        7. Back

                 """;
        System.out.println(menu);
        System.out.print("Enter any option: ");
         int option5 = inputCollector.nextInt();
            switch (option5){
                case 1 -> {System.out.println("You have selected Alarm Clock. You have reached the end of your program. Bye!");}
                case 2 -> {System.out.println("You have selected Clock settings. You have reached the end of your program. Bye!");}
                case 3 -> {System.out.println("You have selected Date settings. You have reached the end of your program. Bye!");}
                case 4 -> {System.out.println("You have selected StopWatch. You have reached the end of your program. Bye!");}
                case 5 -> {System.out.println("You have selected Countdown timer. You have reached the end of your program. Bye!");}
                case 6 -> {System.out.println("You have selected Auto update of date and time. You have reached the end of your program. Bye!");} 
            }
         }
        case 12 ->{System.out.println("Profiles");} 
        case 13 ->{System.out.println("SIM Service");} 
           
        
   } 
}
}
