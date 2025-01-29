package shabby;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bill=new Scanner(System.in);
		
		System.out.println("enter the cus num:");
		
		int cn=bill.nextInt();
		
		System.out.println("enter cus name:");
		
		String cname=bill.next();
		
		System.out.println("previous month reading:");
		
		double pmr=bill.nextDouble();
		
		System.out.println("final current reading:");
		
		double fcr=bill.nextDouble();
		
		double billdifference=fcr-pmr;
		
		System.out.println("bill:"+billdifference);
		
		if(billdifference>=100 && billdifference<=200) {
			
			System.out.println("enter data 'c' of commercial"+ "enter data 'd' of domastic");
			
			char input=bill.next().charAt(0);
			
			switch(input) {
			
			case 'c':
				double commercial=billdifference*4.5;
				
				System.out.println("customer num"+ cn);
				
				System.out.println("customer name"+ cname);
				
				System.out.println("bill"+ commercial);
				
				System.out.println("the bill is commercial:");
				
				break;
				
			case 'd':
				double domastic=billdifference*2.5;
				
                System.out.println("customer num"+ cn);
				
				System.out.println("customer name"+ cname);
				
				System.out.println("bill"+ domastic);
				
				System.out.println("the bill is domastic:");
				
				break;
			}}
			
			
			else if(billdifference>=201 && billdifference<=500) {
				
				System.out.println("enter the 'c' of commercial"+ "enter the 'd' of domastic");
				
				char input=bill.next().charAt(0);
				
				switch (input) {
				
				case 'c':
				
				double commercial=billdifference*6;
				
                System.out.println("customer num"+ cn);
				
				System.out.println("customer name"+ cname);
				
				System.out.println("bill"+ commercial);
				
				System.out.println("the bill is commercial:");
				
				break;
			
				case 'd':
		
					double domastic=billdifference*5;
					
	                System.out.println("customer num"+ cn);
					
					System.out.println("customer name"+ cname);
					
					System.out.println("bill"+ domastic);
					
					System.out.println("the bill is domastic:");
					
					break;
					
				}}
				
				else {
					
					System.out.println("enter the 'c' of commercial"+ "enter the 'd' of domastic");
					
					char input=bill.next().charAt(0);
					
					switch (input) {
					
					case 'c':
						
						double commercial=billdifference*8;
						
		                System.out.println("customer num"+ cn);
						
						System.out.println("customer name"+ cname);
						
						System.out.println("bill"+ commercial);
						
						System.out.println("the bill is commercial:");
						
						break;
						
					case 'd':
						
						double domastic=billdifference*9;
						
		                System.out.println("customer num"+ cn);
						
						System.out.println("customer name"+ cname);
						
						System.out.println("bill"+ domastic);
						
						System.out.println("the bill is domastic:");
						
						break;
				}
		
		
		
		
		
				}	
		
		
	}			 
		
	}

