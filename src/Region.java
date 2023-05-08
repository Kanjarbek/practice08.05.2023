public class Region {

    private String nameOfRegion;

    private int areOfRegion;

    public Region(String nameOfRegion, int areOfRegion) {
        this.nameOfRegion = nameOfRegion;

        this.areOfRegion = areOfRegion;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public void setNameOfRegion(String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }



    public int getAreOfRegion() {
        return areOfRegion;
    }

    public void setAreOfRegion(int areOfRegion) {
        this.areOfRegion = areOfRegion;
    }

    public void AreaOfRegion(){
        System.out.println("Area of " + getNameOfRegion() + " ");
    }

    @Override
    public String toString() {
        return "Region{" +
                "nameOfRegion='" + nameOfRegion + '\'' +
                ", areOfRegion=" + areOfRegion +
                '}';
    }
}
