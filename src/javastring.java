import java.util.Scanner;
public class javastring {
		public static void main(String[] args) {
//				String name ="rishab";
//				String age = new String ("rishab");
//				if (name .equals(age) ){
//						System.out.println("both are same ");
//
//				}else{
//						System.out.println("both are not same ");
//				}


//      String name = "rishab";
//			String word = new String ("rishab");
//			if( name .equals(word)){
//					System.out.println("both are same"+"  "+ name + " "+ word );
//			}
//     Scanner sc = new Scanner ( System .in );
//				System.out.println("welcome");
//				System.out.println("enter your first name ");
//				String firstname = sc.nextLine();
//				greet();
//				System.out.println(" enter your last name ");                    // how to use scanner in string learn( string last name =sc .nextLine()) fotr inputrishab
//				String lastname = sc. nextLine();
//				System.out.println(" thank you ");
//				System.out.println("your full name "+ firstname +"  "+ lastname );
//		}
//		public static void greet (){
//				System.out.println("thankyou");        // in this use also method



			//	String s2 = new String ("Rusi");




				String s  = "Rusi";              // Stored in SCP
				String s1 = "Rusi";              // Reuses same SCP object

				String s2 = new String("Rusi");  // New heap object
				String s3 = new String("Rusi");  // New heap object

				String s4 = "Ru" + "si";         // Compile time → goes to SCP → same as s & s1
				String s5 = ("Ru" + "si");       // Still compile time → reuses SCP

				String s6 = s + "";              // Runtime concat → new heap object
				String s7 = s.concat("");        // New heap object

				System.out.println(System.identityHashCode(s));

				System.out.println(System.identityHashCode(s2));
				System.out.println(System.identityHashCode(s3));
				System.out.println(System.identityHashCode(s4));

		}

	}
