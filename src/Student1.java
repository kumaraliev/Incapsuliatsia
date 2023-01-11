public class Student1 {
    private String name;
    private String surname;
    private int age;
    private String email;


    public  void  setName(String name) {
        this.name=name;
    }
    public String getName() {
        this.name = name;
        return name;
    }
    public  String  getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void getAge(int jash) {
        if (jash < 37 && jash > 0) {
            age = jash;

        } else {
            System.out.println("Tuuta emes jash");
        }
    }
    public void setAge(int age) {
        this.age = age;
    }
}



