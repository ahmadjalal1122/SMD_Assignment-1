public class AllRounder implements Batsmen,Bowler {

    private int ranking;

    public AllRounder(int ranking) {
        this.ranking = ranking;
    }
    @Override
    public void Print() {
        System.out.println("\t\t--------------All Rounder's Info--------------");
        Batsmen.super.Print();
        Bowler.super.Print();
        System.out.println("AllRounder Rank: " + getRanking());
    }

    public int getRanking() {
        return ranking;
    }

}
