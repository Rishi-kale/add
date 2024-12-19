public class a{
  public void p(){
  System.out.print("it's parent class");
}
}
public class b extends a{
public void q(){
 System.out.print("it's parent class");
}

}

class Main(){

public static void main(String[] args){
     b obj= new b();
   obj.p();
}



-------------------------------------------
public interface abc{
   void m1();

} 
public interface efg{
   void m1();

} 

public class hij implements abc, efg{
void m1(){
   System.out.print("it method of abc interface")
}
void m1(){
   System.out.print("it method of efg interface")
}

}

public class thirdclass extends hij{
    
}

class Main(){

public static void main(String[] args){
     thirdclass obj= new thirdclass();
      obj.m1();
}

String s="hello"
Map<Character, Long> m= s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(function.identity(),Collectors.counting());