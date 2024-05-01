import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido a la inmersion de java!");
       // System.out.println("pelicula kingkong");
        // Declaracion de Variables

         int fechaDeLanzamiento = 1996;
         double evaluacion = 4.5;
         boolean incluidoEnElPaqueteBasico = true;
         String nombre = "kingkong";
        String sinopsis = """
                la mejor pelicula del fin del milenio
                excelente trama
                """;
        double mediaevaluacionusuario = 0;

                System.out.println("pelicula:" + nombre);
        System.out.println(sinopsis);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPaqueteBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("media De La Evaluacion de Kingkong: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("pelicula Popular En El Momento");
        } else {
            System.out.println("pelicula Retro de ciencia ficcion Que Vale La Pena Ver");
        }
        for (int i = 0; i < 2; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la nota que le darias a KIng kong");
            double notakingkong = teclado.nextDouble();
            mediaevaluacionusuario = mediaevaluacionusuario + notakingkong;
        }
        System.out.println("la media de la pelicula Kingkong calculada po el usuario es: " + mediaevaluacionusuario / 3);

    }
}