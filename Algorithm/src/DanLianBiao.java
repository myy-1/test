import javax.xml.soap.Node;

public class DanLianBiao {
    public void quickSort() {
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
            subSort(head, curNode);

        }
        public void subSort (Node low, Node high){
            if (low == null || low.next == null || low == high) return;
            int pivot = low.val;
            Node i = low.next;
            Node i_ore = low;
            Node j = low.next;
            while (i != high.next) {
                if (i.val < pivot) {
                    swapNode(i, j);
                    //track the previous Node of i
                    i_ore = i;
                    i = i.next();
                }
                i = i.next();

            }
            swapNode(low, i_ore);
            printList();
            subSort(low, i_ore);
            subSort(i, high);


        }
        public void swapNode (Node a, Node b){
            int temp = a.val;
            a.val = b.val;
            b.val = temp;

        }

    }
}
