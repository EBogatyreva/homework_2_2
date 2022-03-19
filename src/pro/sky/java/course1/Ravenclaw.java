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

    public void whoIsTheBest(Ravenclaw ravenclaw) {
        super.whoIsTheBest(ravenclaw);

        if (ravenclaw.smart > this.smart) {
            System.out.println("Cравнительная оценка уровня сообразительности: у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (ravenclaw.smart - this.smart));
        } else if (ravenclaw.smart < this.smart)
            System.out.println("Cравнительная оценка уровня сообразительности: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " на " + (this.smart - ravenclaw.smart));

        if (ravenclaw.wise > this.wise) {
            System.out.println("Cравнительная оценка уровня мудрости: у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (ravenclaw.wise - this.wise));
        } else if (ravenclaw.wise < this.wise) {
            System.out.println("Cравнительная оценка уровня мудрости: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " на " + (this.wise - ravenclaw.wise));
        }
        if (ravenclaw.witty > this.witty) {
            System.out.println("Cравнительная оценка уровня остроумия: у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (ravenclaw.witty - this.witty));
        } else if (ravenclaw.witty < this.witty) {
            System.out.println("Cравнительная оценка уровня остроумия: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " на " + (this.witty - ravenclaw.witty));
        }

        if (ravenclaw.fullOfCreativity > this.fullOfCreativity) {
            System.out.println("Cравнительная оценка уровня креативности: у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (ravenclaw.fullOfCreativity - this.fullOfCreativity));
        } else if (ravenclaw.fullOfCreativity < this.fullOfCreativity) {
            System.out.println("Cравнительная оценка уровня креативности: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + ravenclaw.getFistName() + " " + ravenclaw.getSurname() + " на " + (this.fullOfCreativity - ravenclaw.fullOfCreativity));
        }
    }


    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", сообразительность " + smart + ", мудрость " + wise + ", остроумие " + witty + ", творчество " + fullOfCreativity;
    }

}
