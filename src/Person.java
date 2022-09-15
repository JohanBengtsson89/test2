public class Person {
    String name;
    String job;
    int age;
    String sex;

    public Person(String name, String job, int age, String sex) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
