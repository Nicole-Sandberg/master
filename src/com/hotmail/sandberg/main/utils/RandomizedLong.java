package com.hotmail.sandberg.main.utils;

 public class RandomizedLong {

     public static long generatingRandomLongBounded() {
         long leftLimit = 1L;
         long rightLimit = 10L;
         return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
     }
}
