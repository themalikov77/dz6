public class Skeleton extends Boss{
    int  numberOfArrows=27;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public String printlnfo() {
        return super.printlnfo() +" Shoot " +numberOfArrows;   }
}
