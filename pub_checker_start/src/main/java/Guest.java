public class Guest {

    private String name;
    private int age;
    private int wallet;
    private int sobriety;

    private String pubStatus;

    private char currency;

    private String favDrink;


    public Guest(String name, int age, int wallet, int sobriety, String pubStatus, char currency, String favDrink) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.pubStatus = pubStatus;
        this.currency = currency;
        this.favDrink = favDrink;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getWallet(){
        return this.wallet;
    }
    public int getSobriety(){
        return this.sobriety;
    }
    public String getPubStatus(){
        return this.pubStatus;
    }

    public char getCurrency(){
        return this.currency;
    }
    public String getFavDrink(){
        return this.favDrink;
    }
}
