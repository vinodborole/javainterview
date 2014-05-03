/**
 * 
 */
package geeks.in.action.corejava.collections;

/**
 * @author VINOD
 *
 */
public class SingleLoopSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int Ary[] = { 3, 7, 2, 5, 1, 8, 4, 0, 9, 6 };
        singleLoopSort(Ary, 10);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(Ary[i] + " ");
        }
    }

    private static void singleLoopSort(int[] Ary, int size) {
        for (int i = 0; i < size;) {
            if (Ary[i] != i) {
                int t = Ary[Ary[i]];
                Ary[Ary[i]] = Ary[i];
                Ary[i] = t;
                System.out.println(Ary[i] + " " + Ary[Ary[i]]);
            } else {
                i++;
            }
        }
    }

}
