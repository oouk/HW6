package Model;

/**
 * Title: HW6
 * Date: 11/28/2018
 * @author sphein; oouk
 */
public class Route implements Comparable<Route>{
    private String color;
    private int number;
    private int claimed;
    private String outputName;
    private String routeOrder;
    private String claimedBy;

    
    public Route(String c, int n, String r){
        this.color = c;
        this.number = n;
        this.claimed = 0;
        this.routeOrder = r;
        this.outputName = this.color + "(" + this.number + ")" + " " + this.routeOrder;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return this.color;
    }
    public void setNumber(int n){
        this.number = n;
    }
    public int getNumber(){
        return this.number;
    }
    public int getClaimed(){
        return this.claimed;
    }
    public void setClaimed(){
        this.claimed = 1;
    }
    public void resetClaimed(){
        this.claimed = 0;
    }

    @Override
    public int compareTo(Route o) {
        if(this.color.equals(o.getColor()))
            return 1;
        return 0;
    }
    @Override
    public String toString(){
        return this.outputName;
    }
    public String getrouteOrder(){
        return this.routeOrder;
    }
    public void setClaimedBy(String n){
        this.claimedBy = n;
    }
    public String getClaimedBy(){
        return this.claimedBy;
    }
}
