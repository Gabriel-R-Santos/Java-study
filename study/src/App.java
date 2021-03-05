import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        exampleInput();

    }
    public static void exampleInput() {
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }

    public static void example01() {
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        double x = 10.35784;

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int core = 5920;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println(x);
        System.out.printf("%.2f%n", x); // format values ​​to two decimal places
        System.out.printf("%.4f%n", x); // format values ​​to four decimal places
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x); // format values ​​to four decimal places

        // concatenate

        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f Metros clears%n", x);
        System.out.printf("%s tem %d e sua renda é de %.2f reais%n", nome, idade, renda);
        // %s : String | %d int | %f float | %n skip lin

        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println("Product:");
        System.out.printf("%s which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, core, gender);
        System.out.printf("Measue with eight decimal palces: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

        // calculating area

        double a = 6.0;
        double b = 8.0;
        double h = 5.0;
        double area;

        area = (a + b) / 2f * h;
        System.out.println(area);

        a = 5;
        b = 2;
        double resultado;
        resultado = a / b;
        System.out.println(resultado);

        double r;
        int r2;
        r = 5.0;
        r2 = (int) r; // cast
        System.out.println(r2);

    }
}
