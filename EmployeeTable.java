package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTable {
    private ArrayList<Employee> table = new ArrayList<>();

    public EmployeeTable(){

    }

    public String getTotal(){
        double totalCakes = 0;
        for(Employee cakes1 : table){
            totalCakes += cakes1.getCakesCovered();
        }
        double totalWages = 0;
        for(Employee wages1 : table){
            totalWages += wages1.calculatePay();
        }
        double totalWagesRounded = (double) Math.round(totalWages * 100) / 100;
        return "Total Cakes = "+totalCakes +"\nTotal Wages = "+totalWagesRounded + "\n";
    }

    public String getTable(){
        StringBuilder sb = new StringBuilder();
        for(Employee e1 : table){
            sb.append(String.format("%-10s | %3s | %6s | %1s", e1.getName(), e1.getCakesCovered(), e1.formatPay(), e1.getEmployeeType()));
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addScore(Employee score1) {
        table.add(score1);
    }

    public void sortTeam(){
        Collections.sort(table);
    }


}
