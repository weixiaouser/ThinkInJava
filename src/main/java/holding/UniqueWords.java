package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by weixiao on 2018/10/9.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("src/holding/SetOperations.java" ,"\\W+"));
        System.out.println(words);

    }
}/*output:
[10, 2018, 9, A, B, C, Collections, Created, D, E, F, G, H, HashSet, I, J, K, L, M, N, Set, SetOperations, String, System, X, Y, Z, add, addAll, added, args, by, class, contains, containsAll, false, from, holding, import, in, java, main, new, on, out, output, package, println, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void, weixiao]
*/
