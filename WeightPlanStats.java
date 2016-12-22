import java.util.Scanner;

class WeightPlanStats {
		Scanner inputs = new Scanner(System.in);
	
		String BP = "Bench-Presses";
		String CU = "Curls";
		String SU = "Sit-Ups";
	
		int BPs;
		int CUs;
		int SUs;
		
		
		void setStats() {
	
			System.out.println("How many Bench-Presses did you complete today?: ");
			BPs = inputs.nextInt();
			
			System.out.println("How many Curls did you complete today?: ");
			CUs = inputs.nextInt();
		
			System.out.println("How many Sit-Ups did you complete today?: ");
			SUs = inputs.nextInt();
		
		}
	
		void showStats() {
			System.out.println(BP + BPs);
			System.out.println(CU + CUs);
			System.out.println(SU + SUs);
		
		}


}







