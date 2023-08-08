public enum Days {
    MONDAY ("Дуйшомбу "),
    TUESDAY ( "Шейшемби "),
    WEDNESDAY ( " Шаршемби "),
    THURSDAY( " Бейшемби "),
    FRIDAY ( " Жума "),
    SATURDAY( " Ишемби "),
    SUNDAY ( " Жекшемби ");

    private String translate ;

    Days(String translate) {
        this.translate = translate;
    }

    @Override
    public String toString() {
        return "Days{"  +  translate + '\'' +
                '}';
    }
}
