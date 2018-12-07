package Model;

import java.util.ArrayList;

/**
 * Title: HW4 Date: 10/17/2018
 *
 * @author sphein; oouk
 */
public class Board {

    private ArrayList<City> cities;
    private ArrayList<Route> routes;

    public Board() {
        cities = new ArrayList();
        routes = new ArrayList();
    }

    public void initializeBoard(City c1, City c2, City c3, City c4, City c5, City c6) {
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);
        cities.add(c5);
        cities.add(c6);
    }

    public void addroutes(Route r1, Route r2, Route r3, Route r4, Route r5, Route r6, Route r7) {
        routes.add(r1);
        routes.add(r2);
        routes.add(r3);
        routes.add(r4);
        routes.add(r5);
        routes.add(r6);
        routes.add(r7);
    }

    public ArrayList<City> getCities() {
        return this.cities;
    }

    public ArrayList<Route> getRoutes() {
        return this.routes;
    }

}
