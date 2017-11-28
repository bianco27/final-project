public abstract class LightCycle extends Monitor{

private double time;
private boolean on;

//this constructor
public LightCycle(){
this(1, false);
}

//acting as a setter
public LightCycle(double time, boolean on){
this.time = time;
this.on = on;
}

@Override
public boolean light_Cycle(){
    return on;
}

@Override
public String toString() {
      String retString = "Light Cycle to string";
      return retString;
}
}