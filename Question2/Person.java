public abstract class Person {
    public int AdharId;
    public String Name;
    public String Address;
    public int Phone;
    public String Profession;

    Person(int AdharID,String  Name,String Address,int Phone,String Profession)
    {
        this.AdharId=AdharID;
        this.Name=Name;
        this.Address=Address;
        this.Phone=Phone;
        this.Profession=Profession;
    }
    public String Register(String UID)
    {
        System.out.println("register");
        return "Register";
    }
    public String Perform(String duty)
    {
        System.out.println("register");
        return "Perform duty";
    }
    public String Include(String service)
    {
        System.out.println("Include");
        return "Include";
    }
    public String Like(String item)
    {
        System.out.println("Like");
        return "Like";
    }
    public void displayInfo()
    {
        System.out.println("-------PERSON DISPLAYINFO--------------");
        System.out.println("AdharID:"+AdharId);
        System.out.println("Name:"+Name);
        System.out.println("Address:"+Address);
        System.out.println("Phone:"+Phone);
        System.out.println("Profession:"+Profession);
    }


}
