package SharpenSkills.rank4;

/**
 * Created by a.shipulin on 04.09.18.
 */
public class Counter {


    /* CONSTRUCTORS:
     *   - the 4 regular constructors inherited from HashMap
     *   - Counter(T[] arr)
     *   - Counter(Collection<T> coll)
     *   - Counter(Stream<T> stream)
     */



    /* STATIC BUILDERS:
     *     Counter.of(array), for all the primitive types:
     *          boolean[], byte[], char[], double[],
     *          float[],   int[],  long[], short[]
     *     Counter.of(String s), counting each letter as a String object.
     */



    /* OBSERVERS
     *
     *    Overrides needed:
     *      - toString:  being consistent with the requirements of the parent class
     *      - get:       providing the default value for non existing keys
     *
     *    New methods:
     *      - elements()            return a Stream with the elements duplicated according to their count
     *                              (keys are peeked in any order, but output all identical values together)
     *      - elementsAsList()      Same, but as list
     *
     *      - mostCommon()          Output a Stream of Map.Entry<T,Long> of the most common items (random order for equal counts)
     *      - mostCommon(n)         Same, but output only the n first entries
     *      - mostCommonAsList()
     *      - mostCommonAsList(n)
     */



    /* MUTATORS
     *
     *  Non static versions:
     *    push(key)                         Add 1 to that key
     *    push(key, n)                      Add n to that key
     *
     *    pushAll(Collection<T> coll)       Add (and not "replace"!) all the contents of the array, map,...
     *    pushAll(T[] arr)                  to the current instance.
     *    pushAll(Stream<T> stream)
     *    pushAll(Map<T,Long> other)
     *
     *  Static versions:
     *    pushAll (Counter<Boolean>   cnt, boolean[] arr)
     *    pushAll (Counter<Byte>      cnt, byte[]    arr)
     *    pushAll (Counter<Character> cnt, char[]    arr)
     *    pushAll (Counter<Double>    cnt, double[]  arr)
     *    pushAll (Counter<Float>     cnt, float[]   arr)
     *    pushAll (Counter<Integer>   cnt, int[]     arr)
     *    pushAll (Counter<Long>      cnt, long[]    arr)
     *    pushAll (Counter<Short>     cnt, short[]   arr)
     *    pushAll (Counter<String>    cnt, String    s  )
     */



    /* MATHS OPERATIONS
     *  All these methods deliver a fresh Counter instance, where non positive values are suppressed.
     *  'a' and 'b' being Counter instances:
     *      a.add(b)            add all the counts together
     *      a.sub(b)            subtract counts of b from a.
     *      a.intersect(b)      keep the minimum
     *      a.union(b)          keep the max
     *
     *  Variations: those two will keep non positive values:
     *      a.subtract(b)       sub, but with non positive
     *      a.mul(n)            multiply all the values. WARNING: mutation, for this one.
     *      */

}
