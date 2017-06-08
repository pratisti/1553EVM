
public class controlUnit {

	int BJPCount=0;
	int CongressCount=0;
	int IndependentCount=0;
	
	public ballottingUnit BU;
	
	public controlUnit(ballottingUnit BU)
	{
		this.BU=BU;

	}
	
	void TotalResult()
	{
		if(BU.VoteGiven=="BJP")
		{
			this.BJPCount++;
			System.out.println("BJP Count: "+this.BJPCount);
		}
		else if(BU.VoteGiven=="Congress")
		{
			this.CongressCount++;
			System.out.println("Congress Count: "+this.CongressCount);
		}
		else if(BU.VoteGiven=="Independent")
		{
			this.IndependentCount++;
			System.out.println("Independent Count: "+this.IndependentCount);
		}
		else
		{
			System.out.println("Not caste the vote");
		}
		
		
	}
	
	
	

}
