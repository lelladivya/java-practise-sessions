package javasessions;
import java.util.ArrayList;
public class ListArrayConcept {

	public static void main(String[] args) {
//		ArrayList ar=new ArrayList();
//		ar.add(10);
//		ar.add(10);
//		ar.add(10);
//		ar.add(10);
//		ar.add(10);
//		System.out.println(ar);
//		System.out.println(ar.size());
//		ar.add(5,80);
//		System.out.println(ar);
//		
//		ar.add(2,20);
//		System.out.println(ar);
//		System.out.println(ar.get(4));
//	ArrayList i=new ArrayList(2);
//	i.add(10);
//	i.add(20);
//	i.add(30);
//	i.add(40);
//	System.out.println(i);
//	ArrayList<Integer> a=new ArrayList<Integer>();
//	a.add(90);
//	a.add(80);
//	a.add(70);
//	a.add(60);
//	System.out.println(a);
//	for(Integer e:a) {
//	
//		System.out.println(e);
//	}
//	System.out.println("------");
//	for(int b=0;b<a.size();b++) {
//		 
//		//System.out.println(b+" "+a.get(b));
//			if (a.get(b)==80) {
//			System.out.println(b+" "+a.get(b));
//			
//		}
		ArrayList<Double> db=new ArrayList<Double>();
		db.add(45.0);
		db.add(50.98);
		db.add(16.77);
		db.add(1.3);
		ArrayList<Object> table = new ArrayList<Object>();
		table.add("name");
		table.add(15000);
		table.add(15.5);
		table.add('f');
		table.add(true);
		ArrayList<String> str=new ArrayList<String>();
		str.add("Divya");
		str.add("Navya");
		str.add("Bhavya");
		str.add("sravya");
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		number.add(5);
		
		System.out.println(number.size());
		System.out.println(number);
		for(Integer e: number) {
			System.out.println(e);
		}
		for(int i=0;i<number.size();i++) {
			System.out.println(i+" "+ number.get(i));
		}
		int i=0;
		while(i<number.size()) {
			System.out.println(number.get(i));
			i++;
		}
		System.out.println("---------------");
		
		System.out.println(str.size());
		System.out.println(str);
		for(String e:str) {
			System.out.println(e);
		}
		for(i=0; i<str.size();i++) {
			System.out.println(i+" "+str.get(i));
		}
		int k=0;
		while(k<str.size()) {
			System.out.println(k+" "+str.get(k));
			k++;
		}
		System.out.println("---------------");
		
		System.out.println(table.size());
		System.out.println(table);
		for (Object e:table) {
			System.out.println(e);
		}
		for(int p=0;p<table.size();p++) {
			//if(table.get(p)==15.5): for Object generic we cant use == as assignment operator:
			if(table.get(p).equals(15.5)) {
				System.out.println("index:"+p);
		}
		}		
		int p=0;
		while(p<table.size()) {
			System.out.println(p+" "+table.get(p));
			p++;
		}
		System.out.println("---------------");
		System.out.println(db.size());
		System.out.println(db);
		for(Double e:db) {
			System.out.println(e);
		}
		for(int q=0; q<db.size();q++) {
			System.out.println(q+" "+db.get(q));
		}
		
		int q=0;
		while(q<db.size()) {
			System.out.println(q+" "+db.get(q));
			q++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
			
	}
	
	
	
	
	
	
	
	
	
	
	

	}


