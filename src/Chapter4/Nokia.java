package Chapter4;

import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                list of menu functions
                press
                1. phonebook
                2. message
                3. chat
                4. call register
                5. Tones
                6. settings
                7. call divert
                8. Games
                9. calculator
                10. reminder
                11. clock
                12. profiles
                13. SIM services
                """);
        int nokia = input.nextInt();
        switch(nokia){
            case 1:
                System.out.println("phone book");
                System.out.println("""
                        for phone book
                        1.search
                        2.service Nos
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.send b'card
                        8.option
                        9.speed dials
                        10.voice tags
                        """);
                int view = input.nextInt();
                switch(view) {
                    case 1:
                        System.out.println("search");
                    case 2:
                        System.out.println("service Nos");
                    case 3:
                        System.out.println("Add name");
                    case 4:
                        System.out.println("Erase");
                    case 5:
                        System.out.println("Edit");
                    case 6:
                        System.out.println("Assign tone");
                    case 7:
                        System.out.println("send b'card");
                    case 8:
                        System.out.println("option");
                        System.out.println("""
                                for option
                                1-> Type of view
                                2-> Memory status
                                """);
                        int message = input.nextInt();
                        switch (message) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("memory status");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("speed dial");
                        break;
                    case 10:
                        System.out.println("voice tags");
                        break;
                }
                    switch (nokia){
                        case 2:
                            System.out.println("message");
                            System.out.println("""
                                    for message
                                    1.-> write message
                                    2.-> inbox
                                    3.-> outbox
                                    4.-> picture message
                                    5.-> Template
                                    6.-> smileys
                                    7.-> message settings
                                    
                                    """);

                        int message = input.nextInt();
                        switch (message){
                            case 1:
                                System.out.println("write message");
                            case 2:
                                System.out.println("inbox");
                            case 3:
                                System.out.println("outbox");
                            case 4:
                                System.out.println("picture message");
                            case 5:
                                System.out.println("Template");
                            case 6:
                                System.out.println("smileys");
                            case 7:
                                System.out.println("message settings");


                        }
                    }
                }
    }
}

