public class Return {
    public static void main(String[] args){
        double area = calculateArea(4, 5);
        calculateArea(4, 9);
        calculateArea(7, 5);
        calculateArea(-7,8);
        explainArea("English");
        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String italianExplanation = explainArea("Italian");



    }
    public  static double calculateArea(double Length, double Width){
        if (Length <0||Width<0){
            System.out.println("Invalid Dimension");
            System.exit(0);
        }
        double area = Length * Width;
        return area;


    }
    public static String explainArea(String language){
        switch (language){
            case "English ": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default:return "Language not available";
        }

    }
    public static void printArea(double Length, double  Width, double Area){
        System.out.println(
                "Width is equal:" + Width + "Length is equal to:" + Length + "Has area of" + calculateArea(2,7)
        );
    }

}
// Parameter stores a value your function expects to receive
//value that you pass to a function is called an argument

//English "Area equals length * width"
//
//        French "La surface est egale a la longueur * la largeur"
//
//        Spanish "area es igual a largo * ancho"

// A function should be performing a single task
// void means a function does not return any value
// calculation has return value, but for just printing it is void
