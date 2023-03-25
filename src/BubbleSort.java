public class BubbleSort {
    public String[] sort(String[] array, int length) {
        String temp;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] arr = { "one", "two", "three", "four", "five", "six", "seven", "eight" };
        BubbleSort bubbleSort=new  BubbleSort();
        String[] sortedArray = bubbleSort.sort(arr, arr.length);
        for (String s : sortedArray) {
            System.out.println(s);
        }
    }
}
