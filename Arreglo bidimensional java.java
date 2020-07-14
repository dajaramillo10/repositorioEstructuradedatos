

public class App {
    public static void main(String[] args) throws Exception {

        double[][] notas = { { 3.2, 4.0, 4.5 }, { 4.7, 4.5, 2.5 }, { 2.0, 4.0, 3.5 }  };
        double suma = 0; 
        double NumeroElementos = 0; 


        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                double numero = notas[i][j];
                suma = suma + numero;
                NumeroElementos = NumeroElementos + 1;
            }
        }

        double promedio = (double) suma / NumeroElementos;
        System.out.println("la suma de notas es: "+ suma);
        System.out.println("El promedio de notas es: "+ promedio);
        

       
        

    }
}    