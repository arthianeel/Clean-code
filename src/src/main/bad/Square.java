package src.main.bad;

public class Square extends Rectangle{
    public void setHeight(int h) {            //violates liskov substitution principle
        this.height = h;
        this.width= h;
    }
    DIP obj=new DIP();           //violates DIP since any change in dip will have to be changed in square1

    public void setWeight(int w ){
        this.width = w;
        this.height = w;
    }
}
