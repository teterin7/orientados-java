public class Bicicleta {
    static String color;
    String marca;
    int modelo;

    Bicicleta(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("pedalea rapidamente"+color);
    }

    public void frenar() {
        System.out.println("debes frenar");
    }



}