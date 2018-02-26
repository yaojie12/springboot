package com.edu.spring.test;

class Son extends Father {
	Son() {
		System.out.println("son");
	}; // 输出father 和 son
}

// class Son extends Father{
// Son(){super();System.out.println("son");}; // 输出father 和 son
// }
//
// class Son extends Father{
// Son(){super(36);System.out.println("son");}; // 输出father is 36 和 son
// }