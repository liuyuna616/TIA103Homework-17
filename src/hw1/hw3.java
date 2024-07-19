package hw1;

import java.util.Scanner;

public class hw3 {	
    //請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
	  public static void main (String[] args) {
		int[] x = new int [3];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三邊長：");
		if (sc.hasNextInt()) {
			x[0]=sc.nextInt();
			x[1]=sc.nextInt();
			x[2]=sc.nextInt();		
		}
		if (x[0] *x[1] *x[2] !=0) {
			if (x[0] == x[1] && x[1] == x[2]) {
				System.out.println("正三角形");
				}
			else if (x[0] == x[1] || x[1]==x[2]) {
				System.out.println("等腰三角形");
				}
			else if (Math.pow(x[0],2) == (Math.pow(x[1],2) + Math.pow(x[2],2)) 
					|| Math.pow(x[1],2) == (Math.pow(x[0],2) + Math.pow(x[2],2)) 
					|| Math.pow(x[2],2) == (Math.pow(x[1],2) + Math.pow(x[0],2))) {
				System.out.println("直角三角形");
				}
			else if (x[0] + x[1] > x[2] && x[1]+x[2]>x[0] && x[0] + x[2] > x[1])
			{System.out.println("其他三角形");}
			else {System.out.println("不是三角形");}	
		}
		else {System.out.println("不是三角形");}	
	
	//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
	    int y ;
	    y = (int) (Math.random() *10);
		
		Scanner ra = new Scanner(System.in);
		System.out.println("開始猜數字吧(範圍=0~9)：");
		for (int m=0; m!=y;) {
			if (ra.hasNextInt()) {
			m = ra.nextInt();	
			} else {System.out.println("請輸入整數！");
			break;}
			if (m == y) {
			System.out.println("答對了！答案就是"+y);
			break;}
			else {System.out.println("猜錯囉！");}	
		}
		
		System.out.println("=================================");
      
	  //進階題目： (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		 
		int y100;
		y100 = (int) ((Math.random() *101));
		Scanner ra1 = new Scanner(System.in);
		System.out.println("開始猜數字吧(範圍=0~100)：");
		for (int n = 0 ; n!=y100 ; ) {
			if (ra1.hasNextInt()) {
				n= ra1.nextInt();
				} else {System.out.println("請輸入整數！");
				break;}
				if (n > y100) {
				System.out.println("猜低一點！");
				}
				else if (n < y100) {
				System.out.println("猜高一點！");
				}
				else if (n == y100) {
				System.out.println("答對了！答案就是"+y100);
				break;}  
		}
		  
	//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇	的號碼與總數,如圖:
	
		Scanner no= new Scanner(System.in);
		int a = no.nextInt();
		int num = 0 ;
		
		System.out.println("可選擇的數字：");
		for(int i = 1 ; i <= 49 ; i++) {
			if(!((i >= 10 && i/10 == a) || i % 10 == a)) {
				System.out.print(i+"\t");
				num++;				
				}		
			if((i % 10 == 0)) {
				System.out.println();
			}
		}	
		 System.out.println();
		 System.out.println("共有 "+ num +" 個數字可選擇");
	
 }	
}


