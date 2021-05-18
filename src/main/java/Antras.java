/*
    Parašykite programą, kuri mokėtų suapvalinti double tipo skaičius pagal
    nurodytą tikslumą. Panaudokite matematinę funkciją Math.floor(…)
        Math.floor(2.345) = 2.0
        Math.floor(2.999) = 2.0
        programa 15.545678 -1 -> 20.0
        programa 15.545678  0 -> 16.0
        programa 15.545678  1 -> 15.5
        programa 15.545678  2 -> 15.55
        programa 15.545678  3 -> 15.546
 */

public class Antras {

    static double apvalinti(double d, int tikslumas) {
        if (tikslumas == 0) return Math.floor(d + 0.5);
        double calc = Math.pow(10.0, tikslumas);
        return Math.floor(d * calc + 0.5) / calc;
    }
}