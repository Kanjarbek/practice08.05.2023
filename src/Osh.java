public class Osh extends Region{
    private String getFoundedYear;
    private int quantityOfPeoples;


    public Osh(String nameOfRegion, int areOfRegion, String getFoundedYear, int quantityOfPeoples) {
        super(nameOfRegion, areOfRegion);
        this.getFoundedYear = getFoundedYear;
        this.quantityOfPeoples = quantityOfPeoples;
    }

    @Override
    public String toString() {
        return "Osh{" +
                "getFoundedYear='" + getFoundedYear + '\'' +
                ", quantityOfPeoples=" + quantityOfPeoples +
                "} " + super.toString();
    }
}
