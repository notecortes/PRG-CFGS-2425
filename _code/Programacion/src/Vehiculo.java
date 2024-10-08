public class Vehiculo {
    //atributos
    String color;
    String marca;
    double cilindraje;
    double litrosDeGasolina;

    //métodos
    //constuctores
    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, double cilindraje) {
        this.color = color;
        this.marca = marca;
        this.cilindraje = cilindraje;
    }

    public void repostar(double litrosDeGasolina){
        //añadimos los litros a los actuales
        this.litrosDeGasolina+=litrosDeGasolina;
    }

    public static void repostars(double litrosDeGasolina, Vehiculo v){
        v.litrosDeGasolina+=litrosDeGasolina;
    }

    //main
    public static void main(String[] args) {
        Vehiculo miCoche = new Vehiculo();
        System.out.println(miCoche.color); //null
        miCoche.color="rojo";
        System.out.println(miCoche.color); //rojo
        miCoche.repostar(20);
        System.out.println(miCoche.litrosDeGasolina);//20
        Vehiculo.repostars(20, miCoche);
        System.out.println(miCoche.litrosDeGasolina);//40
    }


}
