package WarOfCars;


public class Ferrari extends Cars{
	
	private int MaxSpeed;

	public Ferrari(String carsModel, String model, int enginePower, int price,int MaxSpeed) {
		super(carsModel, enginePower, price);
		this.MaxSpeed=MaxSpeed;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AutoDrive() {
		// TODO Auto-generated method stub
		super.AutoDrive();
		
	}

	@Override
	public void ShowInfos() {
		// TODO Auto-generated method stub
		super.ShowInfos();
		System.out.println(getCarsModel()+" için "+MaxSpeed+" Km/H hız ile sınırlıdır");
		
	}
	
	

}
