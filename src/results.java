
public class results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ballottingUnit BU1 =new ballottingUnit("Pratisti","Independent",false);
		ballottingUnit BU2 =new ballottingUnit("Pratap","BJP",false);
		ballottingUnit BU3 =new ballottingUnit("Pratima","Congress",false);
		
		controlUnit CU1 =new controlUnit(BU1);
		controlUnit CU2 =new controlUnit(BU2);
		controlUnit CU3 =new controlUnit(BU3);
		
		
		System.out.println("Voter name: "+BU1.VoterName);
		System.out.print(BU1.VoterName);
		BU1.voted();
		BU1.Status=true;
		System.out.println("Voted for: "+BU1.VoteGiven);
		System.out.println("---------------------");
		
		System.out.println("Voter name: "+BU1.VoterName);
		System.out.print(BU1.VoterName);
		BU1.voted();
		System.out.println("Voted for: "+BU1.VoteGiven);
		System.out.println("---------------------");
		
		System.out.println("Voter name: "+BU2.VoterName);
		System.out.print(BU2.VoterName);
		BU2.voted();
		BU2.Status=true;
		System.out.println("Voted for: "+BU2.VoteGiven);
		System.out.println("---------------------");
		
		System.out.println("Voter name: "+BU3.VoterName);
		System.out.print(BU3.VoterName);
		BU3.voted();
		BU3.Status=true;
		System.out.println("Voted for: "+BU3.VoteGiven);
		System.out.println("---------------------");
		
		CU1.TotalResult();
		CU2.TotalResult();
		CU3.TotalResult();
		

	}

}
