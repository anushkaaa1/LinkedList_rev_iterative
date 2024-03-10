//reverse list using iterative method
public class reverselist2 {
    Node head,tail;

    public reverselist2(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head == null){
            tail = head = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node nextnode = null;
        while(curr!=null){
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }
    public static void main(String[] args) {
        reverselist2 l = new reverselist2();
        l.create(1);
        l.create(5);
        l.create(3);
        l.create(6);
        l.print(l.head);
        Node temp =  l.reverse(l.head);

         System.out.println();
        l.print(temp);
    }
}
