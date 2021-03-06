//Andrea Shulman
//ACSL String
//February 5, 2016


public class StringFunc
{
   double num;
   int len, dec, decimalPoint;
   String newNum, placeHold, sign;
   
   public StringFunc(String str)
   {
      manip(str);
      newNum="";
      round();
      placeHold=""+num;
      decimalPoint= placeHold.indexOf(".");
      String decimals=((num+"").substring((num+"").indexOf(".")));
      String nums=placeHold.substring(0,decimalPoint);
      int difference=decimals.length()-dec-1;
      while (difference<0){
         decimals+="0";
         difference++;
      } 
      newNum=nums+decimals;
      //now it's rounded so now we gotta check the length
      lenChange();
      System.out.println(newNum);
   }
   
   public void manip(String str)
   {
      if(str.substring(0,1).equals("+"))
      {
         str=str.substring(1);
         sign="+";
      }
      else
         sign="";
      num=Double.parseDouble(str.substring(0,str.indexOf(",")));
      str=str.substring(str.indexOf(",")+1);
      len=Integer.parseInt(str.substring(0,str.indexOf(",")));
      str=str.substring(str.indexOf(",")+1);
      dec=Integer.parseInt(str);
   }
   
   public void round()
   {
      double numb= Math.pow(10,dec);
      num=Math.round(num * numb) / numb;
   }
   
   public void lenChange()
   {
      
      String wait= sign+newNum;
      int length=wait.length();
      int diff= len-length;
      if(diff>0)
      {     
          while(diff>0)
          { 
              newNum="#"+newNum;
              diff--;
          }
      }
      else if(diff<0)
      {
         int pounds=len-1;
         newNum="";
         while(pounds>0)
         {
            newNum+="#";
            pounds--;
         }
         newNum=newNum.substring(0,newNum.length()-dec)+"."+newNum.substring(newNum.length()-dec);
      }
      else
         newNum=wait;
   }
   
   public static void main(String[]args)
   {
      /*StringFunc test1= new StringFunc("523.125,6,2");
      StringFunc test2=new StringFunc("+523.125,6,1");
      StringFunc test3=new StringFunc("-523.163,6,1");
      StringFunc test4=new StringFunc("523.125,4,2");
      StringFunc test5=new StringFunc("-523.12,6,1");*/
      StringFunc test1= new StringFunc("14.967,6,2");
      StringFunc test2=new StringFunc("671.23,7,2");
      StringFunc test3=new StringFunc("-25.4958,5,1");
      StringFunc test4=new StringFunc("259.24,4,1");
      StringFunc test5=new StringFunc("-129.997,7,2");
   }
}