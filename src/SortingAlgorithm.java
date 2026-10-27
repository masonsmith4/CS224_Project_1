public class SortingAlgorithm {
    // Method 1: Swap
    public void swap (List<Employee> employeeList, int index1, int index2){
        Employee temp=employeeList.get[index1];
        employeeList.set(index1, employeeList.get(index2));
        employeeList.set(index2, temp);
    }//Close swap

    public void bubbleSort(int [] A){
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                }//end if
            } //end inner for
        }//end outside for loop
    }//end bubbleSort method

}
