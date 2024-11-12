package Lesson19This;

public class lesson19 {
    public static void main(String[] args) {
        Human2 hum1 = new Human2();
        hum1.setAge(18);
        hum1.setName("Tom");
        hum1.getInfo();
        Human2 hum2 = new Human2();
        hum2.setAge(25);
        hum2.setName("Bob");
        hum2.getInfo();

    }

}

class Human2{
    private String name;
    private int age;

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

    public void getInfo(){
        System.out.println(name +"\n"+ age);
    }

}
