import java.util.Scanner;

public class Draw {
    public static void main(String[] args){
        System.out.print( "\nWhich animal would you like to draw?\n" );
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Write 1 for butterfly " );
        System.out.println( "Write 2 for elephant  " );
        System.out.println( "Write 3 for bear      " );
        System.out.println( "Write 4 for snake     " );
        int answer = scanner.nextInt();
        if (answer == 4){
            butterfly();
        }

    }
    public static void butterfly()
    {
        System.out.println("  .==-.                   .-==.     ");
        System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
        System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
        System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
        System.out.println("      `._... .q(_)p. ..._.'         ");
        System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
        System.out.println("        .\"\"' .'|=|`. `\"\".       ");
        System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
        System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
        System.out.println("      \\O `::/       \\::' O/       ");
        System.out.println("       \"\"--'         `--\"\"   hjw");
    }
}
 /**
  * Scope the level of a variable in a class or a function
  * class all code
  * function scope
  * class scope
  *
  */