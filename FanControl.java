public abstract class FanControl extends Monitor{

private String fan_Control;

public FanControl(){
this("");
}

public FanControl(String fan_Control){
this.fan_Control = fan_Control;
}

@Override
public static String fanControl(){
return fan_Control;
}

@Override
public String toString() {
      String retString = "Fan Control to string";
      return retString;
}
}