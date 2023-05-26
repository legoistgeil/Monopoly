public final class Los extends Street{
    String name;

    public Los(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public Player getOwner() {
        return null;
    }

    @Override
    public Object getColor() {
        return null;
    }

    void makeAction(int i) {

    }
}
