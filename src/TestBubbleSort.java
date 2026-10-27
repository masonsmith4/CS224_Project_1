public class TestBubbleSort {
    static void main(String[] args) {
        SortingAlgorithm algo = new SortingAlgorithm();

        long start=System.nanoTime();

        algo.bubbleSort(empList);
        long end=System.nanoTime();

        System.out.println("\n");
        for (int i=0; i<5; i++){
            System.out.println(empList.get(i));
        }
        System.out.println("\n\n Running time bu using Bubble Sort is:"+(end-start)/1000000000.0+ " seconds");


    }
}
