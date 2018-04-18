package ocp._2.designPatternsAndPrincipals.designingAnInterface;

public interface Run extends Walk {
    public abstract boolean canHuntWhileRunning();
    abstract double getMaxSpeed();
}
