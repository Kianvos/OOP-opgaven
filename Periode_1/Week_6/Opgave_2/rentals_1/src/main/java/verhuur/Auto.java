package verhuur;

import verhuur.HuurVoertuig;

public class Auto extends HuurVoertuig {
    private String kenteken;
    private int aantalInzittenden;
    private int brandstof;

    public static final int BRANDSTOF_BENZINE = 1;
    public static final int BRANDSTOF_DIESEL = 2;
    public static final int BRANDSTOF_ELEKTRISCH = 3;

    public Auto(String merk, String type, float huurprijs, String kenteken, int aantalInzittenden, int brandstof) {
        super(merk, type, huurprijs);
        this.kenteken = kenteken;
        this.aantalInzittenden = aantalInzittenden;
        this.brandstof = brandstof;
    }

    public String getKenteken() {
        return kenteken;
    }

    public int getAantalInzittenden() {
        return aantalInzittenden;
    }

    public int getBrandstof() {
        return brandstof;
    }

    public void printInfo() {
        System.out.println(this.getMerk() + " " + this.getType() + " " + kenteken + ", " + brandstof + ", " + aantalInzittenden + " personen");
    }
}
