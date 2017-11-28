public abstract class Monitor {
   protected abstract boolean light_cycle();
   protected abstract double temperature();
   protected abstract double humidity();
   protected abstract double timeSinceLastWater();
   protected abstract String fanControl();
   protected abstract String toString();
}
