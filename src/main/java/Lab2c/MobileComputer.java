package Lab2c;

public class MobileComputer extends Computer{
    private int battery;
    public MobileComputer(){
        secret = "MobileComputer secret";
        battery = 5;

    }
    @Override
    public void work(){
        if (battery > 0){
            System.out.println("It is working on my lap.");
            battery--;
        }
        else System.out.println("Running out of battery");
    }
    public void change(){
        if (battery < 10) battery++;
    }
}
