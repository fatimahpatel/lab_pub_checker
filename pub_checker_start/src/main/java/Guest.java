public class Guest {

    private String name;
    private int age;
    private int wallet;
    private int sobriety;


    public Guest(String name, int age, int wallet, int sobriety) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
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
}
