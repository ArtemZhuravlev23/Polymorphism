public class Main {
    
    public static void main(String[] args) {

        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicBand = new ClassicMusic();

        MusicStyles[] bands = {popBand, rockBand, classicBand};

        for (MusicStyles band : bands) {
            band.playMusic();

            System.out.println("\nPop bands and artists: Coldplay, Simple plan, Avril Lavigne, " +
                    "Imagine Dragons.");

            System.out.println("\nRock bands and artists: The Beatles, Nickelback, Arctic Monkeys, " +
                    "Evanescence.");

            System.out.println("\nClassic bands and artists: Johann Sebastian Bach, " +
                    "Ludwig van Beethoven, Vivaldi.");

        }
    }
}




