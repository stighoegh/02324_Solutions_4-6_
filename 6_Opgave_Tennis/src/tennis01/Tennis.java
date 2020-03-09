package tennis01;

public class Tennis extends Thread {
    private String navn;
    private boolean harBold;
    private Tennis modstander;

    public Tennis(String navn, boolean harBold, Tennis modstander) {
        this.navn = navn;
        this.harBold = harBold;
        this.modstander = modstander;
    }

    public void setModstander(Tennis tennis) {
        modstander = tennis;
    }

    public void run(){
        while (true){
            while (!harBold)
                Sleeper.nap();

            Sleeper.sleepRandom(2.0);

            if ( Math.random() > 0.20 ) {
                System.out.println( this + " returnerer bolden" );
                harBold = false;
                modstander.modtagBold();
            }
            else {
                System.out.println( this + " missede bolden" );
                System.out.println( "Spillet er slut");
                System.out.println(modstander.navn + " vandt");
                System.out.println(this.navn + " tabte");
                System.exit(0);
            }
        }
    }

    @Override
    public String toString() {
        return "Tennis [navn=" + navn + ", harBold=" + harBold + "]";
    }

    public void modtagBold() {
        harBold = true;
    }

    public void setHarBold(boolean harBold) {
        this.harBold = harBold;
    }

}
