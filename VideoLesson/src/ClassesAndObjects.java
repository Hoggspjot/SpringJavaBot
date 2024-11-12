

public class ClassesAndObjects {
    public static void main(String[] args) {
       Person pers1 = new Person();
       pers1.name = "Roma";
       pers1.age = 20;
       System.out.println(pers1.name+" "+pers1.age);
       
       Person pers2 = new Person();
       pers2.name = "Vova";
       pers2.age = 21;
       System.out.println(pers2.name+" "+pers2.age);

    }
}

  // у класса могут быть
    // Данные (поля)
    // Действия, которые он может совершать (методы)

class Person{
    String name;
    int age;
}

