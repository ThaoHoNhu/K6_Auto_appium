package lesson_05;
import java.util.*;


public class lab_5_1 {
    public static void main(String[] args) {

        boolean isContinuing = true;
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> mapStudent = new HashMap<>();
        while(isContinuing){
            System.out.println("=====MENU======");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");
            System.out.println("Input your option");
            int userInput = scanner.nextInt();
            if(userInput == 0){
                System.out.println("Exit");
                isContinuing = false;
            }else {
                if (userInput == 1){
                    //input Student Info
                    System.out.println("Option 01");
                    System.out.print("Enter Student ID:");
                    int idNumber = scanner.nextInt();
                    System.out.print("Enter Student name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    mapStudent.put(idNumber,name);

                }
                if (userInput == 2){
                    //find id,
                    System.out.println("Option 02");
                    System.out.print("Enter ID number to find:");
                    int idNumberFind = scanner.nextInt();
                    if (mapStudent.containsKey(idNumberFind)){
                        System.out.println("The student with ID " + idNumberFind +
                                " has name " + mapStudent.get(idNumberFind));
                    }
                    else{
                        System.out.println("Not found student with ID input");
                    }

                }
            }

        }
    }
}
