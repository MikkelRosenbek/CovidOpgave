public class Covid19Data {

    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagtePåIntensivAfdeling;
    private int indlagte;
    private String dato;


    public Covid19Data (String region, String aldersgruppe, int bekræftedeTilfældeIAlt,
                        int døde, int indlagtePåIntensivAfdeling, int indlagte, String dato){

    this.region = region;
    this.aldersgruppe = aldersgruppe;
    this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
    this.døde = døde;
    this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
    this.indlagte = indlagte;
    this.dato = dato;
    }

    @Override
    public String toString() {
        return
                "    Region: " + region + "\n" +
                "    Aldersgruppe: " + aldersgruppe + "\n" +
                "    Bekræftede tilfælde i alt: " + bekræftedeTilfældeIAlt + "\n" +
                "    Døde: " + døde + ",\n" +
                "    Indlagte på intensiv afdeling: " + indlagtePåIntensivAfdeling + "\n" +
                "    Indlagte: " + indlagte + "\n" +
                "    Dato: " + dato + "\n"
                ;
    }
    }




