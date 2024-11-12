package Lesson20Constructors;

public class Lesson20 {
    public static void main(String[] args) {
    Human1 hum1 = new Human1();
    System.out.println(hum1.getName()+ hum1.getAge());        
    }
}


class Human1{
    private String name;
    private int age;

    public Human1(){
        this.name = "default name";
        age = 0;
    }

     public Human1(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

