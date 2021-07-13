import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer>{

    protected Random random;
    protected int min,max;


    public Randoms(int min, int max){
        if (max < min){
            throw new IllegalArgumentException("Max low than Min");
        }

        this.min = min;
        this.max = max;
        this.random = new Random();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(max - min + 1);
            }
        };
    }


}
