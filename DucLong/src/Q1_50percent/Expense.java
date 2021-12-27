package Q1_50percent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense {
//    static int IDmax=0;
    String content;
    float sum;

    public Expense(float sum, String content) {
        this.sum=sum;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Sum: "+sum+" | Content: "+content);
    }
    
}
