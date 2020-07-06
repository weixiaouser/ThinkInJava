package holding;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

/**
 * Created by weixiao on 2018/10/8.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(pets);
        System.out.println("pets.getFirst():"+pets.getFirst());
        System.out.println("pets.element():"+pets.element());
        System.out.println("pets.peek():"+pets.peek());
        System.out.println("pets.remove():"+pets.remove());
        System.out.println("pets.removeFirst():"+pets.removeFirst());
        System.out.println("pets.poll():"+pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst():"+pets);
        pets.offer(Pets.randomPet());
        System.out.println("After offer():"+pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast():"+pets);
        System.out.println("pets.removeLast():"+pets.removeLast());
    }
}/*output:
[Rat, Manx, Cymric, Mutt, Pug]
pets.getFirst():Rat
pets.element():Rat
pets.peek():Rat
pets.remove():Rat
pets.removeFirst():Manx
pets.poll():Cymric
[Mutt, Pug]
After addFirst():[Rat, Mutt, Pug]
After offer():[Rat, Mutt, Pug, Cymric]
After addLast():[Rat, Mutt, Pug, Cymric, Hamster]
pets.removeLast():Hamster
*/
