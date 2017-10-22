/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

import java.util.ArrayList;

/**
 *
 * @author charles randall
 */
public class Faculty extends Employee {
    protected String rank;
    protected String researchArea;
    protected ArrayList<String> currentCourses;
    
    public Faculty(){
        currentCourses=new ArrayList<>();
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the researchArea
     */
    public String getResearchArea() {
        return researchArea;
    }

    /**
     * @param researchArea the researchArea to set
     */
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
    
    public int getNumCurrentCourses(){
        return currentCourses.size();
    }
    public String getCurrentCourse(int index){
        return currentCourses.get(index);
    }    
    public void addCurrentCourses(String item){
        currentCourses.add(item);
    }
    public void setCurrentCourses(int index, String item){
        currentCourses.add(index, item);
    }

    public String deleteCurrentCourses(int index){
        return currentCourses.remove(index);
    }
    public String toString(){
        String format="";
        format+=super.toString()+System.lineSeparator()+rank+", "+researchArea+System.lineSeparator();
   for(int i=0;i<currentCourses.size();i++){
       format+=currentCourses.get(i);
            if (i +1!=currentCourses.size()) {
                format+=",";
            }
        }
        return format;
    
    }
}
