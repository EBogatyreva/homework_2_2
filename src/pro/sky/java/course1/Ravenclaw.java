package pro.sky.java.course1;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;
    private String name = "Когтевран";

    public Ravenclaw(String fistName, String surname, int magicPower, int transgress, int smart, int wise, int witty, int fullOfCreativity) {
        super(fistName, surname, magicPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public Ravenclaw() {

    }

    public void whoIsTheBest(Ravenclaw[] ravenclaws) {
        int s;
        int sum = ravenclaws[0].smart + ravenclaws[0].wise+ ravenclaws[0].witty+ ravenclaws[0].fullOfCreativity;
        for (int i = 1; i < ravenclaws.length; i++) {
            int sum2 = ravenclaws[i].smart + ravenclaws[i].wise+ ravenclaws[i].witty+ ravenclaws[i].fullOfCreativity;
            if (sum > sum2) {
                s = sum - sum2;
                System.out.println("Cравнительная оценка: у " + ravenclaws[0].getFistName() + " " + ravenclaws[0].getSurname() + " больше способностей, чем у " + ravenclaws[i].getFistName() + " " + ravenclaws[i].getSurname() + " на " + s);
            }
            if (sum2 > sum) {
                s= sum2-sum;
                System.out.println("Cравнительная оценка: у " + ravenclaws[i].getFistName() + " " + ravenclaws[i].getSurname() + " больше способностей, чем у " + ravenclaws[0].getFistName() + " " + ravenclaws[0].getSurname()+ " на " + s);
            }
        }
    }


    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", сообразительность " + smart + ", мудрость " + wise + ", остроумие " + witty + ", творчество " + fullOfCreativity;
    }

}
