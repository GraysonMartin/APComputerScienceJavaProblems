import java.util.Random;
import java.util.ArrayList;

public class DataSet {
  ArrayList<Integer> numbers = new ArrayList<Integer>();

  Random random = new Random();

  public DataSet() {
    while (numbers.size() < 20) {
      int randomNumber = random.nextInt(6) + 1;
      numbers.add(randomNumber);
    }
  }

  public String getResults() {
    String str = "";
    Boolean inRun = false;

    for (int i = 0; i < numbers.size(); i++) {
      if (inRun) {
        if (!numbers.get(i).equals(numbers.get(i - 1))) {
            str += ") ";
            inRun = false;
          }
      } else {
        if ((i + 1) < numbers.size()) {
          if (numbers.get(i) == numbers.get(i + 1)) {
          	str += "( ";
          	inRun = true;
          }
        }
      }
      str += numbers.get(i) + " ";
    }
    if (inRun) {
      str += ")";
    }
    return str;
  }
}
