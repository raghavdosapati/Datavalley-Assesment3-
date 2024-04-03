class Customer{  
 synchronized void print(int n)      //synchronized
 {         
   for(int i=1;i<=5;i++)
   {  
     System.out.println(n*i);  
     try
     {  
      Thread.sleep(200);  
     }
     catch(Exception e)
    {
      System.out.println(e);
    }  
  } 
 }  
}  
  
class MyThread1 extends Thread{  
Customer c;  
MyThread1(Customer c){  
this.c=c;  
}  
public void run(){  
c.print(9);  
}  
  
}  
class MyThread2 extends Thread{  
Customer c;  
MyThread2(Customer c){  
this.c=c;  
}  
public void run(){  
c.print(5);  
}  
}  
  
public class TestSynchronization2{  
public static void main(String args[]){  
Customer obj = new Customer();      //only one object  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
}  
