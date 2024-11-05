public enum Days {
// Күндөргө enum түзүңүз (Monday, Tuesday ...)
// Консолдон бир күндү белгилеңиз. Эгер Monday
// болсо - анда "Дуйшөмбү куну жава окуйм" же Tuesday
// болсо - анда "Шейшемби күнү англис тили сабагын окуйм" деп күнгө
// жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
// Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.

    MONDAY("Дуйшомбу"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

    private String dayInKyrgyz;

    Days(String dayInKyrgyz) {
        this.dayInKyrgyz = dayInKyrgyz;
    }

    public String getDayInKyrgyz() {
        return dayInKyrgyz;
    }

    public void setDayInKyrgyz(String dayInKyrgyz) {
        this.dayInKyrgyz = dayInKyrgyz;
    }

    public String getDays(){
        while (true){
        switch (this){
            case MONDAY:
                return "Дүйшөмбү күнү жава окуйм";
            case TUESDAY:
                return "Шейшемби күнү англис тили сабагын окуйм";
            case WEDNESDAY:
                return "Шаршемби күнү математиканы окуйм";
            case THURSDAY:
                return "Бейшемби күнү физика сабагын окуйм";
            case FRIDAY:
                return "Жума күнү химия сабагын окуйм";
            case SATURDAY:
                return "Ишемби күнү тарых сабагын окуйм";
            case SUNDAY:
                return "Жекшемби күнү эс алам";
            default:
                return "Күн белгиленген эмес";
        }
    }


    }
}
