package deneme;

import java.util.Scanner;

public class denemesinifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner(System.in);
		
		double sayi1, sayi2, sayi3, kok1, kok2, dlt ; 
		
		System.out.println("1.Sayý:");
		sayi1= giris.nextDouble();
		System.out.println("2.Sayý:");
		sayi2= giris.nextDouble();
		System.out.println("3.Sayý:");
		sayi3= giris.nextDouble();
		
		dlt= (sayi2*sayi2)-4*sayi1*sayi3;
		
		if(dlt>0) {
			kok1= (-sayi2+dlt) / 2*sayi1;
			kok2= (-sayi2-dlt) / 2*sayi1;
			System.out.println("Denklemin Kökleri: "+ kok1 +" ve "+ kok2);
			
		}
		else if (dlt==0) {
			kok1= -sayi2/2*sayi1;
			System.out.println("Ýki Eþit Kökü Vardýr:"+ kok1);
		}
		else {
			System.out.println("Reel Kök Yok.");
		}
	}

}
