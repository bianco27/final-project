public abstract class WaterCycle extends Monitor{

private double temperature;
private double humidity;
private double time;
private double timeSinceWater;

public WaterCycle(){
this(0,0,0,0);
}

public WaterCycle(double temperature, double, humidity, double time, double timeSinceWater){
this.temperature = temperature;
this.humidity = humidity;
this.time = time;
this.timSinceWater = timeSinceWater;
}

@Override
public double temperature(){
return temperature;
}

@Override
public double humidity(){
return humidity;
}

@Override
public double time(){
return time;
}

@Override
public double timeSinceWater(){
return timeSinceWater;
}

@Override
public String toString() {
      String retString = "Water Cycle to string";
      return retString;
}
}