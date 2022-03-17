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
        }
    }

    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery;
    }
}

