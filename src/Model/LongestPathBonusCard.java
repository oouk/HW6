package Model;
import java.util.ArrayList;

/**
 * Title: HW6 
 * Date: 12/7/2018
 * @author sphein; oouk
 */
//public class LongestPathBonusCard {
//
//    private static final int POINTS = 10;
//    private int p1Longest;
//    private int p2Longets;
//    private String person;
//    private ArrayList<Route> p1Routes;
//    private ArrayList<Route> p2Routes;
//    private int startInt; //the position for j to start to check if the path is continuous
//
//    public String playerLPB( ArrayList<Route> r){
//        this.person = r.get(0).getClaimedBy();
//        p1Routes.add(r.get(0));
//        for(int i = 1; i < r.size(); i++){
//            if(this.person.equalsIgnoreCase(r.get(1).getClaimedBy())){
//               p1Routes.add(r.get(1));
//          }
//            else{
//                p2Routes.add(r.get(i));
//            }
//        }
//        startInt = 0;
//        for(int i = 0; i < p1Routes.size(); i++){
//            if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(0).getrouteOrder())){
//                startInt = 0;
//            }
//            else if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(1).getrouteOrder())){
//                startInt = 1;
//        }
//            else if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(2).getrouteOrder())){
//                startInt = 2;
//            }
//            else if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(0).getrouteOrder())){
//                startInt = 3;
//            }
//            else if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(0).getrouteOrder())){
//                startInt = 4;
//            }
//            else if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(0).getrouteOrder())){
//                startInt = 5;
//            }
//            else if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(0).getrouteOrder())){
//                startInt = 6;
//            }
//
//            for(int j = startInt; j < r.size(); j++){
//                if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(1).getColor())){
//                    if(p1Routes.get(i+1).getrouteOrder().equalsIgnoreCase(r.get(6).getrouteOrder())){
//                        p1Longest = 2;
//                        if(p1Routes.get(i+2))
//                    }
//                }
//
//                if(p1Routes.get(i).getrouteOrder().equalsIgnoreCase(r.get(j).getrouteOrder())){
//                    if(p1Routes.get(i+1).getrouteOrder().equalsIgnoreCase(r.get(j+1).getrouteOrder())){
//                        p1Longest = 2;
//                        if(p1Routes.size() > i+2){
//                            if(p1Routes.get(i+2).getrouteOrder().equalsIgnoreCase(r.get(j+2).getrouteOrder())){
//                                p1Longest = 3;
//                                if(p1Routes.size() > i+3){
//                                    if(p1Routes.get(i+3).getrouteOrder().equalsIgnoreCase(r.get(j+3).getrouteOrder())){
//                                        p1Longest = 4;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                    else if){
//                        if(p1Routes.get(i))
//                    }
//                    else{
//                        p1Longest = 1;
//                    }
//                }
//            }
//
//        }
//
//        return this.person;
//    }   
//
//}