
import java.util.*;
import java.io.*;

public class expense {

    public static void main(String[] args) throws IOException {
        // add remove manage finance
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to your expense tracker");
        ArrayList<String> expense = new ArrayList<>();
        while(true) {
            System.out.println("A:Add expense Q:Quit E: View file");
            String ans = in.nextLine();
            switch(ans) {
                case "A":
                   System.out.println("Expense name: ");
                   String expName = in.nextLine();
                   System.out.println("Expense amount: ");
                   int expAmount = in.nextInt();
                   in.nextLine();
                   addExpense(expense, expName, expAmount);
                   break;
                case "Q":
                   System.out.println("Exiting...");
                   System.exit(0);
                case "E":
                  viewFile();
                  getAvg(expense);
                   
            } 
        }
    }
    
    // add method --> just write the new expense to file
    public static void addExpense(ArrayList<String> expense, String expName, int expAmount) throws IOException{
        expense.add(expName + "," + expAmount); // keep in memory if needed
        FileWriter File = new FileWriter("expense.txt", true);
        File.write("Expense name:" + expName.trim() + ",Expense Amount:" + expAmount + "\n");
        File.close();
    }

    // calculate average from file
    public static void getAvg(ArrayList<String> expense) throws IOException {
        File file = new File("expense.txt");
        Scanner read = new Scanner(file);

        int sum = 0;
        int count = 0;

        while (read.hasNextLine()) {
            String line = read.nextLine();
            String[] parts = line.split(",");
            int amount = Integer.parseInt(parts[1].replace("Expense Amount:", "").trim());
            sum += amount;
            count++;
        }

        read.close();

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average of the items is $" + average);
        }
    }
    public static void viewFile() throws IOException {
    File file = new File("expense.txt");

    if (!file.exists()) {
        System.out.println("No expenses yet.");
        return;
    }

    Scanner read = new Scanner(file);
    while (read.hasNextLine()) {
        System.out.println(read.nextLine());
    }
    read.close();
}
}