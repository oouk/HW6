package Model;

/**
 * Title: HW4
 * Date: 10/17/2018
 * @author sphein; oouk
 */
public class DestinationCards {
    private City City1;
    private City City2;
    private int points;
    
    public DestinationCards(City c1, City c2, int p){
        this.City1 = c1;
        this.City2 = c2;
        this.points = p;
    }
    public City getCity1(){
        return this.City1;
    }
        public City getCity2(){
        return this.City2;
    }
        public int getPoints(){
            return this.points;
        }
    @Override
    public String toString(){
        return this.City1.getName() + " to " + this.City2.getName() + " Points: " + this.points;
    }
}
