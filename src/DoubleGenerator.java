import java.util.ArrayList;

public class DoubleGenerator extends Generator{
  
 private Bracket bracket;
 
 DoubleGenerator(ArrayList<Team> teams) {
   //Team [][] winnerBracker = new Team[bracket.getNumberOfTeams()][bracket.getNumberOfTeams()];
 }

 @Override
 Bracket getBracket() {
  return new DoubleBracket();
 }


}
