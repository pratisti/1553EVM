
public class ballottingUnit {

	String VoterName;
	String VoteGiven;
	boolean Status;
	
	public ballottingUnit(String votername,String votegiven, boolean status)
	{
		this.VoterName=votername;
		this.VoteGiven=votegiven;
		this.Status=status;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}



	public String getVoterName() {
		return VoterName;
	}

	public void setVoterName(String voterName) {
		VoterName = voterName;
	}

	public String getVoteGiven() {
		return VoteGiven;
	}

	public void setVoteGiven(String voteGiven) {
		VoteGiven = voteGiven;
	}
	
	void voted()
	{
		if(this.Status==true)
		{
			System.out.println(" voter has already voted. Cant vote again");
		}
		else
		{
			System.out.println(" voter has not voted. Allow to vote");
		}
	}
}
