package pro.sky.java.course1;

public abstract class Hogwarts {
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

    public void whoIsTheBest(Hogwarts student) {
        if (student.magicPower > this.magicPower) {
            System.out.println("Cравнительная оценка уровня магии: у " + student.getFistName() + " " + student.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (student.magicPower - this.magicPower));
        } else if (this.magicPower > student.magicPower) System.out.println("Cравнительная оценка: уровня магии у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + student.getFistName() + " " + student.getSurname() + " на " + (this.magicPower-student.magicPower));

        if (student.transgress > this.transgress) {
            System.out.println("Cравнительная оценка: уровня трансгресии у " + student.getFistName() + " " + student.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (student.transgress - this.transgress));
        } else if (this.transgress > student.transgress) System.out.println("Cравнительная оценка: уровня трансгресии у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + student.getFistName() + " " + student.getSurname() + " на " + (this.transgress-student.transgress));
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
