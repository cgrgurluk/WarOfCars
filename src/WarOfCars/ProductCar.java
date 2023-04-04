package WarOfCars;



public class ProductCar {
	public Cars MakeIt(String CarChoice) {
		
		if(CarChoice.equals("Ferrari")) {
			return new Ferrari("roma",CarChoice, 620,17500000,340);
		}
		else if(CarChoice.equals("Bugatti")) {
			return new Bugatti("veyron",630,17000000,428,"hız anahtarı");
		}
		else if(CarChoice.equals("Audi")) {
			return new Audi("A8",550,11000000,320,"air süspansiyon");
			
		}
		else if(CarChoice.equals("Mercedes")) {
			return new Mercedes("S600",570,120000000,280,"zırh");
		}
		else {
			return null;
		}
		
	}
	

}
