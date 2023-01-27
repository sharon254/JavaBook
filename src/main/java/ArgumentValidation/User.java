package ArgumentValidation;

public class User {

    private String username;
    private int age;

    public int getAge() {
        if(age <0){
            throw new IllegalArgumentException("Age cannot be illegal");
        }
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        if(username == null || username.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank!");
        }
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
