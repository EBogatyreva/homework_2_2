package pro.sky.java.course1;

public class Hufflepuff extends Hogwarts {
    private int hardworking=100;
    private int loyal=100;
    private int honest=100;
    private String name = "Пуффендуй";

    public Hufflepuff(String fistName, String surname, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(fistName, surname, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public Hufflepuff() {

    }

    public void whoIsTheBest(Hufflepuff[] hufflepuffs) {
        int s;
        int sum = hufflepuffs[0].hardworking + hufflepuffs[0].loyal+ hufflepuffs[0].honest;
        for (int i = 1; i < hufflepuffs.length; i++) {
            int sum2 = hufflepuffs[i].hardworking + hufflepuffs[i].loyal+ hufflepuffs[i].honest;
            if (sum > sum2) {
                s = sum - sum2;
                System.out.println("Cравнительная оценка: у " + hufflepuffs[0].getFistName() + " " + hufflepuffs[0].getSurname() + " больше способностей, чем у " + hufflepuffs[i].getFistName() + " " + hufflepuffs[i].getSurname() + " на " + s);
            }
            if (sum2 > sum) {
                s= sum2-sum;
                System.out.println("Cравнительная оценка: у " + hufflepuffs[i].getFistName() + " " + hufflepuffs[i].getSurname() + " больше способностей, чем у " + hufflepuffs[0].getFistName() + " " + hufflepuffs[0].getSurname()+ " на " + s);
            }
        }
    }

    @Override
    public String toString() {
        return getFistName()+getSurname()+", Факультет " + name + ", уровень магии "+getMagicPower()+", уровень трансгресии "+getTransgress()+", трудолюбие " + hardworking + ", верность " + loyal + ", честность " + honest;
    }

}
