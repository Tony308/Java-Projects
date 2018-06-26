public class People {


    private String name;
    private int age;
    private String jobTitle;

    public People(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public void getAll() {
        System.out.println(this.name + this.age + this.jobTitle);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String e) {
        this.jobTitle = e;
    }

}
