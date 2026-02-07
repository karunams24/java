import java.util.Scanner;
public class sample{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
//user input string
System.out.println("Enter a string :");
String s1=new  String(sc.nextLine());
//display original string
System.out.println("Original string :"+s1);
//getting string length
System.out.println("Length of string :"+s1.length());
//string concatenation
System.out.println("Enter another string to concatenate :");
String s2=sc.nextLine();
String s3=s1.concat(" ").concat(s2);
System.out.println("Concatenated string :"+s3);
//charcter extraction
System.out.println("Enter index to extract character :");
int index=sc.nextInt();
if(index>=0&&index<s1.length()){
System.out.println("character at index"+index+":"+s1.charAt(index));
}
else{System.out.println("invalid index");}
sc.nextLine();
//string comparison(equal vs compareTo
String s4=sc.nextLine();
System.out.println("Using equals() :"+s1.equals(s4));
System.out.println("using compareTo() :"+s1.compareTo(s4));
//searching substring(indexOf)
System.out.println("Enter a substring to search :");
String sub=sc.nextLine();
System.out.println("Index of substring :"+s1.indexOf(sub));
//modify string (replace /to Uppercase)
System.out.println("Enter letter to replace :");
String oldword=sc.nextLine();
System.out.println("Enter new letter");
String newword=sc.nextLine();
System.out.println("After replace:"+s1.replace(oldword,newword));
System.out.println("Upper case string:"+s1.toUpperCase());
//data conversion using valueof
System.out.println("Enter an integer");
int num=sc.nextInt();
String numstr=String.valueOf(num);
System.out.println("String value of number :"+numstr);
sc.nextLine();
//string splitting using split()
System.out.println("Enter comma seperated string :");
String data=sc.nextLine();
String[] parts=data.split(",");
for(String part:parts){
System.out.println(part);
}
//mutable string using string buffer
StringBuffer sb=new StringBuffer(s1);
System.out.println("Enter string to append :");
String appendstr=sc.nextLine();
sb.append(appendstr);
System.out.println("String Buffer result :"+sb);
sc.close();
}
}

