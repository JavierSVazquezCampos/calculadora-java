public class Calculadora {
    public static void main(String[] args){
        System.out.println(" Calculadora Iniciada ")
        
        Resta rest = new Resta();


        System.out.println("Resta: " + rest.restar(10, 5));

        Multiplicacion mult = new Multiplicacion();
        System.out.println("Multiplicación: " + mult.multiplicar(10, 5));
    }

    }
}