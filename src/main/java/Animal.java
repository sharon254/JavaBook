class Animal {
        String sound = "";
        String name = "";
    public void sayMyName(String name) {
        System.out.println("My name is " + name);
    };
    public void produceSound(String sound) {
        System.out.println(sound);
    };
};
class main {
    public static void main(String[] args) {
        Animal donkey = new Animal();
        donkey.name = "donkey";
        donkey.sound = "Honkey honkey";

        donkey.sayMyName(donkey.name);
        donkey.produceSound(donkey.sound);
    }
}
