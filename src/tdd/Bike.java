package tdd;

public class Bike {

    private String name;
    private boolean isOn;


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void keyOn() {
        isOn = !isOn;
    }
    public boolean isOn(){
        return isOn;
    }
}
