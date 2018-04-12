public class MainClass {
  public static void main(String[] args) {

    CreditCard testCard = new CreditCard("43589795");

    if (testCard.isValid()) {
      System.out.println("Credit card is valid!");
    } else {
      System.out.println("Credit card is not valid.");
    }

  }
}
