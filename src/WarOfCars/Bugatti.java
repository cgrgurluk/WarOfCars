package WarOfCars;



public class Bugatti extends Cars {
	
	private int MaxSpeed;
	private String Different;
	
	public Bugatti(String carsModel, int enginePower, int price,int MaxSpeed,String Different) {
		super(carsModel, enginePower, price);
		// TODO Auto-generated constructor stub
		this.MaxSpeed=MaxSpeed;
		this.Different=Different;
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
		System.out.println(getCarsModel()+" için "+MaxSpeed+" en yüksek hızıdır");
		System.out.println(getCarsModel()+" için  "+Different+" özelliği vardır");
	}
	

	
	

}