class Main{
     public static void main(String[] args) {
          System.out.println("Hola");
          Car car = new Car("AMQ123", new Account("Andres", "AND123"));
          car.passenger = 4;
          car.printDataCar();
     }
}