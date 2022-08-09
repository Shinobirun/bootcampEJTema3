public class Main {
    public static void main(String[] args) {
       suma(20,30, 23);

    Coche michoche= new Coche();

    michoche.sumapuerta(Coche.getCantPuertas());

    }

    public static int suma(int a, int b, int c){
        int resultado;
        resultado=a+b+c;
        System.out.println(resultado);
        return resultado;
    }

    public static class Coche{

        //atributos
        private static int cantPuertas=4;

        //constructor
        public Coche(){}

        //metodos

        public static int getCantPuertas() {
            return Coche.cantPuertas;
        }

        public  int sumapuerta(int cantPuertas){
            int resultado;
            resultado=cantPuertas+1;
            System.out.println("La cantidad de puertas era de de: "+cantPuertas);
            System.out.println("La cantidad Actual de puertas ahora es de: "+resultado);
            return resultado;
        }


    }
}