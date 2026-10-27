import java.io.FileWriter;
import java.io.IOException;

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

public static void writeToFile(String outputDir, List<Employee> employeeList, String fileName){
    try {
        FileWriter fw = new FileWriter(outputDir + "/" + fileName);
        String header = "id, first_Name, last_Name, Age\n";
        fw.write(header);

        for (Employee record: employeeList) {
            String line = Integer.toString(record.getId()) + "," + record.getFirstName() + "," + record.getLastName() + "," + Integer.toString(record.getAge()) + "\n";
            fw.write(line);
        }
    }
    catch (IOException e) {
        System.out.println(e);
    }
}
