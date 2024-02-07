package Assignment;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee implements  Comparable<Employee>{
    private String Name;
    private int CakesCovered;
    private String EmployeeType;

    public Employee(String name, int cakesCovered) {
        Name = name;
        CakesCovered = cakesCovered;
    }

    public Employee(String name, int cakesCovered, String employeeType) {
        Name = name;
        CakesCovered = cakesCovered;
        EmployeeType = employeeType;
    }

    public String getName() {
        return Name;
    }

    public String getEmployeeType() {
        if (EmployeeType == "QC") {
            return "Quality controller";
        }
        else {
            return "Standard";
        }
    }

    public int getCakesCovered() {
        return CakesCovered;
    }

    public double calculatePay() {
        if (CakesCovered <= 50) {
            double Pay = (0.1 * CakesCovered);
            if (EmployeeType == "QC") {
                Pay = (Pay * 1.12);
            }
            return Pay;
        }
        else if (CakesCovered >= 50) {
            double Pay = (0.1 * 50);
            int CakesOver50 = (CakesCovered - 50);
            Pay = (Pay + (0.15 * CakesOver50));
            if (EmployeeType == "QC") {
                Pay = (Pay * 1.12);
            }
            return Pay;
        }
        return 0;
    }

    public String formatPay(){
            NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);
            return gb.format(calculatePay());
    }

    public void update(int GoodCakes, int BadCakes){
        if ((GoodCakes > 0)&(BadCakes > 0)){
            this.CakesCovered = (getCakesCovered() + GoodCakes) - (BadCakes*2);
        }
        else {
            System.out.println("This is an impossible number of cakes");
        }
    }


    public String displayPay(){
        return (Name + " " + formatPay());
    }

//    @Override
//    public String toString() {
//        return  getName() + '\'' +
//                ", " + getCakesCovered() +
//                ", " + displayPay() ;
//    }

    @Override
    public int compareTo(Employee e1) {
        if (e1.getCakesCovered() > this.getCakesCovered()){
            return 1;
        }
        else if(e1.getCakesCovered() < this.getCakesCovered()){
            return -1;
        }
        // if the cakes are equal go to alphabetical order
        else if(e1.getCakesCovered() == this.getCakesCovered()){

            int compare = e1.getName().compareTo(this.getName());

            if (compare < 0) {
                return 1;
            }
            else if (compare > 0) {
                return -1;
            }
            else {
                return 0;
            }
        }
        else{
            return 0;
        }
    }

}

