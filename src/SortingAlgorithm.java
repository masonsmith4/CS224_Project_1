public class SortingAlgorithm {
    // Method 1: Swap
    public void swap (List<Employee> employeeList, int index1, int index2){
        Employee temp=employeeList.get[index1];
        employeeList.set(index1, employeeList.get(index2));
        employeeList.set(index2, temp);
    }//Close swap

    public void bubbleSort(List<Employee> A){
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.size() - 1 - i; j++) {
                if (A.get(j).getAge() > A.get(j + 1).getAge()) {
                    swap(A, j, j + 1);
                }//end if
            } //end inner for
        }//end outside for loop
    }//end bubbleSort method

    void quickSort(List<Employee> employeeList, int lowIndex, int highIndex){
        if (lowIndex >= highIndex){
            return;
        }
        Employee pivot=employeeList.get[highIndex];
        int pivotIndex=partition(employeeList,lowIndex,highIndex,pivot);
        quickSort(employeeList,lowIndex, pivotIndex-1);
        quickSort(employeeList,pivotIndex+1, highIndex);
    } //Close quickSort
    int partition(Employee employeeList, int lowIndex, int highIndex, Employee pivot)
    {
        int leftPointer=lowIndex;
        int rightPointer=highIndex;
        while (leftPointer < rightPointer){//Outside loop
//Moving leftPointer to right
            while (employeeList.get[leftPointer].getAge() <=pivot.getAge() && leftPointer
                    < rightPointer){
                leftPointer++;
            }//leftPointer loop
//Moving rightPointer
            while (employeeList[rightPointer].getAge() >=pivot.getAge() && leftPointer
                    <rightPointer){
                rightPointer--;
            }//Close rightPointer loop
            swap(employeeList, leftPointer,rightPointer);
        }//Close outside loop
        swap(employeeList,leftPointer, highIndex);
        return leftPointer;
    } //Close partition
} // close class
