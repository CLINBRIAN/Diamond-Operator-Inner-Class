/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.innerclassdiamondoperator;

/**
 *
 * @author kamau
 */
abstract class Handler<T> {
   public T content;

   public Handler(T content) {
      this.content = content; 
   }
   
   abstract void handle();
}
public class InnerClassDiamondOperator {

    public static void main(String[] args) {
         // create an Anonymous class to handle 1
	  // Here we do not need to pass Type arguments in diamond operator 
	  // as Java 9 compiler can infer the type automatically
      Handler<Integer> intHandler = new Handler<>(1) {
         @Override
         public void handle() {
            System.out.println(content);
         }
      };
      intHandler.handle();
      Handler<? extends Number> intHandler1 = new Handler<>(2) {
         @Override
         public void handle() {
            System.out.println(content);
         }
      };
      intHandler1.handle();
      Handler<?> handler = new Handler<>("test") {
         @Override
         public void handle() {
            System.out.println(content);
         }
      };

      handler.handle();    
   }  
    }
