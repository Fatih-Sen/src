package deneme;

import java.util.Scanner;

public class denemesinifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner(System.in);
		
		double sayi1, sayi2, sayi3, kok1, kok2, dlt ; 
		
		System.out.println("1.Say�:");
		sayi1= giris.nextDouble();
		System.out.println("2.Say�:");
		sayi2= giris.nextDouble();
		System.out.println("3.Say�:");
		sayi3= giris.nextDouble();
		
		dlt= (sayi2*sayi2)-4*sayi1*sayi3;
		
		if(dlt>0) {
			kok1= (-sayi2+dlt) / 2*sayi1;
			kok2= (-sayi2-dlt) / 2*sayi1;
			System.out.println("Denklemin K�kleri: "+ kok1 +" ve "+ kok2);
			
		}
		else if (dlt==0) {
			kok1= -sayi2/2*sayi1;
			System.out.println("�ki E�it K�k� Vard�r:"+ kok1);
		}
		else {
			System.out.println("Reel K�k Yok.");
		}
	}

}
