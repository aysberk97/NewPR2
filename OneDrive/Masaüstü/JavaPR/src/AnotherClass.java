public class AnotherClass {

    String name;
    int age;

    public static void main(String[] args) {

        AnotherClass a = new AnotherClass();

        a.setAge(31);
        a.setName("Ahmet");

        System.out.println(a.getAge());
        System.out.println(a.getName());

        a.printDetails();
        a.printDetails();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void printDetails(){
        System.out.println("Name is: " + name + ", " + "Age is: "  +age);
    }
}

