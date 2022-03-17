package pro.sky.java.course1;

public class Main {
    public static void main(String[] args) {

        Gryffindor gryffindor = new Gryffindor();
        Hufflepuff hufflepuff = new Hufflepuff();
        Ravenclaw ravenclaw = new Ravenclaw();
        Slytherin slytherin = new Slytherin();

        Gryffindor gariPotter = new Gryffindor("Гари ", "Поттер", 100, 100, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона ", "Грейнджер", 70, 79, 100, 100, 100);
        Gryffindor ronWeasley = new Gryffindor("Рон ", "Уизли", 65, 56, 78, 100, 100);

        Slytherin dracoMalfoy = new Slytherin("Драко ", "Малфой", 60, 90, 100, 90, 80, 70, 100);
        Slytherin grahamMontague = new Slytherin("Грэхэм ", "Монтегю", 35, 50, 50, 50, 60, 70, 70);
        Slytherin gregoryGoyle = new Slytherin("Грегори ", "Гойл", 45, 60, 40, 50, 60, 70, 100);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария ", "Смит", 80, 99, 100, 80, 100);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик ", "Диггори", 75, 45, 80, 40, 90);
        Hufflepuff JustinFinchFletchley = new Hufflepuff("Джастин ", "Финч-Флетчли", 70, 99, 70, 80, 100);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу ", "Чанг", 50, 100, 100, 80, 70, 98);
        Ravenclaw padmaPatil = new Ravenclaw("Падма ", "Патил", 50, 45, 100, 90, 90, 100);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус ", "Белби", 50, 74, 75, 84, 54, 75);

        Gryffindor[] gryffindors = new Gryffindor[]{
                gariPotter, hermioneGranger, ronWeasley
        };
        Slytherin[] slytherins = new Slytherin[]{
                dracoMalfoy, grahamMontague, gregoryGoyle
        };
        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                zachariahSmith, cedricDiggory, JustinFinchFletchley
        };
        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                zhouChang, padmaPatil, marcusBelby
        };

        System.out.println("Описание студентов");
        System.out.println(gariPotter);
        System.out.println(dracoMalfoy);
        System.out.println(zachariahSmith);
        System.out.println(zhouChang);

        System.out.println(" ");
        System.out.println("Сравнительные оценки между студентами одного факультета");
        gariPotter.whoIsTheBest(ronWeasley);
        hermioneGranger.whoIsTheBest(ronWeasley);


        System.out.println(" ");
        System.out.println("Сравнительные оценки между двумя студентами разного факультета");
        gariPotter.whoIsTheBest(gregoryGoyle);
        hermioneGranger.whoIsTheBest(zhouChang);
    }
}
