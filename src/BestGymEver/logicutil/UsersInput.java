package BestGymEver.logicutil;

import java.util.Scanner;

public class UsersInput {

    public boolean condition = false ;
    Scanner sc ;

    public String readInputData(String prompt, String optionalTestParameter) {

        if (condition) {
            sc = new Scanner(optionalTestParameter);
        } else {
            sc = new Scanner(System.in);
        }

        while (true) {
            String allLines = "";
            System.out.println(prompt);
            while (sc.hasNextLine()) {
                if (sc.hasNext()) {
                    allLines += sc.nextLine();
                    if (!allLines.isEmpty()) {
                        return allLines.trim().replace("\n", "").replace("\r", "");
                    }
                } else {
                    if (!sc.nextLine().trim().isEmpty()) {
                        return sc.nextLine();
                    }
                }
            }
            return null;
        }
    }
}
