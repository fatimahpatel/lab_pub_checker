public class Guest {

    private String name;
    private int age;
    private int wallet;
    private int sobriety;

    private String pubStatus;


    public Guest(String name, int age, int wallet, int sobriety, String pubStatus) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.pubStatus = pubStatus;
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
}
