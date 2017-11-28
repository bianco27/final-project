public abstract class Fertilizer extends Monitor{

private double pH;

public Fertilizer(){
this(0);
}

public Fertilizer(double pH){
this.pH = pH;
}

@Override
public double pH(){
return pH;
}

@Override
public String toString() {
      String retString = "pH to string";
      return retString;
}
}