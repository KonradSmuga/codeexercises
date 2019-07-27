public class SdaListImpl implements SdaList {

    private Node head;


    @Override
    public void add(int input) {
        Node node1 = new Node(input);

        if (head == null) {
            head = node1;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node1;
        }
    }

    @Override
    public int get(int index) {
        int counter = 0;
        Node tmp = head;
        while (tmp.next != null) {
            if (counter == index) {
                return tmp.value;
            }
            tmp = tmp.next;
            counter++;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean remove(int index) {
        if(isEmpty()){
            return  false;
        }

        if (index == 0) {
            head = head.next;
            return true;
        } else {
            Node tmp = head;
            int counter = 0;
            while (tmp != null) {
                counter ++;
                if (counter == index) {
                   tmp.next = tmp.next.next;
                   return  true;
                }
                tmp = tmp.next;
            }
        }
        return false;
    }

    @Override
    public int size() {
        int size = 0;
        Node tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        return size;
    }

    @Override
    public boolean contains(int value) {
        Node tmp = head;

        while (tmp != null) {
            if (tmp.value == value) {
                return true;
            }
            tmp = tmp.next;

        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        head = null;
    }


    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }
}
