package me.ninjoh.nincore.api;

import java.util.Locale;

public enum MinecraftLocale
{
    AFRIKAANS("Afrikaans", new Locale("af", "ZA")), // Official language in South Africa.
    ARABIC("اللغة العربية", new Locale("ar", "SA")),
    ASTURIAN("Asturianu", new Locale("ast", "ES")), // One of the official languages in Spain.
    AZERBAIJANI("Azerbaijani", new Locale("az", "AZ")), // Official language in Azerbaijan, Dagestan.
    BULGARIAN("Български", new Locale("bg", "BG")),
    CATALAN("Català", new Locale("ca", "ES")), // Official language in Spain (Catalonia) & Andorra.
    CZECH("Čeština", new Locale("cs", "CZ")),
    WELSH("Cymraeg", new Locale("cy", "GB")), // Official language in Wales.
    DANISH("Dansk", new Locale("da", "DK")),
    GERMAN("Deutsch", new Locale("de", "DE")),
    GREEK("Ελληνικά", new Locale("el", "GR")),
    AUSTRALIAN_ENGLISH("Australian English", new Locale("en", "AU")),
    CANADIAN_ENGLISH("Canadian English", new Locale("en", "CA")),
    BRITISH_ENGLISH("English (UK)", new Locale("en", "GB")),
    PIRATE_ENGLISH("Pirate Speak (PIRATE)", new Locale("en", "PT")), // Mojang joke / Minecraft easter egg.
    AMERICAN_ENGLISH("English (US)", new Locale("en", "US")),
    ESPERANTO("Esperanto (Mondo)", new Locale("eo", "UY")), // Constructed language (International)
    ARGENTINIAN_SPANISH("Español (Ar)", new Locale("es", "AR")),
    SPANISH("Español (Es)", new Locale("es", "ES")),
    MEXICAN_SPANISH("Español (Me)", new Locale("es", "MX")),
    URUGUAYAN_SPANISH("Español (Ur))", new Locale("es", "UY")),
    VENEZUELAN_SPANISH("Español (Ve)", new Locale("es", "VE")),
    ESTONIAN("Eesti", new Locale("et", "EE")),
    BASQUE("Euskara", new Locale("eu", "ES")), // Spain (Basque Country) & France
    PERSIAN("فارسی", new Locale("fa", "IR")),
    FINNISH("Suomi",  new Locale("fi", "FI")),
    FRENCH("Français (Fr)", new Locale("fr", "FR")),
    CANADIAN_FRENCH("Français (Ca)", new Locale("fr", "CA")),
    IRISH("Gaeilge", new Locale("ga", "IE")),
    GALICIAN("Galician", new Locale("gl", "ES")), // Galicia (Spain)
    MANX("Gaelg", new Locale("gv", "IM")), // Isle of Man
    HEBREW("עברית", new Locale("he", "IL")), // Israel
    HINDI("हिन्दी", new Locale("hi", "IN")), // India
    CROATIAN("Hrvatski", new Locale("hr", "HR")),
    HUNGARIAN("Magyar", new Locale("hu", "HU")),
    ARMENIAN("Armenian", new Locale("hy", "AM")), // Armenian country name doesn't work with UTF-8 I think?
    INDONESIAN("Bahasa Indonesia", new Locale("id", "ID")),
    ICELANDIC("Íslenska", new Locale("is", "IS")),
    ITALIAN("Italiano",new Locale("it", "IT")),
    JAPANESE("日本語", new Locale("ja", "JP")),
    GEORGIAN("ქართული", new Locale("ka", "GE")),
    KOREAN("한국어", new Locale("ko", "KR")), // North Korea and South Korea
    CORNWALL("Kernowek", new Locale("kw", "GB")), // Cornwall
    LATIN("Lingua Latina", new Locale("la", "VA")),
    LUXEMBOURGISH("Lëtzebuergesch", new Locale("lb", "LU")),
    LITHUANIAN("Lietuvių", new Locale("lt", "LT")), // Lithuania
    LATVIAN("Latviešu", new Locale("lv", "LV")), // Latvia
    MAORI("Te Reo Māori", new Locale("mi", "NZ")), // Aotearoa
    MALAY("Bahasa Melayu", new Locale("ms", "MY")), // Malaysia, Singapore, Brunei
    MALTESE("Malti", new Locale("mt", "MT")),
    LOW_GERMAN("Platdüütsk", new Locale("nds", "DE")), // Low German, Germany
    DUTCH("Nederlands", new Locale("nl", "NL")), // The Netherlands
    NORWEGIAN_NYORSK("Norsk Nynorsk", new Locale("nn", "NO")),
    NORWEGIAN("Norsk", new Locale("no", "NO")),
    OCCITAN("Occitan", new Locale("oc", "FR")), // Occitania (Val d'Aran in Spain, southern tier of France, several alpine valleys of Piedmont)
    POLISH("Polski", new Locale("pl", "PL")),
    BRAZILLIAN_PORTUGESE("Português (Br)", new Locale("pt", "BR")),
    PORTUGESE("Portuguese (Po)", new Locale("pt", "PT")),
    QUENYA("Quenya", new Locale("qya", "AA")), // Constructed language (Lord of the Rings: Valinor, Lindon and Rivendell)
    ROMANIAN("Română", new Locale("ro", "RO")),
    RUSSIAN("Русский", new Locale("ru", "RU")),
    SLOVAK("Slovenčina", new Locale("sk", "SK")),
    SLOVENIAN("Slovenščina", new Locale("sl", "SI")),
    NORTHERN_SAMI("Davvisámegiella", new Locale("sme")), // Sápmi
    SERBIAN("Српски", new Locale("sr", "SP")),
    SWEDISH("Svenska", new Locale("sv", "SE")),
    THAI("Svenska", new Locale("th", "TH")),
    FILLIPINO("Filipino", new Locale("tl", "PH")),
    KLINGON("tlhIngan Hol", new Locale("tlh", "AA")), // Constructed language (Star Trek: the Klingon Empire)
    TURKISH("Türkçe", new Locale("tr", "TR")),
    UKRAINIAN("Українська", new Locale("uk", "UA")),
    VALENCIAN("Valencià", new Locale("ca-val", "ES")), // Spain.
    VIETNAMESE("Tiếng Việt", new Locale("vi", "VN")),
    CHINESE_SIMPLIFIED("简体中文", new Locale("zh", "CH")), // China, Singapore
    CHINESE_TRADITIONAL("繁體中文", new Locale("zh", "TW")); // Taiwan, Hong Kong, Macau


    private String name;
    private Locale locale;


    /**
     * @param name The name of the language in it's own language. (e.g Français)
     * @param locale The related {@link Locale}
     */
    MinecraftLocale(String name, Locale locale)
    {
        this.name = name;
        this.locale = locale;
    }


    /**
     * Get the display name. Returns the same as {@link Locale#getDisplayName()}
     *
     * @return The display name.
     */
    public String getDisplayName()
    {
        return this.locale.getDisplayName();
    }


    public String getDisplayName(Locale inLocale)
    {
        return this.locale.getDisplayName(inLocale);
    }


    public String getDisplayName(MinecraftLocale inLocale)
    {
        return this.locale.getDisplayName(inLocale.toLocale());
    }


    /**
     * Will return the display name. Returns the same as {@link Locale#getDisplayName()}
     *
     * @return The display name.
     */
    @Override
    public String toString()
    {
        return this.locale.getDisplayName();
    }


    /**
     * Get this language's language tag/code. (e.g nl_NL)
     *
     * @return This language's language tag/code.
     */
    public String getLanguageTag()
    {
        return this.locale.toLanguageTag();
    }


    /**
     * Get the related {@link Locale}
     *
     * @return The relatd {@link Locale}
     */
    public Locale toLocale()
    {
        return this.locale;
    }


    /**
     * Get a {@link MinecraftLocale} from i's language languageTag.
     * Returns null if no {@link MinecraftLocale} with the provided language languageTag could be found.
     *
     * @param languageTag The language languageTag to query for.
     * @return The {@link MinecraftLocale} if a {@link MinecraftLocale} was found, else it returns null.
     */
    // One can not override valueOf(), so use this.
    public static MinecraftLocale fromLanguageTag(String languageTag)
    {
        for (MinecraftLocale minecraftLocale : MinecraftLocale.values())
        {
            if(minecraftLocale.getLanguageTag().equals(languageTag)) return minecraftLocale;
        }

        return null;
    }


    public static MinecraftLocale fromLocale(Locale locale)
    {
        for (MinecraftLocale minecraftLocale : MinecraftLocale.values())
        {
            if(minecraftLocale.toLocale().equals(locale)) return minecraftLocale;
        }

        return null;
    }


    /**
     * Get the default {@link MinecraftLocale}.
     *
     * @return The default {@link MinecraftLocale}.
     */
    public static MinecraftLocale getDefault()
    {
        return NinCore.getImplementation().getDefaultMinecraftLocale();
    }


    public static void setDefault(MinecraftLocale minecraftLocale)
    {
        NinCore.getImplementation().setDefaultMinecraftLocale(minecraftLocale);
    }
}