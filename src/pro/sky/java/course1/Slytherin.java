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

    public void whoIsTheBest(Slytherin[] slytherins) {
        int s;
        int sum = slytherins[0].cunning + slytherins[0].determination+ slytherins[0].ambition+ slytherins[0].resourcefulness+slytherins[0].thirstForPower;
        for (int i = 1; i < slytherins.length; i++) {
            int sum2 = slytherins[i].cunning + slytherins[i].determination+ slytherins[i].ambition+ slytherins[i].resourcefulness+slytherins[i].thirstForPower;
            if (sum > sum2) {
                s = sum - sum2;
                System.out.println("Cравнительная оценка: у " + slytherins[0].getFistName() + " " + slytherins[0].getSurname() + " больше способностей, чем у " + slytherins[i].getFistName() + " " + slytherins[i].getSurname() + " на " + s);
            }
            if (sum2 > sum) {
                s= sum2-sum;
                System.out.println("Cравнительная оценка: у " + slytherins[i].getFistName() + " " + slytherins[i].getSurname() + " больше способностей, чем у " + slytherins[0].getFistName() + " " + slytherins[0].getSurname()+ " на " + s);
            }
        }
    }

    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", хитрость " + cunning + ", решительность " + determination + ", амбициозность " + ambition + ", находчивость " + resourcefulness + ", жажда власти " + thirstForPower;
    }
}
