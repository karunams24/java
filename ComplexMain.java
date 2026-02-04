import java.util.Scanner;
class Complex{
double real,img;
//default constructor
Complex(){
real=0;
img=0;}
//parameterized constructor
Complex(double r,double i){
real=r;
img=i;}
//add method
Complex add(Complex c2){
Complex result=new Complex();
result.real=real+c2.real;
result.img=img+c2.img;
return result;
}
//subtract method
Complex subtract(Complex c2){
Complex result=new Complex();
result.real=real-c2.real;
result.img=img-c2.img;
return result;}
//multiply
Complex multiply(Complex c2){
Complex result=new Complex();
result.real=(real*c2.real)-(img*c2.img);
result.img=(real*c2.img)+(img*c2.real);
return result;}
//display
void display(){
System.out.println(real+ "+" +img+"i");}}
public class ComplexMain{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
//input first number
System.out.println("Enter real and imaginary part of first number:");
double r1=sc.nextDouble();
double i1=sc.nextDouble();
Complex c1=new Complex(r1,i1);
//input second number
System.out.println("Enter real and imaginary part of second number:");
double r2=sc.nextDouble();
double i2=sc.nextDouble();
Complex c2=new Complex(r2,i2);
System.out.println("\n___Results___");
//perform operations
Complex sum=c1.add(c2);
Complex diff=c1.subtract(c2);
Complex prod=c1.multiply(c2);
//display
System.out.print("sum:      ");
sum.display();
System.out.print("difference:       ");
diff.display();
System.out.print("product:");
prod.display();
}}
