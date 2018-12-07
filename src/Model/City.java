package Model;



import java.util.ArrayList;

/**
 * Title: HW4
 * Date: 10/17/2018
 * @author sphein; oouk
 */
public class City {
    private String name;
    private ArrayList<Route> list;
    
    public City(String n){
        this.name = n;
        this.list = new ArrayList();
    }
    
    public void addRoute(Route r){
        this.list.add(r);
    }
    public ArrayList<Route> getRoute(){
        return this.list;
    }
    public String getName(){
        return this.name;
    }
}


