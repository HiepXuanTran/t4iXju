import java.util.Random;
import java.util.Scanner;

public class Taixiu{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tiendat;
		System.out.println("Nhập số tiền nạp: ...k");
		int Von = sc.nextInt();
		sc.nextLine();
		do {
		System.out.println("Đặt tài hay xỉu? ");
		String dat = sc.nextLine();
		do {
		System.out.println("Đặt số tiền: ...k");
		 tiendat=sc.nextInt();sc.nextLine();
		}while(tiendat>Von);
		Random rd= new Random();
		int rd1 = rd.nextInt(6)+1;
		int rd2 = rd.nextInt(6)+1;
		int rd3 = rd.nextInt(6)+1;
		System.out.println(rd1);
		System.out.println(rd2);
		System.out.println(rd3);
		int kq = rd1+rd2+rd3;
		String value="";
		if(kq<10) {
			value= "Xiu";
		}
		else {
			value="Tai";
		}
		System.out.print("Kết quả : "+value+" ");
		if(dat.equalsIgnoreCase(value)==true) {
			Von = Von + tiendat*98/100;
			System.out.println("+"+(tiendat*98/100));
		}
		else {
			Von = Von - tiendat;
			System.out.println("-"+tiendat);
		}
		
		System.out.println("Tiền bạn có: "+Von);
		}while(Von!=0);
		System.out.println("Hết tiền thì cút!!");
	}
}
