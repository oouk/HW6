package Model;

import java.util.ArrayList;

/**
 * Title: HW6 
 * Date: 12/7/2018
 * @author sphein; oouk
 */
public class City {
    private String name;
    private ArrayList<Route> list;
    
    /**
     * constructor
     * @param n
     */
    public City(String n){
        this.name = n;
        this.list = new ArrayList();
    }
    
    /**
     * add route to city list
     * @param r
     */
    public void addRoute(Route r){
        this.list.add(r);
    }

    /**
     * retrieve list of route
     * @return
     */
    public ArrayList<Route> getRoute(){
        return this.list;
    }

    /**
     * retrieve name of city
     * @return
     */
    public String getName(){
        return this.name;
    }
}


