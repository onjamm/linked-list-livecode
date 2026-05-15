public class Practice {
    public static void main(String[] args) {
        
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);
        Node helloNode = new Node ('f', null);
        myNode.next = otherNode;
        otherNode.next = coolNode;
        coolNode.next = helloNode;

        // int numNodes = length(myNode);
        // System.out.println(numNodes);
        
        Node current = myNode;
        Node newHead = removeAt(myNode, 0);
        current = newHead;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
     

        // Node current = myNode;

        // while (current != null) {
        //     System.out.println(current.value);
        //     current = current.next;
        // }

        //Going down the line of nodes
        // System.out.println(myNode.value);
        // System.out.println(myNode.next.value);
        // System.out.println(myNode.next.next.value);
    }


    //count how many nodes are in the linked list
    public static int length(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static Node removeAt(Node head, int removeIdx){
        
        if (removeIdx < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (removeIdx == 0) {
            return head.next;
        }

        Node current = head;
        
        for(int i = 0; i < removeIdx - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }
}
