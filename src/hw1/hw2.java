package hw1;

public class hw2 {
	public static void main( String[] args ) {
   //請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	int sum = 0 ;
	for (int count = 2; count <= 1000; count++) {
        if (count % 2 == 0)
        	sum += count;
        }
	    System.out.println("1~1000的偶數和="+sum);
	    System.out.println("=====================");
	
	//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)  
	 int sum1 = 1 ;
	 for (int count = 1 ; count <= 10 ; count++) {
		 sum1 *= count;
		 System.out.println("1~10的連乘積="+sum1);
         }
	     System.out.println("=====================");
	     
	 //請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)  
	  int sum2 = 1 , count = 1;
	  while (count <= 10) {
		  sum2 *= count;
		  count++;
		  System.out.println("1~10的連乘積="+sum2);
	    }
	      System.out.println("=====================");
	      
	 //請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
	   int x , y = 1;
	   for (x = 1 ; y < 100; x++) {
		   y=(int)Math.pow(x,2);
		   System.out.println(y + "");
		// System.out.println();
	   }
	       System.out.println("=====================");
	       
	  //阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	       int j = 0 , k=10;  
	   	for (int i=1;i <= 49;i++) {
	   		if(i % k == 4) {
	   	}
	   		else if (i / k == 4) {
	   	}
	   		else {
	   			System.out.print(i + " ");
	   			j++;
	       }	
	   	}
	   		 System.out.println();
	   		 System.out.println("共" + j + "個號碼");
	   		 System.out.println("=====================");

	   	// 請設計一隻Java程式,輸出結果為以下:  技巧(外層：y;內層:x)
	   	 //1 2 3 4 5 6 7 8 9 10
	   	 //1 2 3 4 5 6 7 8 9
	   	 //1 2 3 4 5 6 7 8
	     //1 2 3 4 5 6 7
   	     //1 2 3 4 5 6
	   	 //1 2 3 4 5
	   	 //1 2 3 4
	   	 //1 2 3
	   	 //1 2
	   	 //1
	   	   for (int m =10 ; m >= 1 ; m--) {
	   		   for(int n = 1 ; n <= m; n++) {
	   			   System.out.print(n+"*");
	   		   }
	   		   System.out.println();
	   	   }
	   		 System.out.println("=====================");	
	   		 
	   	 // 請設計一隻Java程式,輸出結果為以下:
	   	  //A
	   	  //BB
	   	  //CCC
	   	  //DDDD
	   	  //EEEEE
	   	  //FFFFFF
	   	   char a = 'A';
	   	   for (int o = 0 ; o < 6 ; o++ ) {
	   		   for(int p = 0; p <= o;p++) {
	   		   System.out.print((char)(a+o)); 
	   		   }
	   		   System.out.println();
	   	   }	   	            
	     //請建立一個TestNineNine.java程式，可輸出九九乘法表
	      // 一：使用for迴圈+ while迴圈
	   	   
	   	   
	   	   
	      // 二：使用for迴圈+ do while迴圈
	   	   
	   	   
	   	   
	      // 三：使用while迴圈+ do while迴圈
	   	   
	   	   
	}
	
}

	
