package hw1;
    //• 請設計一隻Java程式,計算12,6這兩個數值的和與積
public class hw1 {
  public static void main(String [] args) {
    int num1 = 12, num2=6;
    System.out.println(num1 + num2);
    System.out.println(num1 * num2);
    System.out.println("===============");
    
    //• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
    int num3 = 200, num4= 12;
    int dozen = num3 / num4 , rdozen = num3 % num4;
    System.out.println("200顆是"+dozen+"打,餘量"+rdozen+"顆");
    System.out.println("===============");
    
    //• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
    int num5 = 256559 ,  hour = 24 , minutes = 60 , second = 60;
    int daysc = hour * minutes * second, hoursc = minutes * second;
    int rhour = num5 % daysc, rminutes = rhour % hoursc, rsecond = rminutes % second;
    System.out.println("256550秒為"+(num5/daysc)+"天"+(rhour/hoursc)+"小時"+(rminutes/second)+"分"+rsecond+"秒"); 
    System.out.println("===============");
    
    //• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
    final double pi = 3.1415;
    int r = 5 ;
    String s1 = "圓面積" ; //公式：半徑×半徑×圓周率
    String s2 = "圓周長" ; //公式：半徑x2x圓周率
    System.out.println(s1+(r*r*pi));
    System.out.println(s2+(r*2*pi));
    System.out.println("===============");
    
    //• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
        //公式：期末本利和＝期初本金×（1＋利率）期數次方
     int yfund = 1500000 , a = 10 ;  //a為次方
     double rate = 1.02 ;
     System.out.println(yfund*Math.pow(rate,a));
     System.out.println("===============");
     
    //• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
     // 說明：5 + 5
     // 解釋：System.out.println(5 + 5)，此為整數型別(int)，兩者相加之和為數值10。
     
     // 說明：5 + ‘5’
     // 解釋：System.out.println(5 + ‘5’)，此為整數型別(int)的數值5與字元型別(char)5，
     //     依據Unicode編碼char5代表十六進位值為0x35，兩者相加之和為數值58。
      
     // 說明：5 + “5”
     // 解釋：System.out.println(5 + “5”)，此為整數型別(int)的數值5+字元型別(String)的字串5，整數與字串相加為串接相連，所得結果為字串55
  //並請用註解各別說明答案的產生原因

  }

}

  
   