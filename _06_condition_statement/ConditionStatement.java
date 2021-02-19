package _06_condition_statement;

public class ConditionStatement {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        if (x > y){
            System.out.println("X is greater than y");
        }

        int time = 17;
        if(time < 18){
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        if(time < 10){
            System.out.println("Good morning.");
        } else if (time < 20){
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);

        int day = 19;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
