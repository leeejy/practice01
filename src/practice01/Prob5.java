package practice01;

public class Prob5 {

	public static void main(String[] args) {

//		숫자로 할 때
//		for(int i=1;i<100;i++){
//			if( (i%10==3 || i%10 ==6 || i%10==9) && ((i>=30 && i<40) || (i>=60 && i<70) ||(i>=90 && i<100)) )
//					System.out.println(i+"는 짝짝");
//			else if((i%10==3 || i%10 ==6 || i%10==9) || ((i>=30 && i<40) || (i>=60 && i<70) ||(i>=90 && i<100)) )
//				System.out.println(i+"는 짝");
//			else ;
		
		
		

/*		문자로 할 때String, valueof*/
		for (int i = 1; i < 100; i++) {
			String count = String.format("%02d", i);// String count =
													// String.valueOf(i);

			for (int j = 0; j < count.length(); j++) {
				if (count.charAt(j) == '3' || count.charAt(j) == '6' || count.charAt(j) == '9') {
					System.out.print("\n" + i + ": ");
					break;
				}

			}
			if (count.charAt(1) == '3' || count.charAt(1) == '6' || count.charAt(1) == '9')
				System.out.print("짝");

			if (count.charAt(0) == '3' || count.charAt(0) == '6' || count.charAt(0) == '9')
				System.out.print("짝");

		}

	}
}
