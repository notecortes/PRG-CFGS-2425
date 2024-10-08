public class Temperatura {
    //atributos
    //constructores
    //métodos
    public double celsiusToFarenheit(double celsius){
        return ((1.8*celsius)+32);
    }
    //main
    public static void main(String[] args) {
        //System.out.println(Temperatura.celsiusToFarenheit(33));
        Temperatura t1 = new Temperatura();
        System.out.println(t1.celsiusToFarenheit(33));
    }
}
