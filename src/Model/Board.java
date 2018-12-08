package Model;

import java.util.ArrayList;

/**
 * Title: HW6 Date: 12/7/2018
 *
 * @author sphein; oouk
 */
public class Board {

    private ArrayList<City> cities;
    private ArrayList<Route> routes;

    /**
     * constructor
     */
    public Board() {
        cities = new ArrayList();
        routes = new ArrayList();
    }

    /**
     * add all city to list
     * @param c1
     * @param c2
     * @param c3
     * @param c4
     * @param c5
     * @param c6
     */
    public void initializeBoard(City c1, City c2, City c3, City c4, City c5, City c6) {
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);
        cities.add(c5);
        cities.add(c6);
    }

    /**
     * add all routes to list
     * @param r1
     * @param r2
     * @param r3
     * @param r4
     * @param r5
     * @param r6
     * @param r7
     */
    public void addroutes(Route r1, Route r2, Route r3, Route r4, Route r5, Route r6, Route r7) {
        routes.add(r1);
        routes.add(r2);
        routes.add(r3);
        routes.add(r4);
        routes.add(r5);
        routes.add(r6);
        routes.add(r7);
    }

    /**
     * retrieve city and returns
     * @return
     */
    public ArrayList<City> getCities() {
        return this.cities;
    }

    /**
     * retrieve route and returns
     * @return
     */
    public ArrayList<Route> getRoutes() {
        return this.routes;
    }

}
