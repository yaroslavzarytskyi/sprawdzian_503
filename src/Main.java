public class Main {
    public static void main(String[] args) {
        Przedmiot angielski = new Przedmiot("angielski");
        Przedmiot polski = new Przedmiot("polski");
        Przedmiot matematyka = new Przedmiot("matematyka");
        Student student1 = new Student("Andrzej", "Kobierski", 1, 1);
        Student student2 = new Student("Mikołaj", "Kopernicki", 2, 3);
        Student student3 = new Student("Łukasz", "Mękalski",3,2);
        student1.setListaPrzedmiotow(new Przedmiot[]{polski, angielski});
        student2.setListaPrzedmiotow(new Przedmiot[]{angielski, matematyka});
        student3.setListaPrzedmiotow(new Przedmiot[]{polski, matematyka});
        System.out.println(student1);
        System.out.println(angielski);
    }
}