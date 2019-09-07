package newLambda;

public class Ex2 implements Person, Identified {

    @Override
    public int getID() {
        return Identified.super.getID();
    }
}
interface Person{
    default int getID(){
        return -1;
    }
}

interface Identified {
    default int getID(){
        return Math.abs(hashCode());
    }
}