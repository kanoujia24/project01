package package1;




public class numericPrctice {
	public static void main(String[] args) {
		String s = "dtyghfjks";
		boolean flag=false;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ) {
				flag=true;
				break;
				
			}
		}
		if(flag==true) {
			System.out.println("vowel is present");
		}
		else {
			System.out.println("vowel not present");
		}
	}
	}