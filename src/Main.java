public class Main {
    public static void main(String[] args) {

          Student1 student= new Student1();
          student.setName("Kumar");
          student.setSurname("Aliev");
          student.setAge(37);
          student.setEmail("alievkumarbek85@mail.com");
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getEmail());
        System.out.println(student.getAge());
    }
}