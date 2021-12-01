import java.util.ArrayList;
public class Objects implements Prims {

  ArrayList<Prims> prims_list = new ArrayList<Prims>();


  public double calcVolume() {

    double volume = 0;
    //iterator for going through array & for each item in array it calls calcVolume()
    for (Prims prim:prims_list) {

        volume += prim.calcVolume();

    }

    return volume;

  }

  public void add(Prims prims) {

    prims_list.add(prims);

  }
  
  public void remove(Prims prims) {

    prims_list.remove(prims);

  }

  public Prims getChild(int index) {

      return prims_list.get(index);

  }

}