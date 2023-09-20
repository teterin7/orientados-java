public class Main {
    public static void main(String[] args) {


        Bicicleta bmx = new Bicicleta("gw", 2001);
        Bicicleta trial = new Bicicleta("gw", 2004);
        Bicicleta stunt = new Bicicleta("rental", 2011);

        Bicicleta.color = "rojo";

        Coche rodillos = new Coche(4, 4, "mazda");

    Users saludo = new Users("jaime",33,124556634,"carrera85");

saludo.saludo();
saludo.datos();



        rodillos.acelerar();
        rodillos.frenar();



        bmx.acelerar();
        bmx.frenar();

        trial.acelerar();
        trial.frenar();

        }
    }
