public class RandomDataAnalyzer {

  public static void main(String[] args) {
	DataSet dataSet = new DataSet();

    System.out.println("All numbers: " + dataSet);
    System.out.println("Maximum is: " + dataSet.max());
    System.out.println("Average is: " + dataSet.average());
  }

}
