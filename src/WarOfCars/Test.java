package WarOfCars;

import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		
		System.out.println("araç savaşlarına hoşgeldiniz");
		System.out.println("çıkış için q ya basın");
		Scanner scan=new Scanner(System.in);
		while(true) {
			
			System.out.println("hangi arabayı üretmek istiyorsunuz?");
			String test=scan.nextLine();
			if(test.equals("q")) {
				System.out.println("programdan çıkılıyor...");
				break;
			}
			else {
				ProductCar Product= new ProductCar();
				Cars car=Product.MakeIt(test);
				if(car==null) {
					System.out.println("lütfen geçerli bir marka girin");
					
				}
				else {
					car.ShowInfos();
					car.AutoDrive();
					car.getPrice();
				}
			}
			
		}
	}
}