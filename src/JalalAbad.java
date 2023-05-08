public class JalalAbad extends Region{

    private String getFoundedYear;
    private int quantityOfPeoples;

    public JalalAbad(String nameOfRegion, int areOfRegion,String getFoundedYear, int quantityOfPeoples) {
        super(nameOfRegion, areOfRegion);
        this.getFoundedYear = getFoundedYear;
        this.quantityOfPeoples = quantityOfPeoples;
    }

    public String getGetFoundedYear() {
        return getFoundedYear;
    }

    public void setGetFoundedYear(String getFoundedYear) {
        this.getFoundedYear = getFoundedYear;
    }

    public int getQuantityOfPeoples() {
        return quantityOfPeoples;
    }

    public void setQuantityOfPeoples(int quantityOfPeoples) {
        this.quantityOfPeoples = quantityOfPeoples;
    }

    @Override
    public String toString() {
        return "JalalAbad{" +
                "getFoundedYear='" + getFoundedYear + '\'' +
                ", quantityOfPeoples=" + quantityOfPeoples +
                "} " + super.toString();
    }
}
