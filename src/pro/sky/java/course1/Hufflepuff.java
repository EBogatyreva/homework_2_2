package pro.sky.java.course1;

public class Hufflepuff extends Hogwarts {
    private int hardworking = 100;
    private int loyal = 100;
    private int honest = 100;
    private String name = "Пуффендуй";

    public Hufflepuff(String fistName, String surname, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(fistName, surname, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public Hufflepuff() {

    }

    public void whoIsTheBest(Hufflepuff hufflepuff) {
        super.whoIsTheBest(hufflepuff);

        if (hufflepuff.hardworking > this.hardworking) {
            System.out.println("Cравнительная оценка уровня трудолюбия: у " + hufflepuff.getFistName() + " " + hufflepuff.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (hufflepuff.hardworking - this.hardworking));
        } else if (hufflepuff.hardworking < this.hardworking)
            System.out.println("Cравнительная оценка уровня трудолюбия: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + hufflepuff.getFistName() + " " + hufflepuff.getSurname() + " на " + (this.hardworking - hufflepuff.hardworking));

        if (hufflepuff.loyal > this.loyal) {
            System.out.println("Cравнительная оценка уровня верности: у " + hufflepuff.getFistName() + " " + hufflepuff.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (hufflepuff.loyal - this.loyal));
        } else if (hufflepuff.loyal < this.loyal) {
            System.out.println("Cравнительная оценка уровня верности: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + hufflepuff.getFistName() + " " + hufflepuff.getSurname() + " на " + (this.loyal - hufflepuff.loyal));
        }
        if (hufflepuff.honest > this.honest) {
            System.out.println("Cравнительная оценка уровня честности: у " + hufflepuff.getFistName() + " " + hufflepuff.getSurname() + " больше способностей, чем у " + this.getFistName() + " " + this.getSurname() + " на " + (hufflepuff.honest - this.honest));
        } else if (hufflepuff.honest < this.honest) {
            System.out.println("Cравнительная оценка уровня честности: у " + this.getFistName() + " " + this.getSurname() + " больше способностей, чем у " + hufflepuff.getFistName() + " " + hufflepuff.getSurname() + " на " + (this.honest - hufflepuff.honest));
        }

    }

    @Override
    public String toString() {
        return getFistName() + getSurname() + ", Факультет " + name + ", уровень магии " + getMagicPower() + ", уровень трансгресии " + getTransgress() + ", трудолюбие " + hardworking + ", верность " + loyal + ", честность " + honest;
    }

}
