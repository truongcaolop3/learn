package chap1;

public class learn3 {
	//switch 
	public static void main(String[] args) {
		int one = 4;
		switch (one) {
		case 2:
			System.out.println("thứ hai");
			break;
		case 3:
			System.out.println("thứ ba");
			break;
		case 4:
			System.out.println("thứ tư");
			break;
		case 5:
			System.out.println("thứ năm");
			break;
		case 6:
			System.out.println("thứ sáu");
			break;
		case 7:
			System.out.println("thứ bảy");
			break;
		default:
			System.out.println("chủ nhật");
			break;
		}
	}
	// dạng ngắn của else if 
	public static void main3(String[] args) {
		int one = 10;
		 String var1 = "dương";
		 String var2 = "chẵn";
		 
		 if ( one <0) var1 = "âm";
		 if ( one %2==0) var2 = "chẵn";
		 
		 System.out.println("nguyên " + var1 + " " + var2 );
		
	}
	public static void main2(String[] args) {
		int one = -2;
		String tes = "";
//		n>=0 n%2==0 => n nguyên dương chẵn
//		n>=0 n%2==1 => n nguyên dương lẻ 
//		n<0 n%2==0 => n nguyên âm chẵn
//		n<0 n%2==1 => n nguyên âm lẻ 
		if (one >=0 && one %2==0) {
			tes = "nguyên dương chẵn";
		}else if (one >=0 && one %2==1) {
			tes = "nguyên dương lẻ";
		}else if (one <0 && one %2==0) {
			tes = "nguyên âm chẵn";
		}else {
			tes = "nguyên âm lẻ";
		}
		System.out.println(tes);
		
	}
	//câu điều kiện if else else if
	public static void main1(String[] args) {
		int one = 13;

		if ( one %2 == 0 )
		{
			System.out.println("chẳn");
			
		}else 
			System.out.println("-----");
			System.out.println("lẻ");
		
	}
}
