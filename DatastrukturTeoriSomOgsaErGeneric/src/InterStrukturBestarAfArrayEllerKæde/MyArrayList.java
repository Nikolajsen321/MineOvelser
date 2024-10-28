//public class MyArrayList<E> implements MyList<E>{
//
//  public static final int INITIAL_CAPACITY = 16;
//  private E[] data = (E[])new Object[INITIAL_CAPACITY];
//  private int size = 0; // Number of elements in the list
//
//         /** Create an empty list */
//         public MyArrayList() {
//             }
//
//         /** Create a list from an array of objects */
//
//
//
//
//     public MyArrayList(E[] objects) {
//         for (int i = 0; i < objects.length; i++) {
//             add(objects[i]); // Warning: don't use super(objects)!
//         }
//         }
//
//         @Override /** Add a new element at the specified index */
// public void add(int index, E e) {
//         // Ensure the index is in the right range
//         if (index < 0 || index > size) {
//             throw new IndexOutOfBoundsException
//                     ("Index: " + index + ", Size: " + size);
//         }
//         ensureCapacity();
//         // Move the elements to the right after the specified index
//         for(int i = size − 1; i >= index; i--){
//                 data[i + 1] = data[i];
//             }
//         // Insert new element to data[index]
//         data[index] = e;
//
//         // Increase size by 1
//         size++;
//         }
//
//         /** Create a new larger array, double the current size + 1 */
//        37 private void ensureCapacity() {
//        38 if (size >= data.length) {
//            39 E[] newData = (E[])(new Object[size * 2 + 1]);
//            40 System.arraycopy(data, 0, newData, 0, size);
//            41 data = newData;
//            42 }
//        43 }
//44
//        45 @Override /** Clear the list */
//46 public void clear() {
//        47 data = (E[])new Object[INITIAL_CAPACITY];
//        48 size = 0;
//        49 }
//50
//        51 @Override /** Return true if this list contains the element */
//52 public boolean contains(Object e) {
//        53 for (int i = 0; i < size; i++)
//            54 if (e.equals(data[i])) return true;
//        55
//        56 return false;
//        57 }
//58
//        59 @Override /** Return the element at the specified index */
//60 public E get(int index) {
//        61 checkIndex(index);
//        62 return data[index];
//        63 }
//64
//        65 private void checkIndex(int index) {
//        66 if (index < 0 || index >= size)
//            67 throw new IndexOutOfBoundsException
//        68 ("Index: " + index + ", Size: " + size);
//        69 }
//70
//    constructor
//            add
//    ensureCapacity
//    double capacity + 1
//    clear
//            contains
//    get
//            checkIndex
//24.3 Array Lists 953
//            71 @Override /** Return the index of the first matching element
//     72 * in this list. Return −1 if no match. */
//73 public int indexOf(Object e) {
//        74 for (int i = 0; i < size; i++)
//            75 if (e.equals(data[i])) return i;
//        76
//        77 return −1;
//        78 }
//79
//        80 @Override /** Return the index of the last matching element
//     81 * in this list. Return −1 if no match. */
//82 public int lastIndexOf(E e) {
//        83 for (int i = size − 1; i >= 0; i−−)
//        84 if (e.equals(data[i])) return i;
//        85
//        86 return −1;
//        87 }
//88
//        89 @Override /** Remove the element at the specified position
//     90 * in this list. Shift any subsequent elements to the left.
//     91 * Return the element that was removed from the list. */
//92 public E remove(int index) {
//        93 checkIndex(index);
//        94
//        95 E e = data[index];
//        96
//        97 // Shift data to the left
//        98 for (int j = index; j < size − 1; j++)
//        99 data[j] = data[j + 1];
//        100
//        101 data[size − 1] = null; // This element is now null
//        102
//        103 // Decrement size
//        104 size−−;
//        105
//        106 return e;
//        107 }
//108
//        109 @Override /** Replace the element at the specified position
//     110 * in this list with the specified element. */
//111 public E set(int index, E e) {
//        112 checkIndex(index);
//        113 E old = data[index];
//        114 data[index] = e;
//        115 return old;
//        116 }
//117
//        118 @Override
//119 public String toString() {
//        120 StringBuilder result = new StringBuilder("[");
//        121
//        122 for (int i = 0; i < size; i++) {
//            123 result.append(data[i]);
//            124 if (i < size − 1) result.append(", ");
//            125 }
//        126
//        127 return result.toString() + "]";
//        128 }
//129
//        130 /** Trims the capacity to current size */
//
//
//
//
//
//
//
//
//
//
//
//
//
//    131 public void trimToSize() {
//        132 if (size != data.length) {
//            133 E[] newData = (E[])(new Object[size]);
//            134 System.arraycopy(data, 0, newData, 0, size);
//            135 data = newData;
//            136 } // If size == capacity, no need to trim
//        137 }
//138
//        139 @Override /** Override iterator() defined in Iterable */
//140 public java.util.Iterator<E> iterator() {
//        141 return new ArrayListIterator();
//        142 }
//143
//        144 private class ArrayListIterator
//145 implements java.util.Iterator<E> {
//        146 private int current = 0; // Current index
//        147
//        148 @Override
//        149 public boolean hasNext() {
//            150 return current < size;
//            151 }
//        152
//        153 @Override
//        154 public E next() {
//            155 return data[current++];
//            156 }
//        157
//        158 @Override // Remove the element returned by the last next()
//        159 public void remove() {
//            160 if (current == 0) // next() has not been called yet
//                161 throw new IllegalStateException();
//            162 MyArrayList.this.remove(−−current);
//            163 }
//        164 }
//165
//        166 @Override /** Return the number of elements in this list */
//167 public int size() {
//        168 return size;
//        169 }
// }
//
