package classes;

public class CustomerManager {
	public void Add() {
		System.out.println("müşteri eklendi");
	}
	
	public void Remove() {
		System.out.println("müşteri silindi");
	}
	
	public void Update() {
		System.out.println("müşteri güncellendi");
	}
	
	public static void main(String[] args) {
		CustomerManager customerManager ;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
	    
		//diziler referans tiptir //stack bellekteki adres değişir 
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);

		

		
		

	}

}
