package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String toWave = str.toLowerCase();
        String[] waveArray = new String[str.length()];
        Character tochange;
        for(int i = 0; i<str.length(); i++){
             tochange = toWave.charAt(i);
             waveArray[i] = tochange.toString().toUpperCase();

        }


        return waveArray;
    }
}
