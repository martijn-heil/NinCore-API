package me.ninjoh.nincore.api;

import java.util.Locale;

public enum MinecraftLocale
{
    AFRIKAANS("Afrikaans", "af_ZA", new Locale("af", "ZA")), // Official language in South Africa.
    ARABIC("اللغة العربية", "ar_SA", new Locale("ar", "SA")),
    ASTURIAN("Asturianu", "ast_ES", new Locale("ast", "ES")), // One of the official languages in Spain.
    AZERBAIJANI("Azerbaijani", "az_AZ", new Locale("az", "AZ")), // Official language in Azerbaijan, Dagestan.
    BULGARIAN("Български", "bg_BG", new Locale("bg", "BG")),
    CATALAN("Català", "ca_ES", new Locale("ca", "ES")), // Official language in Spain (Catalonia) & Andorra.
    CZECH("Čeština", "cs_CZ", new Locale("cs", "CZ")),
    WELSH("Cymraeg", "cy_GB", new Locale("cy", "GB")), // Official language in Wales.
    DANISH("Dansk", "da_DK", new Locale("da", "DK")),
    GERMAN("Deutsch", "de_DE", new Locale("de", "DE")),
    GREEK("Ελληνικά", "el_GR", new Locale("el", "GR")),
    AUSTRALIAN_ENGLISH("Australian English", "en_AU", new Locale("en", "AU")),
    CANADIAN_ENGLISH("Canadian English", "en_CA", new Locale("en", "CA")),
    BRITISH_ENGLISH("English (UK)", "en_GB", new Locale("en", "GB")),
    PIRATE_ENGLISH("Pirate Speak (PIRATE)", "en_PT", new Locale("en", "PT")), // Mojang joke / Minecraft easter egg.
    AMERICAN_ENGLISH("English (US)", "en_US", new Locale("en", "US")),
    ESPERANTO("Esperanto (Mondo)", "eo_UY", new Locale("eo", "UY")), // Constructed language (International)
    ARGENTINIAN_SPANISH("Español (Ar)", "es_AR", new Locale("es", "AR")),
    SPANISH("Español (Es)", "es_ES", new Locale("es", "ES")),
    MEXICAN_SPANISH("Español (Me)", "es_MX", new Locale("es", "MX")),
    URUGUAYAN_SPANISH("Español (Ur))", "es_UY", new Locale("es", "UY")),
    VENEZUELAN_SPANISH("Español (Ve)", "es_VE", new Locale("es", "VE")),
    ESTONIAN("Eesti", "et_EE", new Locale("et", "EE")),
    BASQUE("Euskara", "eu_ES", new Locale("eu", "ES")), // Spain (Basque Country) & France
    PERSIAN("فارسی", "fa_IR", new Locale("fa", "IR")),
    FINNISH("Suomi", "fi_FI", new Locale("fi", "FI")),
    FRENCH("Français (Fr)", "fr_FR", new Locale("fr", "FR")),
    CANADIAN_FRENCH("Français (Ca)", "fr_CA", new Locale("fr", "CA")),
    IRISH("Gaeilge", "ga_IE", new Locale("ga", "IE")),
    GALICIAN("Galician", "gl_ES", new Locale("gl", "ES")), // Galicia (Spain)
    MANX("Gaelg", "gv_IM", new Locale("gv", "IM")), // Isle of Man
    HEBREW("עברית", "he_IL", new Locale("he", "IL")), // Israel
    HINDI("हिन्दी", "hi_IN", new Locale("hi", "IN")), // India
    CROATIAN("Hrvatski", "hr_HR", new Locale("hr", "HR")),
    HUNGARIAN("Magyar", "hu_HU", new Locale("hu", "HU")),
    ARMENIAN("Armenian", "hy_AM", new Locale("hy", "AM")), // Armenian country name doesn't work with UTF-8 I think?
    INDONESIAN("Bahasa Indonesia", "id_ID", new Locale("id", "ID")),
    ICELANDIC("Íslenska", "is_IS", new Locale("is", "IS")),
    ITALIAN("Italiano", "it_IT", new Locale("it", "IT")),
    JAPANESE("日本語", "ja_JP", new Locale("ja", "JP")),
    GEORGIAN("ქართული", "ka_GE", new Locale("ka", "GE")),
    KOREAN("한국어", "ko_KR", new Locale("ko", "KR")), // North Korea and South Korea
    CORNWALL("Kernowek", "kw_GB", new Locale("kw", "GB")), // Cornwall
    LATIN("Lingua Latina", "la_VA", new Locale("la", "VA")),
    LUXEMBOURGISH("Lëtzebuergesch", "lb_LU", new Locale("lb", "LU")),
    LITHUANIAN("Lietuvių", "lt_LT", new Locale("lt", "LT")), // Lithuania
    LATVIAN("Latviešu", "lv_LV", new Locale("lv", "LV")), // Latvia
    MAORI("Te Reo Māori", "mi_NZ", new Locale("mi", "NZ")), // Aotearoa
    MALAY("Bahasa Melayu", "ms_MY", new Locale("ms", "MY")), // Malaysia, Singapore, Brunei
    MALTESE("Malti", "mt_MT", new Locale("mt", "MT")),
    LOW_GERMAN("Platdüütsk", "nds_DE", new Locale("nds", "DE")), // Low German, Germany
    DUTCH("Nederlands", "nl_NL", new Locale("nl", "NL")), // The Netherlands
    NORWEGIAN_NYORSK("Norsk Nynorsk", "nn_NO", new Locale("nn", "NO")),
    NORWEGIAN("Norsk", "no_NO", new Locale("no", "NO")),
    OCCITAN("Occitan", "oc_FR", new Locale("oc", "FR")), // Occitania (Val d'Aran in Spain, southern tier of France, several alpine valleys of Piedmont)
    POLISH("Polski", "pl_PL", new Locale("pl", "PL")),
    BRAZILLIAN_PORTUGESE("Português (Br)", "pt_BR", new Locale("pt", "BR")),
    PORTUGESE("Portuguese (Po)", "pt_PT", new Locale("pt", "PT")),
    QUENYA("Quenya", "qya_AA", new Locale("qya", "AA")), // Constructed language (Lord of the Rings: Valinor, Lindon and Rivendell)
    ROMANIAN("Română", "ro_RO", new Locale("ro", "RO")),
    RUSSIAN("Русский", "ru_RU", new Locale("ru", "RU")),
    SLOVAK("Slovenčina", "sk_SK", new Locale("sk", "SK")),
    SLOVENIAN("Slovenščina", "sl_SI", new Locale("sl", "SI")),
    NORTHERN_SAMI("Davvisámegiella", "sme", new Locale("sme")), // Sápmi
    SERBIAN("Српски", "sr_SP", new Locale("sr", "SP")),
    SWEDISH("Svenska", "sv_SE", new Locale("sv", "SE")),
    THAI("Svenska", "th_TH", new Locale("th", "TH")),
    FILLIPINO("Filipino", "tl_PH", new Locale("tl", "PH")),
    KLINGON("tlhIngan Hol", "tlh_AA", new Locale("tlh", "AA")), // Constructed language (Star Trek: the Klingon Empire)
    TURKISH("Türkçe", "tr_TR", new Locale("tr", "TR")),
    UKRAINIAN("Українська", "uk_UA", new Locale("uk", "UA")),
    VALENCIAN("Valencià", "ca-val_ES", new Locale("ca-val", "ES")), // Spain.
    VIETNAMESE("Tiếng Việt", "vi_VN", new Locale("vi", "VN")),
    CHINESE_SIMPLIFIED("简体中文", "zh_CN", new Locale("zh", "CH")), // China, Singapore
    CHINESE_TRADITIONAL("繁體中文", "zh_TW", new Locale("zh", "TW")); // Taiwan, Hong Kong, Macau


    private String name;
    private String code;
    private Locale locale;

    MinecraftLocale(String name, String code, Locale locale)
    {
        this.name = name;
        this.code = code;
        this.locale = locale;
    }


    public String getName()
    {
        return this.name;
    }


    @Override
    public String toString()
    {
        return this.name;
    }


    public String getCode()
    {
        return this.code;
    }


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
        MinecraftLocale locale = null;

        for (MinecraftLocale minecraftLocale : MinecraftLocale.values())
        {
            if(minecraftLocale.getCode().equals(languageTag))
            {
                locale = minecraftLocale;
            }
        }

        return locale;
    }


    public static MinecraftLocale getDefault()
    {
        return NinCore.getImplementation().getDefaultMinecraftLocale();
    }

    public static void setDefault(MinecraftLocale minecraftLocale)
    {
        NinCore.getImplementation().setDefaultMinecraftLocale(minecraftLocale);
    }
}