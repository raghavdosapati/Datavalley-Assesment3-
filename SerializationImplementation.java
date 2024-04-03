import java.io.Serializable;  
public class Customer implements Serializable{  
 int id;  
 String name;
 String address;
 public Student(int id, String name,String address) {  
  this.id = id;  
  this.name = name;
  this.address=address;
 }  
}    
class Persist{    
 public static void main(String args[]){    
  try{    
      
    Customer c1 =new Customer(211,"ravi","Hyderbad");     //Creating the object 
      
    FileOutputStream fout=new FileOutputStream("f.txt");    //Creating stream and writing the object
    ObjectOutputStream out=new ObjectOutputStream(fout);    
    out.writeObject(c1);    
    out.flush();    
    out.close();    //closing the stream
    System.out.println("success");    
  }
  catch(Exception e)
  {
    System.out.println(e);
  }    
 }    
}
