package src2;
public class LinearSearch{
    public static int linearsearch(int[] vector, int value) {
        int i;
        for (i = 0; i < vector.length; i++) {
            if (vector[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static LoopInvariant[] getLoopInvariants() {
        LoopInvariant[] loopInvariants = new LoopInvariant[1];
        loopInvariants[0] = new LoopInvariant("i", "0", "i < vector.length", "i++");
        return loopInvariants;
    }
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int index = linearsearch(vector, key);
        if (index == - 1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}


