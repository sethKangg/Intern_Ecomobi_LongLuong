package Q1_50percent;

import java.text.ParseException;
import java.util.Scanner;

public class main {
    
    public static int checkInt(String mess, int min, int max){
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(mess);
            try{
                num = Integer.parseInt(sc.nextLine());
                if(num>=min&&num<=max) return num;
                else System.out.println("Out of range, please enter in range of "+min+" - "+max);
            }
            catch(NumberFormatException ex){ /*tai sao la number format exception*/
                System.out.println("Invalid input, enter again ");
            }
        } while(true);
    }

    public static void main(String[] args) throws ParseException {
        ExpenseControl run = new ExpenseControl();
//        System.out.println(Expense.IDmax);

        do{
            System.out.println("1. add");
            System.out.println("2. remove(FAIL)");
            System.out.println("3. exist(FAIL)");
            System.out.println("4. count");
            System.out.println("5. flush");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            int choice = checkInt("Please enter your choice: ",1,7);
            switch(choice){
                case 1:{
                    run.addExpense();
                    break;
                }
                case 2:{
//                    run.deleExpense();
                    break;
                }
                case 3:{
                    
//                        run.checkExist(e, a);
                    break;
                }
                case 4:{
                        run.count();
                    break;
                }
                case 5:{
                        run.flush();
                    break;
                }
                case 6:{
                        run.display();
                    break;
                }
                case 7:{
                    System.out.println("============ Exited ============");
                    return;
                }
            }
            System.out.println("========================");
        } while(true);
    }
}
