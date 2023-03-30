public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        System.out.println(name);
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("%s said Hello! %n", name);
    }

    Person(String userName){
        this.name = userName;
    }


    public static void main(String[] args) {
        Person firstPerson = new Person("Minh");
        Person secondPerson = new Person("David");
        firstPerson.sayHello();
        secondPerson.sayHello();


     }

}
