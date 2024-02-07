package Assignment;

public class TableMain {
    public static void main(String[] args) {
        EmployeeTable t1 = new EmployeeTable();
        Employee andrew = new Employee("Andrew",162);
        t1.addScore(andrew);
        Employee hafsa = new Employee("Hafsa",34);
        t1.addScore(hafsa);
        Employee ayub = new Employee("Ayub",193);
        t1.addScore(ayub);
        Employee amaan = new Employee("Amaan",309);
        t1.addScore(amaan);
        Employee gary = new Employee("Gary",49);
        t1.addScore(gary);
        Employee diane = new Employee("Diane",217);
        t1.addScore(diane);



        // test for quality controller
        Employee rabia = new Employee("Rabia",385, "QC");
        t1.addScore(rabia);

        // print table and total
        System.out.println(t1.getTable());
        System.out.println(t1.getTotal());

        andrew.update(32,16);
        hafsa.update(44,21);
        ayub.update(102,12);
        amaan.update(56,1);
        gary.update(62,11);
        diane.update(10,2);

        // test for sorting and printing of table again to make sure it changes
        t1.sortTeam();
        System.out.println(t1.getTable());
        System.out.println(t1.getTotal());

        // test to ensure the sorting will go to the alphabetical order if the cakes are the same
        Employee test1 = new Employee("test2",111);
        t1.addScore(test1);
        Employee test2 = new Employee("test1",111);
        t1.addScore(test2);

        Employee test3 = new Employee("test3",1);
        t1.addScore(test3);
        test3.update(-20,-10);

        t1.sortTeam();
        System.out.println(t1.getTable());
        System.out.println(t1.getTotal());


    }
}

