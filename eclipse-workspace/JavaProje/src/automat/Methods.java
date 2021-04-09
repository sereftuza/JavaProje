package automat;

import java.util.Scanner;

public class Methods {
	
	
	public double money() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac dollar yatirmak istersiniz");
		double money = scan.nextDouble();
		
		scan.close();
		return money;
				
	}
	
	
	public double select(Products product) {
		
		System.out.println(product.toString());
		Scanner scan = new Scanner(System.in);
	
		do {
			
			System.out.println("Lutfen almak istediginiz numarasini giriniz(1 den 10 a kadar)");
			System.out.println("Cikis icin '0' a basin");
			product.setProductNum(scan.nextInt());
			if (product.getProductNum()<0 || product.getProductNum()>10) {
				System.out.println("Gecerli bir product numarasi giriniz (1 den 10 a kadar)");
			}
		} while (product.getProductNum()<0 || product.getProductNum()>10);
	
		
		switch(product.getProductNum()) {
		case 0 :
			System.out.println("Tesekkur eder tekrer bekleriz.");
			break;
		case 1 :
			product.setPrice(product.getSnicker());
			break;
		case 2 :
			product.setPrice(product.getChipsAhoy());
			break;
		case 3 :
			product.setPrice(product.getPringles());
			break;
		case 4 :
			product.setPrice(product.getMilano());
			break;
		case 5 :
			product.setPrice(product.getReeses());
			break;
		case 6 :
			product.setPrice(product.getCocaCola());
			break;
		case 7 :
			product.setPrice(product.getFanta());
			break;
		case 8 :
			product.setPrice(product.getWater());
			break;
		case 9:
			product.setPrice(product.getArizona());
			break;
		case 10 :
			product.setPrice(product.getSkittles());
			break;
				
		}
			
		scan.close();
		return product.getPrice();
	}
	
	public double balance(double price, double money, Products product) {
		
		while (money<price) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Bakiye yetersiz, para eklemek istermisiniz . (Y/N)");
			char onay= scan.next().toUpperCase().charAt(0);
			if (onay=='N') {
				System.out.println("Bakiyeniz + " + money);
				System.out.println("Tesekur eder tekrar  bekleriz");
			}else if (onay=='Y') {
				System.out.println("Ne kadar eklemek istersiniz?");
				double eklenecek = scan.nextDouble();
				money+=eklenecek;
				System.out.println("Hesabimizda " + money + " dollar var ");
				price =select(product);
						
			}else {
				System.out.println("Lutfen 'Y' veya 'N' seciniz... ");
			}
			scan.close();
		}
		
		return money;
	}
	
	public void purchase(double price, double money, Products product) {
		while (money>=price) {
			money-=price;
			System.out.println("Hesabinizda " + money + " dollar var");
		}
	}
	
	
	
}
