package Model;



import java.util.ArrayList;

/**
 * Title: HW4
 * Date: 10/17/2018
 * @author sphein; oouk 
 */
public class Player {
    private String name;
    private TrainTokens trains;
    private Integer numTrains;
    private ScoreMarker SM;
    private Integer pointsEarned;
    private ArrayList<DestinationCards> DC;
    private ArrayList<TrainCarCards> TC;
    
    /**
     * constructor 
     * @param n initialized to this.name
     * @param t initialized to this.trains
     */
    public Player(String n, TrainTokens t){
        this.name = n;
        this.trains = t;
        this.numTrains = 45;
        this.SM = new ScoreMarker();
        this.DC = new ArrayList();
        this.TC = new ArrayList();
        this.pointsEarned = 0;
    }
    
    /**
     * add Train Cards
     * @param c
     * @param c2
     */
    public void addTrainCarCards(TrainCarCards c, TrainCarCards c2){
        TC.add(c);
        TC.add(c2);
    }

    /**
     * add Destination Cards
     * @param a1
     * @param a2
     */
    public void addDestinationCards(DestinationCards a1, DestinationCards a2){
        DC.add(a1);
        DC.add(a2);
    }

    /**
     * adds Destination Card
     * @param a1
     */
    public void addDestinationCards(DestinationCards a1){
        DC.add(a1);
    }
    
    /**
     * adds Train Card
     * @param c
     */
    public void addTrainCarCards(TrainCarCards c)
    {
        TC.add(c);
    }
        
    /**
    * retrieves name
    * @return name
    */   
    public String getName(){
        return this.name;
    }
    
    /**
    * retrieves Train Card
    * @return TC
    */   
    public ArrayList<TrainCarCards> getTC(){
        return this.TC;
    }
      
    /**
     * converts pointsEarned from Integer to string
     * @return pointsEarned
     */
    public String getPoints() {
        String points = pointsEarned.toString();
        return points;
    }
    
    /**
    * retrieves numTrains
    * @return numTrains
    */
    public int getnumTrains(){
        return this.numTrains;
    }
    
    /**
     * converts numTrains from Integer to String
     * @return
     */
    public String getTrains() {
        return this.numTrains.toString();
    }
    
    /**
    * retrieves Score Marker
    * @return SM
    */
    public ScoreMarker getSM(){
        return this.SM;
    }
    
    /**
    * retrieves Destination Card
    * @return DC
    */   
    public ArrayList<DestinationCards> getDC(){
        return this.DC;
    }

    /**
     * calculates points earned based on value of route
     * @param r
     * @return
     */
    public int PointsThisRound(Route r){
        if(r.getNumber() == 2){
            this.pointsEarned = 2;
        }
        else if(r.getNumber() == 3){
            this.pointsEarned = 4;
        }
        else if(r.getNumber() == 4){
            this.pointsEarned = 7;
        }
        else if(r.getNumber() == 5){
            this.pointsEarned = 10;
        }
             
             
             for (int i = 0; i < DC.size(); i++){
                 if(this.DC.get(i).getCity1().getRoute().size() == 3 && this.DC.get(i).getCity2().getRoute().size() == 3){
                     for(int j = 0; j < 3; j++){
                         if(this.DC.get(i).getCity1().getRoute().get(j).getrouteOrder().equalsIgnoreCase(r.getrouteOrder()) && this.DC.get(i).getCity2().getRoute().get(j).getrouteOrder().equalsIgnoreCase(r.getrouteOrder())){
                             this.pointsEarned = this.pointsEarned + this.DC.get(i).getPoints();
                             this.DC.remove(i);
                         }
                      }
                 }
                 else if((this.DC.get(i).getCity1().getRoute().size() == 3 || this.getDC().get(i).getCity2().getRoute().size() == 3)) {
                     for(int j = 0; j < 2; j++){
                         if (this.DC.get(i).getCity1().getRoute().get(j).getrouteOrder().equalsIgnoreCase(r.getrouteOrder()) && this.DC.get(i).getCity2().getRoute().get(j).getrouteOrder().equalsIgnoreCase(r.getrouteOrder())){
                             this.pointsEarned = this.pointsEarned + this.DC.get(i).getPoints();
                             this.DC.remove(i);
                         }
                         else if (this.DC.get(i).getCity1().getRoute().size() == 3){
                             if(this.DC.get(i).getCity2().getRoute().get(0).getrouteOrder().equalsIgnoreCase(r.getrouteOrder()) && this.DC.get(i).getCity1().getRoute().get(2).getrouteOrder().equalsIgnoreCase(r.getrouteOrder())){
                                 this.pointsEarned = this.pointsEarned + this.DC.get(i).getPoints();
                                 this.DC.remove(i);
                             }
                         else if(this.DC.get(i).getCity2().getRoute().get(1).getrouteOrder().equalsIgnoreCase(r.getrouteOrder()) && this.DC.get(i).getCity1().getRoute().get(2).getrouteOrder().equalsIgnoreCase(r.getrouteOrder())){
                                  this.pointsEarned = this.pointsEarned + this.DC.get(i).getPoints();
                                  this.DC.remove(i);
                             }
                                    
                         }
                     }
                 } 
                 else {
                     for(int j = 0; j < 2; j++){
                         if(this.DC.get(i).getCity1().getRoute().get(j).getrouteOrder().equalsIgnoreCase(r.getrouteOrder()) && this.DC.get(i).getCity2().getRoute().get(j).getrouteOrder().equalsIgnoreCase(r.getrouteOrder())){
                             this.pointsEarned = this.pointsEarned + this.DC.get(i).getPoints();
                             this.DC.remove(i);
                              
                         }
                 }
              }
             }
             
             
             
             
             
             return this.pointsEarned;
           
    }
    
    /**
     * removes destination card
     * @param a
     */
    public void removeDC(int a){
        this.DC.remove(a);
    }
    
    /**
     * removes train card
     * @param a
     */
    public void removeTC(int a){
        this.TC.remove(a);
    }
    
    /**
     * removes train token
     * @param a
     */
    public void removeTrainTokens(int a){
        this.numTrains = this.numTrains - a;
    }
}
