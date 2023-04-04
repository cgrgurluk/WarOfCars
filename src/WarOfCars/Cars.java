package WarOfCars;

public class Cars {
	private String CarsModel;
	private int EnginePower;
	private int Price;
	public Cars(String carsModel, int enginePower, int price) {
		super();
		CarsModel = carsModel;
	
		EnginePower = enginePower;
		Price = price;
	}
	public String getCarsModel() {
		return CarsModel;
	}
	public void setCarsModel(String carsModel) {
		CarsModel = carsModel;
	}
	
	public int getEnginePower() {
		return EnginePower;
	}
	public void setEnginePower(int enginePower) {
		EnginePower = enginePower;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public void AutoDrive() {
		System.out.println("bu arabada otonom sürüş bulunmuyor");
	}
	public void ShowInfos() {
		System.out.println("arabanın modeli:"+CarsModel);
		System.out.println("arabanın motor gücü :"+EnginePower+" HP");
		System.out.println("arabanın değeri :"+Price+"TL");
	}

}
