import java.util.*;

public class VotingMachine {
    private int noOfLabourVotes, noOfConservativeVotes;

    public VotingMachine(){
        this.noOfConservativeVotes = 0;
        this.noOfLabourVotes = 0;
    }

    public void clearMachine(){
        this.noOfConservativeVotes = 0;
        this.noOfLabourVotes = 0;
    }

    public void voteLabour(){
        Random random = new Random();
        this.noOfLabourVotes += random.nextInt(20);
    }

    public void voteConservative(){
        this.noOfConservativeVotes ++;
    }

    public int getNoOfLabourVotes(){
        return this.noOfLabourVotes;
    }

    public int getNoOfConservativeVotes() {
        return noOfConservativeVotes;
    }

}
