package rocks.zipcode.io.quiz3.collections;


import java.util.List;

import java.util.Vector;


/**
 * @author leon on 10/12/2018.
 */
public class Student {

   private List<Lab> labList;



    public Student() {

        labList = new Vector<>();
    }

    public Student(List<Lab> labs) {
        labList = labs;
    }

    public Lab getLab(String labName) {
        for(Lab l : labList){
            if (l.getName().equals(labName)){
                return l;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for (Lab l: labList){
            if(l.getName().equals(labName)){
                l.setStatus(labStatus);
            }
        }
    }

    public void forkLab(Lab lab) {
        labList.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = labList.size()-1; i >= 0; i--){
            result.append(labList.get(i).getName() + " > " + labList.get(i).getStatus());
            if(i>0){
                result.append("\n");
            }
        }
        return result.toString();
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab l: labList) {
            if(l.getName().equals(labName)){
                return l.getStatus();
            }
        }
        return null;
    }
}
