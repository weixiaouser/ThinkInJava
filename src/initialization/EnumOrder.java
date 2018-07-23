package initialization;

/**
 * Created by weixiao on 2018/7/23.
 * initialization/EnumOrder.java
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s:Spiciness.values()){
            System.out.println(s+". ordinal "+s.ordinal());
        }
    }
}/*output:
NOT. ordinal 0
MILD. ordinal 1
MEDIUM. ordinal 2
HOT. ordinal 3
FLAMING. ordinal 4
*/
