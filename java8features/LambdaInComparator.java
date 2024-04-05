package java8features;

import java.util.ArrayList;
import java.util.Collections;

import Collection.Person;

	class Product {
		int productId;
		String productName;
		float productPrice;
		public Product(int productId, String productName, float productPrice) {
			super();
			this.productId =productId;
			this.productName=productName;
			this.productPrice=productPrice;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Product [productId="+productId+",productName="+productName+",productPrice="+productPrice+"]";
		}
	}

	public class LambdaInComparator{
		public static void main(String[] args) {
			ArrayList<Product> list=new ArrayList<>();
			list.add(new Product(101,"Mouasepad",1200));
			list.add(new Product(102,"Laptop",60000));
			list.add(new Product(103,"Keyboard",2400));
			list.add(new Product(104,"Speakers",3000));
			list.add(new Product(105,"Pendrive",1300));
			list.add(new Product(106,"Printer",5000));
			
			Collections.sort(list,(p1,p2)->{
				return p1.productName.compareTo(p2.productName);
			});
			
			list.forEach(p->System.out.println(p));
			System.out.println();
				
		    Collections.sort(list,(p1,p2)->{
			if (p1.productPrice == p2.productPrice) {
				return 0;
			}
			if (p1.productPrice > p2.productPrice) {
				return 1;
			} else {
				return -1;
			}
		    });	   
		    list.forEach(p->System.out.println(p));

	}
	}
		    


	
