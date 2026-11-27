import java.util.ArrayList;
import java.util.HashMap;

class Operations{
    void egArrayList(){
        ArrayList<String> todo = new ArrayList<>();
        todo.add("Wake up");
        todo.add("Breakfast");
        todo.add("Go for Office");
        todo.add("Do work");
        todo.add("come back home");
        todo.add("Have fun, live the life.");

        System.out.println("Displaying all items of arraylist:- ");
        int i =0;
        for(String task : todo){
            System.out.println(++i +") "+task);
        }
        System.out.println("Displaying all items of arraylist After removing a item:- ");
        todo.remove("Go for Office");
        i=0;
        for(String task : todo){
            System.out.println(++i +") "+task);
        }
    }

    void egHashMap(){
        HashMap<String,Double> subjects = new HashMap<>();
        subjects.put("Maths",90.5);
        subjects.put("Science",88.9);
        subjects.put("Java",99.9);
        subjects.put("Networking",95.9);
        subjects.put("English",98.9);

        for(String subject : subjects.keySet()){
            System.out.println(subject + " : " + subjects.get(subject));
        }
    }

    void combine(){
        HashMap<String,ArrayList<Integer>> subject = new HashMap<>();
        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        a.add(90);
        a.add(91);
        a.add(92);
        b.add(93);
        b.add(94);
        b.add(95);
        subject.put("Java",b);
        subject.put("Networking",a);

        for(String sub : subject.keySet()){
            System.out.println(sub + " : " + subject.get(sub));
        }

    }
}

public class D5{
    public static void main(String[] args){
        Operations op = new Operations();
        //op.egArrayList();
        //op.egHashMap();
        op.combine();
    }
}