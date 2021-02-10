public class LinkedList {
    Node head;
    Node temp;

    void insert(Point A, Point B, Point C, Point D) {
        Node n = new Node(A.x,A.y, B.x,B.y, C.x,C.y, D.x,D.y);
        if (head == null) {
            head = n;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
        }
    }

    void delete_forb(float x, float y){
        temp=head;
        while((temp.bx!=x && temp.by!=y)){
            temp=temp.next;
            if(temp==null){
                break;}
        }

        if(temp==head){
            head=temp.next;
            head.prev=null;
        }else if (temp.next==null){
            temp.prev.next=null;
        }else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    void delete_fora(float x, float y){
        temp=head;
        while((temp.ax!=x && temp.ay!=y)){
            temp=temp.next;
            if(temp==null){
                break;}
        }

        if(temp==head){
            head=temp.next;
            head.prev=null;
        }else if (temp.next==null){
            temp.prev.next=null;
        }else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }


    void display(){
        temp=head;
        while(temp!=null){
            System.out.println("A("+temp.ax+","+temp.ay+")");
            System.out.println("B("+temp.bx+","+temp.by+")");
            System.out.println("C("+temp.cx+","+temp.cy+")");
            System.out.println("D("+temp.dx+","+temp.dy+")");
            System.out.println();

            temp=temp.next;
        }
    }
}
