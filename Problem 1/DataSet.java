import java.util.Random;
import java.util.ArrayList;

public class DataSet {
  ArrayList<Integer> numbers = new ArrayList<Integer>();

  Random random = new Random();

  public DataSet() {
    while (numbers.size() <= 100) {
      int randomNumber = random.nextInt(1000 + 1);
      numbers.add(randomNumber);
    }
  }

  public int max() {
    int maxNum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) > maxNum) {
        maxNum = numbers.get(i);
      }
    }
    return maxNum;
  }

  public double average() {
    double total = 0;
    for (int i = 0; i < numbers.size(); i++) {
      total += numbers.get(i);
    }
    return total / numbers.size();
  }

  public String toString() {
    String all = "";
    for (int i = 0; i < numbers.size(); i++) {
      if (i == (numbers.size() - 1)) {
      	all += numbers.get(i);
      } else {
        all += numbers.get(i) + ", ";
      }
    }
    return all;
  }
}
