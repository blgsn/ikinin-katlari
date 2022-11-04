import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int k;
		Scanner input=new Scanner(System.in);
		System.out.print("Sınır sayısını giriniz:");
		k=input.nextInt();
		for(int i=1; i<=k;i*=2) {
				System.out.println(i);
		}
}}