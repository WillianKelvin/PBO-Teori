public class Bola extends Lingkaran{
        private double volume;

    public Bola(double jari) {
        super(jari);
        volume();
    }


    public void volume(){
            this.volume= Math.pow(super.getJariDbl(),3)*super.getPhi()*4/3;
        }

    public double getVolume() {
        return volume;
    }

}
