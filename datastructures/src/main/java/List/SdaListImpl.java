package List;

public class SdaListImpl implements SdaList {

    private Node head;

    @Override
    public void add(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            head = node;
        } else {
            //zapisuje pierwszy element do tmp
            Node tmp = head;

            while (tmp.next != null) {
                //wiemy ze tmp ma nastepny element
                tmp = tmp.next;
            }
            //w tmp jest ostatni element
            tmp.next = node;
        }
    }

    @Override
    public int get(int index) {
        int counter = 0;
        Node tmp = head;

        while (tmp != null) {
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
        if (isEmpty()) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            return true;
        } else {
            Node tmp = head;
            int counter = 0;

            while (tmp != null) {
                counter++;

                if (counter == index) {
                    tmp.next = tmp.next.next;
                    return true;
                }

                tmp = tmp.next;
            }
        }

        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public int size() {
        int counter = 0;
        Node tmp = head;

        while (tmp != null) {
            counter++;
            tmp = tmp.next;
        }

        return counter;
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

    private class Node {

        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }
}
