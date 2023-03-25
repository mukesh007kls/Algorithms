public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        String[] array = {"Delhi", "Mumbai", "Hyderabad", "Tripura", "Agartala",
                "Kolkata", "Assam"};

        String[] sortedArray =mergeSort.mergeSort(array);
        for (String s : sortedArray) {
            System.out.println(s + " ");
        }

    }

    public String[] mergeSort(String[] list) {
        String[] sorted;
        MergeSort mergeSort=new MergeSort();
        if (list.length == 1) {
            sorted = list;
        } else {
            int mid = list.length / 2;
            String[] left;
            String[] right;
            if ((list.length % 2) == 0) {
                left = new String[list.length / 2];
                right = new String[list.length / 2];
            } else {
                left = new String[list.length / 2];
                right = new String[(list.length / 2) + 1];
            }
            int x = 0;
            int y = 0;
            for (; x < mid; x++) {
                left[x] = list[x];
            }
            for (; x < list.length; x++) {
                right[y++] = list[x];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            sorted = mergeSort.mergeArray(left, right);
        }

        return sorted;
    }

    private String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else {
                    merged[mIndex++] = left[lIndex++];
                }
            }
        }
        return merged;
    }
}
