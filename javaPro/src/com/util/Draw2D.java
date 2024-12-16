package com.util;

public class Draw2D {

   // overloading 오버로딩 == 중복함수
   // drawLine() 메서드 선언 부분
   public static void drawLine(){
      System.out.println("---------------"); // 선 긋기, 100줄
   }

   // drawLine() 메서드 선언 부분
   public static void drawLine(int length){
      for (int i = 1; i <= length; i++) {
         System.out.print("-");
      }
      System.out.println(); // 선 긋기, 100줄
   }

   // drawLine() 메서드 선언 부분
   public static void drawLine(char style, int length){
      for (int i = 1; i <= length; i++) {
         System.out.print(style);
      }
      System.out.println(); // 선 긋기, 100줄
   }

}
