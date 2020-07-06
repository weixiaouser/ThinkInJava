package holding;

import typeinfo.pets.*;

import java.util.*;

/**
 * Created by weixiao on 2018/9/27.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: "+pets);
        Hamster h = new Hamster();
        pets.add(h);//Automatically resizes
        System.out.println("2:" +pets);
        System.out.println("3:"+pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        System.out.println("4:"+p +pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("5:"+pets.indexOf(cymric));
        System.out.println("6:"+pets.remove(cymric));
        //Must be the exact object:
        System.out.println("7:"+pets.remove(p));
        System.out.println("8:"+pets);
        pets.add(3,new Mouse());//Insert at an index
        System.out.println("9:"+pets);
        List<Pet> sub = pets.subList(1,4);
        System.out.println("subList:"+sub);
        System.out.println("10:"+pets.containsAll(sub));
        Collections.sort(sub);//In-place sort
        System.out.println("sorted subList:"+sub);
        //Order is not important in containsAll()
        System.out.println("11:"+pets.containsAll(sub));
        Collections.shuffle(sub,rand);//Mix it up
        System.out.println("shuffled subList: "+sub);
        System.out.println("12: "+pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1),pets.get(4));
        System.out.println("sub："+sub);
        copy.retainAll(sub);
        System.out.println("13:"+copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);//Remove by index
        System.out.println("14:"+copy);
        copy.set(1,new Mouse());
        System.out.println("15:"+copy);
        copy.set(1,new Mouse());
        System.out.println("16:"+copy);
        copy.addAll(2,sub);
        System.out.println("17:"+copy);
        System.out.println("18:"+pets.isEmpty());
        pets.clear();//Remove all elements
        System.out.println("19:"+pets);
        System.out.println("20:"+pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21:"+pets);
        Object[] o = pets.toArray();
        System.out.println("22:"+o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23:"+pa[3].id());

    }
}/*output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2:[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3:true
4:Cymric2
5:-1
6:false
7:true
8:[Rat, Manx, Mutt, Pug, Cymric, Pug]
9:[Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList:[Manx, Mutt, Mouse]
10:true
sorted subList:[Manx, Mouse, Mutt]
11:true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub：[Mouse, Pug]
13:[Mouse, Pug]
14:[Rat, Mouse, Mutt, Pug, Cymric, Pug]
15:[Rat, Mouse, Mutt, Pug, Cymric, Pug]
16:[Rat, Mouse, Mutt, Pug, Cymric, Pug]
17:[Rat, Mouse, Mouse, Pug, Mutt, Pug, Cymric, Pug]
18:false
19:[]
20:true
21:[Manx, Cymric, Rat, EgyptianMau]
22:EgyptianMau
23:15
*/
