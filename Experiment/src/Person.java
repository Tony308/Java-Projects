public class Person {
    private String forename;
    private String surname;
    private String email;
    private int age;

    public Person(String forename, String surname, String email, int age) {
        this.setForename(forename);
        this.setSurname(surname);
        this.setEmail(email);
        this.setAge(age);
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
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

    public void setAge(int age) {
        this.age = age;
    }
}
