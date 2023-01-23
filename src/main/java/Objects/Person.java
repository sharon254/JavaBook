package Objects;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, String[] passport,int seatNumber){

    }
    public Person(Person source){
        this.name = source.name;
        this.seatNumber = source.seatNumber;
        this.dateOfBirth = source.dateOfBirth;
        this.nationality = source.nationality;
        this.passport = source.passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport() {
        return passport;
    }

    public void setPassport(String[] passport) {
        this.passport = passport;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public boolean applyPassport(){
        int number = (int) (Math.random() * 2); ;
        return number == 1;


    }
}
