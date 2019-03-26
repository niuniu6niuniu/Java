package testTeam01;
// Member Variable
public class Team {
	private String name;    // team name
	private int matchNum;   // matches
	private int win;        // wins 
	private int tie;        // ties 
	private int lose;       // loses 
	private int goal;       // goals
	private int loseGoal;   // goal loses
	private int goalDifference;   // goal differences   
	private int point;      // points
	
	// default constructor
	public Team() {
		
	}
	
	// Constructor
	public Team(String name,int matchNum,int win,int tie,int lose,int goal,int loseGoal) {
		// Use this to avoid parameters with the same name of member variables 
		this.name = name;
		this.matchNum = matchNum;
		this.win = win;
		this.tie = tie;
		this.lose = lose;
		this.goal = goal;
		this.loseGoal = loseGoal;
		// Method, this can be omitted
		calculateGoalDifference(goal,loseGoal);
		calculatePoint(win,tie,lose);
	}
	// Method calculate goal difference
	private void calculateGoalDifference(int goal,int loseGoal) {
		goalDifference = goal - loseGoal;
	}
	// Method calculate point
	private void calculatePoint(int win,int tie,int lose) {
		point = win * 3 + tie * 1 + lose * 0;
	}
	
	public static void main(String[] args) {
		// Laliga 28, 03-23-2019
		Team team1 = new Team("Barcelona",28,20,6,2,73,27);
		System.out.println(" Team: " + team1.name);
		System.out.println(" Matches: " + team1.matchNum);
		System.out.println(" Goal Differences: " + team1.goalDifference);
		System.out.println(" Points: " + team1.point);
		
		System.out.println();
		Team team2 = new Team("Atletico de Madrid",28,16,8,4,39,19);
		System.out.println(" Team: " + team2.name);
		System.out.println(" Matches: " + team2.matchNum);
		System.out.println(" Goal Differences: " + team2.goalDifference);
		System.out.println(" Points: " + team2.point);
		
		System.out.println();
		Team team3 = new Team("Real Madrid",28,17,3,8,49,32);
		System.out.println(" Team: " + team3.name);
		System.out.println(" Matches: " + team3.matchNum);
		System.out.println(" Goal Differences: " + team3.goalDifference);
		System.out.println(" Points: " + team3.point);
		
		System.out.println();
		Team team4 = new Team("Getafe",28,12,10,6,36,24);
		System.out.println(" Team: " + team4.name);
		System.out.println(" Matches: " + team4.matchNum);
		System.out.println(" Goal Differences: " + team4.goalDifference);
		System.out.println(" Points: " + team4.point);
	}	
}
