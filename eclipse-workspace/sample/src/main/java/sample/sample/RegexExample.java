package sample.sample;

import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String args[]){  
		System.out.println("metacharacters d...."); 
		  
		System.out.println(Pattern.matches("\\d", "abc"));  
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d*", "4443")); 
		System.out.println(Pattern.matches("\\d*\\D*\\w*", "323abc@"));  
		  
		System.out.println("metacharacters D....");
		  
		System.out.println(Pattern.matches("\\D", "abc")); 
		System.out.println(Pattern.matches("\\D", "1")); 
		System.out.println(Pattern.matches("\\D", "4443")); 
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println(Pattern.matches("\\D", "m")); 
		  
		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "mak")); 
		  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32")); 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2")); 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		
		System.out.println("by character classes and quantifiers ...");  
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949")); 
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949")); 
		  
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490")); 
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));  
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949")); 
		  
		System.out.println("by metacharacters ...");  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949")); 
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));  
		  
		}}  


