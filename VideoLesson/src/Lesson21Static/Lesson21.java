package Lesson21Static;

public class Lesson21 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",12);
        Human h2 = new Human("Tom",21);

        Human h3 = new Human("sdwqs", 41);
        h1.printNum();
        h2.printNum();
        h3.printNum();


    }
}
    
    class Human{
        private String name;
        private int age;

        private static int countPeople;

      

        public Human(String name, int age){
            System.out.println("Привет из третьего конструктора");
            this.name = name;
            this.age = age;
            countPeople++;
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

        public void getAllField(){
            System.out.println(name+" "+age+ " ");
        }
        public void printNum(){
            System.out.println(countPeople);
        }

    }
