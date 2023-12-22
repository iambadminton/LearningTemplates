package LearnEnum;

public enum MaintMethod {
    OWN_STRENGTH("собственными силами", "c.c"),
    SUBCONTRACT("подрядными организациями", "п.о.");

    private String descr;
    private String abbr;

    MaintMethod(String descr, String abbr) {
        this.descr = descr;
        this.abbr = abbr;
    }

    public String getDescr() {
        return descr;
    }

    public String getAbbr() {
        return abbr;
    }
}
