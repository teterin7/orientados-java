public class Coche {
    int numRuedas;
    int numPuertas;
    String marca;

    Coche(int numRuedas,int numPuertas,String marca){

        this.numPuertas= numPuertas;
        this.numRuedas = numRuedas;
        this.marca=marca;
        }
        public void acelerar () {
            System.out.println("pedalea rapidamente");
        }
         public void frenar (){
                System.out.println("frena ya mismo");
            }
    }
