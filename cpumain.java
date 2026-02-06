import java.util.Scanner;

class CPU {
double price;

class Processor {
int noofcores;
String manufacturer;
}

static class RAM {
int memory;
String manufacturer;
}
}

public class cpumain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

CPU cpu = new CPU();
System.out.println("Enter CPU price:");
cpu.price = sc.nextDouble();
sc.nextLine();

CPU.Processor p = cpu.new Processor();
System.out.println("Enter number of cores:");
p.noofcores = sc.nextInt();
sc.nextLine();

System.out.println("Enter processor manufacturer:");
p.manufacturer = sc.nextLine();

CPU.RAM r = new CPU.RAM();
System.out.println("Enter RAM memory:");
r.memory = sc.nextInt();
sc.nextLine();

System.out.println("Enter RAM manufacturer:");
r.manufacturer = sc.nextLine();

System.out.println("\n--- CPU DETAILS ---");
System.out.println("Price: " + cpu.price);
System.out.println("Processor Cores: " + p.noofcores);
System.out.println("Processor Manufacturer: " + p.manufacturer);
System.out.println("RAM Memory: " + r.memory);
System.out.println("RAM Manufacturer: " + r.manufacturer);

}
}

