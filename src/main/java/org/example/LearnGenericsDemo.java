package org.example;

public class LearnGenericsDemo {
//    static void expurgate(Collection c){
//        for (Iterator i = c.iterator(); i.hasNext();){
//            if (((String) i.next()).length()==4){
//                i.remove();
//            }
//        }
//    }
    Integer thingsToPrint;

    public LearnGenericsDemo(Integer thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }
}
