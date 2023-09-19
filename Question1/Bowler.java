interface Bowler extends Cricketer{
     int Wickets=100;
     int BowlerRanking=3;

    @Override
    default void Print() {
        System.out.println("Bowler Wickets: " + Wickets);
        System.out.println("Bowling Rank: " + getRanking());
    }

    default int getRanking() {
        return BowlerRanking;
    }
}
