interface Cricketer {
    String Name="Shane Watson";
    int Age=29;
    String  Nationality="Australia";
    default void Print()
    {
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("Nationality:"+Nationality);
    }
}
