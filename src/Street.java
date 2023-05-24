abstract class Street{
    public Player owner;
    public int cost;
    String name;
    abstract void makeAction(int i);

    public abstract String getName();

    public abstract int getCost();

    public abstract Player getOwner();
}
