public class Lingkaran {
    private double jari;
    final double phi=3.14159;

    static double luas;

  double getPhi(){
        return phi;
    }
    public double getJariDbl(){
        return jari;
    }

    Lingkaran(double jari){
        this.jari=jari;
    }

    double luasBangun(){
        this.luas=phi*jari*jari;
        return luas;
    }
    public void volume(){

    }

}
