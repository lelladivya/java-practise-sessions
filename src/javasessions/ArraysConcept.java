package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		int i[] = new int[4];
		
			i[0] = 4;
			i[1] = 5;
			i[2] =6;
			i[3] =4;
			System.out.println(Arrays.toString(i));
//			System.out.println(i[0]);
//			System.out.println(i.length);
//			System.out.println(i.length-1);
//			System.out.println(i[0]+i[1]);
			for(int k=0;k<i.length;k++)
				System.out.println(k+":"+ i[k]);
			int count=0;
			for(int e:i) {
				System.out.println(count+":"+e);
			int p=0;
			while(p<i.length) {
				System.out.println(i[p]);
				p++;
			}
			}
			String s[]=new String[5];
			s[0]="Divya";
			//s[1]="Sravya";
			s[2]="Bavya";
			s[3]="Nitya";
			s[4]="Navya";
			//System.out.println(Arrays.toString(s));
			for(String e :s) {
				System.out.println(count+":"+e);
				count++;
			for(count=0;count < s.length;count++) {
				System.out.println(count+":"+s[count]);
				//if(s[count].equals(null))
				//	break;
				}
			}
			Object it[]=new Object [4];
			it[0]="Divya";
			it[1]=3.5;
			it[2]='a';
			it[3]=40;
			
			System.out.println(it[0]);
			System.out.println(it[1]);
			System.out.println(it[2]);
			System.out.println(it[3]);
			int a[]= {10,20,30,40};
			int b[]=new int[] {7,8,9,6};
			// Duplicate values are allowed in Arrays;
			int z[]= {10,20,30,10,20};
			System.out.println(Arrays.toString(z));
			z[0]=5;
			System.out.println(Arrays.toString(z));
	}
}
	
	
