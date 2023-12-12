package verhuur;

public class HuurVoertuig {
    private String merk;
    private String type;
    private float huurprijs;

    public HuurVoertuig(String merk, String type, float huurprijs) {
        this.merk = merk;
        this.type = type;
        this.huurprijs = huurprijs;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public float getHuurprijs() {
        return huurprijs;
    }

    public String getBeschrijving() {
        return merk + " " + type;
    }


}
