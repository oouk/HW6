package Model;

/**
 * Title: HW6
 * Date: 11/28/2018
 * @author sphein; oouk
 */
public class TrainTokens {
    private final String color;
    
    /**
     * constructor
     * @param c
     */
    public TrainTokens(String c){
        this.color = c;
    }
    
    /**
     * retrieve color name
     * @return color
     */
    public String getColor() {
        return this.color;
    }
    
}
