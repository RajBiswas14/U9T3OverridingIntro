public class Vehicle
{
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers)
  {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public void printInfo(){
    System.out.println("License Plate: " + licensePlate );
    System.out.println("Toll Fee: " + tollFee);
    System.out.println("Passengers: " + passengers);
  }

  public String getLicensePlate()
  {
    return licensePlate;
  }

  public double getTollFee()
  {
    return tollFee;
  }

  public void setTollFee(double newValue)
  {
    tollFee = newValue;
  }

  public int getPassengers()
  {
    return passengers;
  }

  public void setPassengers(int newValue)
  {
    passengers = newValue;
  }

  public double calculateTollPrice()
  {
    return tollFee * passengers;
  }

  public void Horn(){
    System.out.print("BEEP BEEP");
  }
}


