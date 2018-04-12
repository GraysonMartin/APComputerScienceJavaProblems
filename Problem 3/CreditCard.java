import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;

public class CreditCard {

  ArrayList<String> individualNumbers = new ArrayList<String>();

  public CreditCard(String cardNumber) {
    individualNumbers = new ArrayList<String>(Arrays.asList(cardNumber.split("")));
  }

  public Boolean isValid() {
	int step1 = 0;
    for(int i = individualNumbers.size() - 1; i >= 0; i -= 2){
      step1 += Integer.parseInt(individualNumbers.get(i));
    }

    int step2 = 0;
    for(int i = individualNumbers.size() - 2; i >= 0; i -= 2){
      int bigNumber = 0;
      String number = Integer.toString(Integer.parseInt(individualNumbers.get(i)) * 2);
      ArrayList<String> singleNum = new ArrayList<String>(Arrays.asList(number.split("")));
      for (int j = 0; j < singleNum.size(); j++) {
        bigNumber += Integer.parseInt(singleNum.get(j));
      }
      step2 += bigNumber;
    }

    int step3 = step1 + step2;
    if (step3 % 10 == 0) {
      return true;
    } else {
      return false;
    }
  }

}
