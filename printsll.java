public class printsll {
    SinglyLinkedListNode {
            int data;
             SinglyLinkedListNode next;
        }
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            System.out.println(temp +"->");
        }
    }    

}
