package polymorphism;

class Instrument{

    void play(Note n){
        System.out.println("Instrument.play()" + n);
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n){
        System.out.println("Wind.play()"+n);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n){
        System.out.println("Percussion.play"+n);
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}

public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[]e){
        for(Instrument i :e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
        };
    }
}
