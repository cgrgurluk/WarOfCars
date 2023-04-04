package WarOfCars;


public class Mercedes extends Cars{
	
	 private int MaxSpeed;
	 private String Different;

	public Mercedes(String carsModel, int enginePower, int price,int MaxSpeed,String Different) {
		super(carsModel, enginePower, price);
		this.MaxSpeed=MaxSpeed;
		this.Different=Different;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AutoDrive() {
		// TODO Auto-generated method stub
		System.out.println("bu arabada otonom sürüş vardır");
	}

	@Override
	public void ShowInfos() {
		// TODO Auto-generated method stub
		super.ShowInfos();
		System.out.println(getCarsModel()+" için "+MaxSpeed+" en yüksek hızıdır");
		System.out.println(getCarsModel()+" için "+Different+" özelliği var");
	}
	

}
