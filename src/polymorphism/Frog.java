package polymorphism;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by weixiao on 2018/8/31.
 * polymorphism/Frog.java
 * Cleanup and inheritance.
 */

class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic"+s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic"+s);
    }
}

class Description{
    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Creating Description"+s);
    }

    protected void dispose(){
        System.out.println("disposing Description "+s);
    }
}

class LivingCreature{
    private Characteristic p = new Characteristic(" is alive");
    private Description t = new Description(" Basic Living Creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic p = new Characteristic(" has heart");
    private Description t = new Description(" Animal not Vegetable");
    Animal(){
        System.out.println("Animal()");
    }
    protected void dispose(){
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic p = new Characteristic(" can live in water");
    private Description t = new Description(" Both water and land");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    protected void dispose(){
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian{
    private Characteristic p = new Characteristic(" Croaks");
    private Description t = new Description(" Eats Bugs");
    public Frog(){
        System.out.println("Frog()");
    }
    protected void dispose(){
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String args[]){
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}/*output:
Creating Characteristicis alive
Creating DescriptionBasic Living Creature
LivingCreature()
Creating Characteristichas heart
Creating DescriptionAnimal not Vegetable
Animal()
Creating Characteristiccan live in water
Creating DescriptionBoth water and land
Amphibian()
Creating CharacteristicCroaks
Creating DescriptionEats Bugs
Frog()
Bye!
Frog dispose
disposing Description Eats Bugs
disposing CharacteristicCroaks
Amphibian dispose
disposing Description Both water and land
disposing Characteristiccan live in water
Animal dispose
disposing Description Animal not Vegetable
disposing Characteristichas heart
LivingCreature dispose
disposing Description Basic Living Creature
disposing Characteristicis alive
*/
