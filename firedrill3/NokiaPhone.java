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
                    Scanner optionsInputCollector = new Scanner(System.in);
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
                              
                            """;

                            System.out.println(viewMessageSettingsMenu);
                            System.out.print("Enter any option: ");
                            int viewMessageSetting = inputCollector.nextInt();
                            switch (viewMessageSetting){
                            
                    case 1 -> {String selectMessageSettingMenu = """
                                1. Message centre number
                                2. Message sent as
                                3. Message validity
                    
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

                        """;

                     System.out.println(tonesMenu);
                     System.out.print("Enter any option: ");
                     int allMenuTones = inputCollector.nextInt();
                     switch (allMenuTones) {
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
                String settingsMenu = """
                    6. Settings
                     1. Call Settings 
                     2. Phone Settings
                     3. Security settings
                     4. Restore factory settings

                              """;

                System.out.println(settingsMenu);
                System.out.println("Enter an option: ");
                int settingsOption = inputCollector.nextInt();
                switch(settingsOption){  
                            case 1 -> System.out.println("You have selected Call Settings. You have reached the end of your program. Bye!");
                            case 2 -> System.out.println("You have selected Phone Settings. You have reached the end of your program. Bye!");
                            case 3 -> System.out.println("You have selected Security Settings. You have reached the end of your program. Bye!");       
                            case 4 -> System.out.println("You have selected Restore factory Settings. You have reached the end of your program. Bye!");
                                case 5 -> {

                    String callSettings = """
                         1. Call settings
                          1. Automatic redial
                          2. Speed dialling
                          3. Call waiting options
                          4. Own number sending
                          5. Phone line in use
                          6. Automatic answer

                                """;

                        System.out.println(callSettings);
                        System.out.println("Enter an option: ");
                        int callWaitingOptions = inputCollector.nextInt();
                        switch (callWaitingOptions){
                                case 3 -> System.out.println("You have selected Automatic Redial. You have reached the end of your program. Bye!");
                                case 4 -> System.out.println("You have selected Speed dialling. You have reached the end of your program. Bye!");
                                case 5 -> System.out.println("You have selected Call waiting options. You have reached the end of your program. Bye!");
                                case 6 -> System.out.println("You have selected Own number sending. You have reached the end of your program. Bye!");
                                case 7 -> System.out.println("You have selected Phone line in use. You have reached the end of your program. Bye!");
                                case 8 -> System.out.println("You have selected Automatic answer. You have reached the end of your program. Bye!");
                        }
                    }

                }
            }
        }
    }
}

