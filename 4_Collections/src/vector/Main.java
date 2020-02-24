package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IVector[] vectors = new IVector[6]; // kan der s�ttes I foran den f�rste og den anden

        //Tilf�j elementer til listen
        vectors[0] = new Vector(1, 1);
        vectors[1] = new Vector(400, 278);
        vectors[2] = new Vector(3.0, 7);
        vectors[3] = new Vector(1, 2);
        vectors[4] = vectors[0].add(vectors[2]); //Vi er n�dt til at caste til vector.Vector
        vectors[5] = (Vector) vectors[0].times(4); //Vi er n�dt til at caste til vector.Vector

        System.out.println("vectors f�r sortering: " + Arrays.toString(vectors));

        //Sort�r listen
        Arrays.sort(vectors);
        System.out.println("vectors efter sortering: " + Arrays.toString(vectors));

        //Sammenlign to vektorer
        IVector v1 = new Vector(1.4, 2.3);
        IVector v2 = new Vector(1.4, 2.3);
        IVector v3 = new Vector(2, 1);
        IVector v4 = new Vector(1, 2);

        System.out.println(v1 + " er lig " + v2 + ": " + v1.equals(v2));
        System.out.println(v3 + " er lig " + v4 + ": " + v3.equals(v4));
    
        List<IVector> v=new ArrayList<IVector>();
        v.add(v3);
        v.add(v1);
        v.add(v3);
             
        v.sort(null);;
        Iterator<IVector> it =  v.iterator();
        while(it.hasNext()) 
        	System.out.println(it.next());
        
    
    }
}
