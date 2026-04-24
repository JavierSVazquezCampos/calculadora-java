public class Calculadora {
    public static void main(String[] args){
        System.out.println(" Calculadora Iniciada ");

        Suma sum = new Suma();
        
        System.out.println("Suma: " + sum.sumar(10, 5));
    }
}