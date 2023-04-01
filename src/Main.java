public class Main {
    public static void main(String[] args) {
        GryffindorStudent student1 = new GryffindorStudent("Гарри Поттер", 10, 20, 30, 40, 50);

        GryffindorStudent student2 = new GryffindorStudent("Гермиона Греинджер", 6, 50, 60, 5, 8);

        GryffindorStudent student3 = new GryffindorStudent("Рон Уизли", 50, 40, 10, 70, 50);

        SlyserinStudent student4 = new SlyserinStudent("Драко Малфлой", 40, 50, 15, 40, 4, 5, 4);
        SlyserinStudent student5 = new SlyserinStudent("Грегори Гойл", 50, 30, 5, 10, 8, 50, 90);
        SlyserinStudent student6 = new SlyserinStudent("Грэхэм Монтегю", 50,20,5,10,80,70,60);
        HufflepuffStudent student7 = new HufflepuffStudent("Захария Смит", 4, 60,10,70,80);
        HufflepuffStudent student8 = new HufflepuffStudent("Седрик Диггори", 4, 50,100,30,100);
        HufflepuffStudent student9 = new HufflepuffStudent("Джастин Финч-Флетчли", 4, 60,10,70,80);
        RavenclawsStudent student10 = new RavenclawsStudent("Чжоу Чанг", 5,30,100,90,60,70);
        RavenclawsStudent student11 = new RavenclawsStudent("Падма Патил", 8,80,40,10,80,30);
        RavenclawsStudent student12 = new RavenclawsStudent("Маркус Белби", 5,70,80,90,70,80);
        System.out.println(student4);
        student1.compare(student2);
        student4.compare(student7);
    }

}