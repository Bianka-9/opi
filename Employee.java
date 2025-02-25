public class Employee {
    String name;
    int age;
    public Employee(){
        this.name ="névtelen";
        this.age = 0;
    }

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, int kor){
        this.name = name;
        this.age = kor;
    }
    
}
