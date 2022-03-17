package pro.sky.java.course1;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;
    private String name = "Слизерин";

    public Slytherin(String fistName, String surname, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fistName, surname, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public Slytherin() {

    }

    public void whoIsTheBest(Slytherin slytherin) {
         super.whoIsTheBest(slytherin);

        if (slytherin.cunning > this.cunning) {
            System.out.println("Cравнительная оценка уровня хитрости: у " + slytherin.getFistName() + " " + slytherin.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (slytherin.cunning - this.cunning));
        } else if (slytherin.cunning < this.cunning)
            System.out.println("Cравнительная оценка уровня хитрости: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + slytherin.getFistName() + " " + slytherin.getSurname() + " на " + (this.cunning - slytherin.cunning));

        if (slytherin.determination > this.determination) {
            System.out.println("Cравнительная оценка уровня решительности: у " + slytherin.getFistName() + " " + slytherin.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (slytherin.determination - this.determination));
        } else if (slytherin.determination < this.determination) {
            System.out.println("Cравнительная оценка уровня решительности: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + slytherin.getFistName() + " " + slytherin.getSurname() + " на " + (this.determination - slytherin.determination));
        }
        if (slytherin.ambition > this.ambition) {
            System.out.println("Cравнительная оценка уровня амбициозности: у " + slytherin.getFistName() + " " + slytherin.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (slytherin.ambition - this.ambition));
        } else if (slytherin.ambition < this.ambition) {
            System.out.println("Cравнительная оценка уровня амбициозности: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + slytherin.getFistName() + " " + slytherin.getSurname() + " на " + (this.ambition - slytherin.ambition));
        }

        if (slytherin.resourcefulness > this.resourcefulness) {
            System.out.println("Cравнительная оценка уровня находчивости: у " + slytherin.getFistName() + " " + slytherin.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (slytherin.resourcefulness - this.resourcefulness));
        } else if (slytherin.resourcefulness < this.resourcefulness) {
            System.out.println("Cравнительная оценка уровня находчивости: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + slytherin.getFistName() + " " + slytherin.getSurname() + " на " + (this.resourcefulness - slytherin.resourcefulness));
        }

        if (slytherin.thirstForPower > this.thirstForPower) {
            System.out.println("Cравнительная оценка уровня жажды власти: у " + slytherin.getFistName() + " " + slytherin.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (slytherin.thirstForPower - this.thirstForPower));
        } else if (slytherin.thirstForPower < this.thirstForPower) {
            System.out.println("Cравнительная оценка уровня жажды власти: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + slytherin.getFistName() + " " + slytherin.getSurname() + " на " + (this.thirstForPower - slytherin.thirstForPower));
        }
    }

    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", хитрость " + cunning + ", решительность " + determination + ", амбициозность " + ambition + ", находчивость " + resourcefulness + ", жажда власти " + thirstForPower;
    }
}
