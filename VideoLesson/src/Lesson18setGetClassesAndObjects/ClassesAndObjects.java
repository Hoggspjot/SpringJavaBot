package Lesson18setGetClassesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
       Person pers1 = new Person();
       pers1.setName("Рома");
       pers1.setAge(20);
       System.out.println(pers1.getName()+" "+pers1.getAge());
       
       Person pers2 = new Person();
       pers2.setName("Вова");
       pers2.setAge(21);
       System.out.println(pers2.getName()+" "+pers2.getAge());

    }
}

  // у класса могут быть
    // Данные (поля)
    // Действия, которые он может совершать (методы)

class Person{
   private String name;
   private int age;

   public void setName(String username){
    if (username.isEmpty()){
        System.out.println("Выввели пустое значение");
    }
     else name = username;
   }

   public String getName(){
    return name;
   }
    public void setAge(int userAge){
        age = userAge;
    }

public int getAge(){
    return age;
    }
   }

