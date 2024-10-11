import java.util.*;
public class PQforObject {
    public static class Student implements Comparable<Student>{
        int rank;
        String name;

        public Student(int rank , String name){
            this.name = name;
            this.rank = rank;
        }

        public int compareTo(Student s2){
            return this.rank - s2.rank;
        } 
    }
    public static void main(String args[]){
        // PriorityQueue <Student> pq = new PriorityQueue();
        PriorityQueue <Student> pq = new PriorityQueue(Comparator.reverseOrder());

        pq.add(new Student(3, "A"));
        pq.add(new Student(6, "B"));
        pq.add(new Student(1, "C"));
        pq.add(new Student(9, "D"));

        while(! pq.isEmpty()){
            System.out.println(pq.peek().name +"-->"+pq.peek().rank);
            pq.remove();
        }
    }
}
