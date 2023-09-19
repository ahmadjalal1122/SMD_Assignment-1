interface Batsmen extends Cricketer {
    int Score=3400;
    int BatsmenRanking=4;

    @Override
    default void Print() {
        Cricketer.super.Print();
        System.out.println("Batter Score: " + Score);
        System.out.println("Batting Rank: " + getRanking());
    }

    default int getRanking() {
        return BatsmenRanking;
    }

}
