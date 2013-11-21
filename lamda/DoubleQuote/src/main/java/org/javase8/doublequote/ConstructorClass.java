
package org.javase8.doublequote;

/**
 *
 * @author Masudul Haque
 */
interface ConstructorReference<T> {
    T constructor();
}

interface  MethodReference {
   void anotherMethod(String input);
}

public class ConstructorClass {
    String value;

   public ConstructorClass() {
       value = "default";
   }

   public static void method(String input) {
      System.out.println(input);
   }

   public void nextMethod(String input) {
   // operations
   }

   public static void main(String... args) {
   // constructor reference
       ConstructorReference reference = ConstructorClass::new;
//       ConstructorClass cc =  reference.constructor();

       // static method reference 
//       MethodReference mr = cc::method;

       // object method reference
//       MethodReference mr2 = cc::nextMethod;

//       System.out.println(cc.value);
       }
}