package Model;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Deck {
    private ArrayList<TrainCarCards> TCDeck;
    private int n;
    private TrainCarCards TC;
    private DestinationCards DC;
    private ArrayList<TrainCarCards> TC_Discard;
    private ArrayList<DestinationCards> DCDeck;
    private ArrayList<DestinationCards> DC_Discard;
    private ArrayList<TrainCarCards> faceup_TC;
    
    public Deck(){
        TCDeck = new ArrayList();
        TC_Discard = new ArrayList();
        DCDeck = new ArrayList();
        DC_Discard = new ArrayList();
        faceup_TC = new ArrayList();
    }
    
    //Initialize TCDeck
    public void setTCDeck(){
        TrainCarCards C = new TrainCarCards("Blue");
        TCDeck.add(C);
        TCDeck.add(C);       
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        C = new TrainCarCards("Red");
        TCDeck.add(C);
        TCDeck.add(C);       
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        C = new TrainCarCards("Yellow");
        TCDeck.add(C);
        TCDeck.add(C);       
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        C = new TrainCarCards("Green");
        TCDeck.add(C);
        TCDeck.add(C);       
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        TCDeck.add(C);
        
        Collections.shuffle(TCDeck);
        
    }
    public void setDCDeck(City c1, City c2, City c3, City c4, City c5, City c6){
        this.DCDeck.add(new DestinationCards(c1, c2, 3));
        this.DCDeck.add(new DestinationCards(c2, c3, 3));
        this.DCDeck.add(new DestinationCards(c3, c4, 3));
        this.DCDeck.add(new DestinationCards(c4, c5, 3));   
        this.DCDeck.add(new DestinationCards(c5, c6, 3)); 
        this.DCDeck.add(new DestinationCards(c1, c6, 3)); 
        this.DCDeck.add(new DestinationCards(c6, c4, 5));
        this.DCDeck.add(new DestinationCards(c6, c2, 5)); 
        this.DCDeck.add(new DestinationCards(c5, c1, 5));
        this.DCDeck.add(new DestinationCards(c4, c2, 5)); 
        this.DCDeck.add(new DestinationCards(c1, c3, 5));
        this.DCDeck.add(new DestinationCards(c6, c3, 6));
        this.DCDeck.add(new DestinationCards(c4, c1, 6)); 
        
        
        Collections.shuffle(DCDeck);
    }
    public void setFaceUp(){
        this.faceup_TC.add(this.drawTrainCarCard());
        this.faceup_TC.add(this.drawTrainCarCard());  
        this.faceup_TC.add(this.drawTrainCarCard());
        this.faceup_TC.add(this.drawTrainCarCard());
        this.faceup_TC.add(this.drawTrainCarCard());
                
    }
    
    public TrainCarCards drawTrainCarCard(){
        if (this.TCDeck.isEmpty()){
            this.discardToTCDeck();
        }
        this.TC = TCDeck.get(0);
        TCDeck.remove(0);
        return this.TC;
        
    }
    public ArrayList<TrainCarCards> getFaceUp(){
        return this.faceup_TC;
    }
    public TrainCarCards drawFaceUp(int a){
        a--;
        System.out.print(a);

        this.TC = faceup_TC.get(a);
                System.out.println(this.TC.getcolorTrainCarCard());
        faceup_TC.remove(a);
        if (this.TCDeck.isEmpty()){
            this.discardToTCDeck();
        }
        this.faceup_TC.add(this.drawTrainCarCard());
        return this.TC;
    }
    public DestinationCards drawDestinationCard(){
        if (this.DCDeck.isEmpty()){
            this.discardToDCDeck();
        }
        this.DC = DCDeck.get(0);
        DCDeck.remove(0);
        return this.DC;
    }
    public void discardTrainCarCard(TrainCarCards c){
        this.TC_Discard.add(c);
        
    }
    public void discardDestinationCard(DestinationCards d){
        this.DC_Discard.add(d);
    }
    public void discardToTCDeck(){
        this.TCDeck = this.TC_Discard;
        Collections.shuffle(this.TCDeck);
        this.TC_Discard.clear();
    }
    public void discardToDCDeck(){
            this.DCDeck = this.DC_Discard;
            Collections.shuffle(this.DCDeck);
            this.DC_Discard.clear();
    }
    
}
