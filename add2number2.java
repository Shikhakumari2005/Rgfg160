import java.util.LinkedList;

class Node{
    int val;
   // Node  head;
    Node next;
    
    
    public  static LinkedList<Integer>  sumnumber(Node l1 ,Node l2){
        Node temp1=l1;
        Node temp=l2;
        LinkedList<Integer> sum = new LinkedList<>();
        int carry=0;
        
        while(temp1!=null && temp!=null){
            int dummy=temp1.val +temp.val+carry;
            int digit= dummy%10;
            carry=dummy/10;
            sum.add(digit);
            temp1 = temp1.next;
            temp = temp.next;
        }
        if(carry>0){
            sum.add(carry);
        }
        return sum;
    }
    public static void main(String[] args) {
        Node l1=new Node(null,3);
        l1.next = new Node(null, 5);
        l1.next.next = new Node(null, 7);

        Node l2 = new Node(null, 7);
        l2.next = new Node(null, 5);
        l2.next.next = new Node(null, 2);

        LinkedList<Integer> result = sumnumber(l1, l2);

        System.out.println(result);
        
    }
}