package com.dummy;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;

class Toto extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException { entryPoint(0,"Hello"); }			
	static void XentryPoint (int a, String b) {	System.out.println("Hello world");	step(a, b);	}
	static void entryPoint (int a, String b) { System.out.println("Hello world"); step(a, b); }
	static void Xstep (int a, String b)	{ System.out.println("Step Reached"); endPoint(a, b); }
	static void step (int a, String b)	{ System.out.println("Step Reached"); endPoint(a, b); }
	static void XendPoint(int a, String b) { System.println("At last");	System.out.println("a is " + a + " whereas b is " + b);	}
	static void endPoint(int a, String b) { 	System.println("At last");System.out.println("a is " + a + " whereas b is " + b);}
}

class Dummy extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException { entryPoint(0,"Hello"); }			
	static void XentryPoint (int a, String b) {	System.out.println("Hello world");	step(a, b);	}
	static void entryPoint (int a, String b) { System.out.println("Hello world"); step(a, b); }
	static void Xstep (int a, String b)	{ System.out.println("Step Reached"); endPoint(a, b); }
	static void step (int a, String b)	{ System.out.println("Step Reached"); endPoint(a, b); }
	static void XendPoint(int a, String b) { System.println("At last");	System.out.println("a is " + a + " whereas b is " + b);	}
	static void endPoint(int a, String b) { 	System.println("At last");System.out.println("a is " + a + " whereas b is " + b);}
}