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

<<<<<<< HEAD

    public void whoIsTheBest(Gryffindor gryffindors) {
        super.whoIsTheBest(gryffindors);

        if (gryffindors.nobility > this.nobility) {
            System.out.println("Cравнительная оценка уровня благородства: у " + gryffindors.getFistName() + " " + gryffindors.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (gryffindors.nobility - this.nobility));
        } else if (gryffindors.nobility < this.nobility)
            System.out.println("Cравнительная оценка уровня благородства: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + gryffindors.getFistName() + " " + gryffindors.getSurname() + " на " + (this.nobility - gryffindors.nobility));

        if (gryffindors.honor > this.honor) {
            System.out.println("Cравнительная оценка уровня чести: у " + gryffindors.getFistName() + " " + gryffindors.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (gryffindors.honor - this.honor));
        } else if (gryffindors.honor < this.honor) {
            System.out.println("Cравнительная оценка уровня чести: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + gryffindors.getFistName() + " " + gryffindors.getSurname() + " на " + (this.honor - gryffindors.honor));
        }
        if (gryffindors.bravery > this.bravery) {
            System.out.println("Cравнительная оценка уровня храбрости: у " + gryffindors.getFistName() + " " + gryffindors.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (gryffindors.bravery - this.bravery));
        } else if (gryffindors.bravery < this.bravery) {
            System.out.println("Cравнительная оценка уровня храбрости: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + gryffindors.getFistName() + " " + gryffindors.getSurname() + " на " + (this.bravery - gryffindors.bravery));
=======
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
>>>>>>> origin/newbranch
        }
    }

    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery;
    }
}
<<<<<<< HEAD

=======
>>>>>>> origin/newbranch
