package com.edu.spring.test;



class B extends A
{
        public String show(B obj){
               return ("B and B");
        }
        public String show(A obj){
               return ("B and A");
        }
}
