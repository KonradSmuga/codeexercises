public class SdaListImpl implements SdaList {

    private Node head;


    @Override
    public void add(int input) {
       Node node1 = new Node();
        if (head == null){

            head = node1;

        }
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean remove(int index) {

        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {

    }


    private class Node {
        private int value;
        private Node next;



    }
}
