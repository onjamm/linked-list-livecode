public class Practice {
    public static void main(String[] args) {
        
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);
        
        myNode.next = otherNode;
        otherNode.next = coolNode;

        Node current = myNode;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        //Going down the line of nodes
        System.out.println(myNode.value);
        System.out.println(myNode.next.value);
        System.out.println(myNode.next.next.value);
    }
}
