package clases;

public class Match {

	int rounds;
	Bug bug1;
	Bug bug2;

	public Match(Bug bug1, Bug bug2){
		this(bug1, bug2, 5);
	}

	public Match(Bug bug1, Bug bug2, int rounds){
		this.rounds = rounds;
		this.bug1 = bug1;
		this.bug2 = bug2;
	}

	public void startMatch(int totalRounds){
		this.rounds = totalRounds;
	}

	public Bug checkWinner(){
		int bug1Health = bug1.getHealth();
		int bug2Health = bug2.getHealth();
		if(bug1Health > 0 && bug1Health > bug2Health){
			return bug1;
		}else if(bug2Health > 0 && bug2Health > bug1Health){
			return bug2;
		}
		return null;
	}

	public boolean nextRound(){
		boolean hasNext = false;
		this.rounds -= 1;
		if(Math.random() > 0.5){
			bug1.attack(bug2);
			hasNext = bug2.getHealth() > 0 && bug1.getHealth() > 0;
		}else{
			bug2.attack(bug1);
			hasNext = bug1.getHealth() > 0 && bug2.getHealth() > 0;
		}
		return this.rounds <= 0 ? false : hasNext;
	}

	public String getStats(){
		String bug1Stats = bug1.getName()+": "+bug1.getHealth();
		String bug2Stats = bug2.getName()+": "+bug2.getHealth();
		return "\t- " + bug1Stats +" \t- "+ bug2Stats;
	}

}