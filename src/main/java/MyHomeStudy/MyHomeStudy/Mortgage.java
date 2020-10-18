package MyHomeStudy.MyHomeStudy;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while (amount + amount * percent > salary) {
           year++;
           amount -= salary;
            amount += amount *= percent;
        }
        return year;
    }
}