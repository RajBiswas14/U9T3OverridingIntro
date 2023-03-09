public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric,); //isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }


  public boolean chargeAndDropOffRiders(double farePerRider){
    int numberOfRiders = getPassengers() - 1;
    double totFare = numberOfRiders * farePerRider;
    fareCollected +=totFare;
    boolean dropOffGood = dropOffPassengers(numberOfRiders);
    return dropOffGood;

  }

  public void printInfo(){
    super.printInfo();
    System.out.println();
  }

  public void Horn(){
    super.Horn();
    System.out.print("Get In");
  }
}