package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by weixiao on 2018/10/10.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src/holding/SetOperations.java","\\W+"));
        System.out.println(words);

    }/*output:
    [10, 2018, 9, A, add, addAll, added, args, B, by, C, class, Collections, contains, containsAll, Created, D, E, F, false, from, G, H, HashSet, holding, I, import, in, J, java, K, L, M, main, N, new, on, out, output, package, println, public, remove, removeAll, removed, Set, set1, set2, SetOperations, split, static, String, System, to, true, util, void, weixiao, X, Y, Z]
    */
}
