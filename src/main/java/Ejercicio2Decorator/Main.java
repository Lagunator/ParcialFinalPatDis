package Ejercicio2Decorator;

public class Main {
    public static void main(String[] args) {
        IPhone xiaomi = new Xiaomi("Xiaomi",1600,14.8,8,"Prado",2,5.5);
        xiaomi = new Charger(xiaomi,40,"Xiaomi",38);
        xiaomi = new Headphones(xiaomi, 120, "Samsung");
        xiaomi = new RAM(xiaomi, 5, "Razen",70);

        xiaomi.agregarFuncionalidad();

        System.out.println("-------------------------------------------------------------");

        IPhone huawei = new Huawei("Huawei",2200,11.5,4,"Irpavi",1,6.8);
        huawei = new Charger(huawei,90,"Xiaomi",50);
        huawei = new Headphones(huawei, 80, "Sony");
        huawei = new RAM(huawei, 7, "Honor",140);

        huawei.agregarFuncionalidad();

        System.out.println("-----------------------------------------------------------------");

        IPhone android = new Android("Samsung",3000,16.8,17,"Obrajes",3,11.6);
        android = new Charger(android,250,"Samsung",60);
        android = new Headphones(android, 170, "Bose");
        android = new RAM(android, 6, "Toshiba",200);

        android.agregarFuncionalidad();
    }
}
