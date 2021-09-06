package Tugas4;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPublic = 100;
        this.intPrivate = 20;
    }
    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    public int getIntPrivate() {
        return this.intPrivate;
    }

    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

public class Main {

    public static void main(String[] args) {

        Data object = new Data();

        object.intPublic = 10;
        System.out.println("public : " +object.intPublic);

        int angka = object.getIntPrivate();
        System.out.println("getter : " +angka);

        object.setDoublePrivate(26);
        object.display();
    }
}
