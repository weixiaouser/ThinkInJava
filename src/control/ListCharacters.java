package control;

/**
 * Created by weixiao on 2018/6/5.
 */
//control/ListCharacters.java
//Demonstrates for loop by listing
//all the lowercase ASCII letters.

public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0;c < 128; c++){
            if(Character.isLowerCase(c)){
                System.out.println("value:"+(int)c+" character:"+c);
            }
        }
    }
}
