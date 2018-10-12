package holding;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by weixiao on 2018/10/10.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String ,Pet> petMap = new HashMap<String,Pet>();
        petMap.put("My Cat",new Cat("Molly"));
        petMap.put("My Dog",new Dog("Ginger"));
        petMap.put("My Hamster",new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }
}/*output:
{My Dog=Dog Ginger, My Cat=Cat Molly, My Hamster=Hamster Bosco}
Dog Ginger
true
true
*/
