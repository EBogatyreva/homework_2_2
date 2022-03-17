package pro.sky.java.course1;

public class Hogwarts {
    private String fistName;
    private String surname;
    private int magicPower;
    private int transgress;

    public Hogwarts(String fistName, String surname, int magicPower, int transgress) {
        this.fistName = fistName;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public Hogwarts() {

    }

    public void whoIsTheBest(Hogwarts student1, Hogwarts student2) {
        int s;
        int sum = student1.magicPower + student1.transgress;
        int sum2 = student2.magicPower + student2.transgress;
            if (sum > sum2) {
                s = sum - sum2;
                System.out.println("Cравнительная оценка: у " + student1.getFistName() + " " + student1.getSurname() + " больше способностей, чем у " + student2.getFistName() + " " + student2.getSurname() + " на " + s);            }
            if (sum2 > sum) {
                s= sum2-sum;
                System.out.println("Cравнительная оценка: у " + student2.getFistName() + " " + student2.getSurname() + " больше способностей, чем у " + student1.getFistName() + " " + student1.getSurname()+ " на " + s);
            }
        }


    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getFistName() {
        return fistName;
    }

    public String getSurname() {
        return surname;
    }
}
