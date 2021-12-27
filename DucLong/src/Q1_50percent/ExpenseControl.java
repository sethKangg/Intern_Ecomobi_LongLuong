package Q1_50percent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExpenseControl {

   public static Set<Expense> a = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    public ExpenseControl() throws ParseException {
        Expense x = new Expense(12, "AVC");
        a.add(x);
        x = new Expense(120, "Food");
        a.add(x);
        x = new Expense(300, "Tuition");
        a.add(x);
        x = new Expense(250, "Car");
        a.add(x);
    }

    public int checkExist(Expense e, Set<Expense> a) {
        if (a.contains(e)) {
            return 1;
        } else {
            return 0;
        }
    }
   
    public static float checkFloat(String mess, float min, float max) {
        float num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(mess);
            try {
                num = Float.parseFloat(sc.nextLine());
                if (num > min && num < max) {
                    return num;
                } else if (num < 0) {
                    System.out.println("Amount is equal or greater than " + min);
                } else {
                    System.out.println("Amount is equal or less than " + max);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Amount should be digit ");
            }
        } while (true);
    }

    public static String checkString(String mess, int x) {
        String input;
        do {
            System.out.print(mess);
            try {
                input = sc.nextLine().trim();
                input = input.replaceAll("\\s+", " ");
                if (!input.isEmpty()) {
                    if (x == 1) {
                        return input;
                    } else {
                        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
                            return input;
                        }
                    }
                } else {
                    System.out.println("Enter something! ");
                }
            } catch (Exception ex) {
                /**/
                System.out.println("Invalid input, enter again ");
            }
        } while (true);
    }

    public void count() {
        System.out.println("Total: " + a.size());
    }

    public void addExpense() {
        Float sum = checkFloat("Enter Amount: ", 0, 10000);
        String content = checkString("Enter Content: ", 1);
        Expense e = new Expense(sum, content);
        if (checkExist(e, a) == 0) {
            a.add(e);
            System.out.println("true");
        } else {
            System.err.println("false");
        }
    }

    public void deleExpense() {
        Float sum = checkFloat("Enter Amount: ", 0, 10000);
        String content = checkString("Enter Content: ", 1);
        Expense e = new Expense(sum, content);
        if (checkExist(e, a) == 1) {
            a.remove(e);
            System.out.println("true");
        } else {

            System.out.println("true");
        }
    }
    public void flush(){
        a.clear();
        if(a.size()==0){
            System.out.println("true");
        }
    }

    public void display() {

        for (Expense b : a) {
            System.out.println(b.toString());
        }
        System.out.println("____________________________________");

    }
}
