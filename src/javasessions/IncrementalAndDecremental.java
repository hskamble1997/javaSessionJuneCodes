package javasessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		int m=1;
		int n=m++;
		
		System.out.println(m);
		System.out.println(n);
		
		int p=-89;
		int q=p++;
		System.out.println(p);
		System.out.println(q);
		
		int t=0;
		int r=t++;
		System.out.println(t);
		System.out.println(r);
		
		int k=-999;
		int g=k++;
		System.out.println(k);
		System.out.println(g);
		
		int total=1;
		System.out.println(total++);
		System.out.println(total);
		
		int b=1;
		int v=++b;
		System.out.println(b);
		System.out.println(v);
		
		int tt=-89;
		int rr= ++tt;
		System.out.println(tt);
		System.out.println(rr);
		
		int pop = 100;
		System.out.println(++pop);
		System.out.println(pop);
		
		int d=2;
		int f=d--;
		System.out.println(d);
		System.out.println(f);
		
		int y=-99;
		int z=y--;
		System.out.println(y);
		System.out.println(z);
		
		int food=-89;
		System.out.println(food--);
		System.out.println(food);
		
		int e=2;
		int u=--e;
		System.out.println(e);
		System.out.println(u);
		
		int test=-989;
		int testing = --test;
		System.out.println(test);
		System.out.println(testing);
		
		int google =-1000;
		System.out.println(--google);
		System.out.println(google);
		System.out.println(google++);
		System.out.println(google);
		
		int bal=500;
		int totalBal = bal+++10;
		System.out.println(totalBal);
		System.out.println(bal);
		System.out.println(totalBal);
		
		int le=2;
		//int re = le++ +le++ -le++;//2+3-
		int te=++le +le++ -le++;
		System.out.println(te);
		
		int t1=-100;
		int t2= t1+++20;
		System.out.println(t2);
		
		
		
		
	}

}
