package pro.sky.java.course1;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private String name = "Гриффиндор";

    public Gryffindor(String fistName, String surname, int magicPower, int transgress, int nobility, int honor, int bravery) {
        super(fistName, surname, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public Gryffindor() {
        super();
    }

    public void whoIsTheBest(Gryffindor[] gryffindors) {
        int s;
        int sum = gryffindors[0].nobility + gryffindors[0].honor+ gryffindors[0].bravery;
        for (int i = 1; i < gryffindors.length; i++) {
            int sum2 = gryffindors[i].nobility + gryffindors[i].honor+ gryffindors[i].bravery;
            if (sum > sum2) {
                s = sum - sum2;
                System.out.println("Cравнительная оценка: у " + gryffindors[0].getFistName() + " " + gryffindors[0].getSurname() + " больше способностей, чем у " + gryffindors[i].getFistName() + " " + gryffindors[i].getSurname() + " на " + s);
            }
            if (sum2 > sum) {
                s= sum2-sum;
                System.out.println("Cравнительная оценка: у " + gryffindors[i].getFistName() + " " + gryffindors[i].getSurname() + " больше способностей, чем у " + gryffindors[0].getFistName() + " " + gryffindors[0].getSurname()+ " на " + s);
            }
        }
    }

    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery;
    }
}
