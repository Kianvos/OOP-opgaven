package verhuur;

import verhuur.HuurVoertuig;

public class Fiets extends HuurVoertuig {
    private int frame;
    private int aantalVersnellingen;

    public static final int FRAME_DAMES = 1;
    public static final int FRAME_HEREN = 2;

    public Fiets(String merk, String type, float huurprijs, int frame, int aantalVersnellingen) {
        super(merk, type, huurprijs);
        this.frame = frame;
        this.aantalVersnellingen = aantalVersnellingen;
    }

    public int getFrame() {
        return frame;
    }

    public int getAantalVersnellingen() {
        return aantalVersnellingen;
    }

    @Override
    public String toString() {
        return this.getMerk() + " " + this.getType() + ", " + frame + ", " + aantalVersnellingen + " versnellingen";
    }


}
