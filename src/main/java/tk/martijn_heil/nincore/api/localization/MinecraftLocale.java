package tk.martijn_heil.nincore.api.localization;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tk.martijn_heil.nincore.api.NinCore;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;

/**
 * This enum represents all the available languages in the Minecraft client.
 */
public enum MinecraftLocale
{
    AFRIKAANS("Afrikaans", new Locale("af", "ZA")), // Official language in South Africa.
    ARABIC("اللغة العربية", new Locale("ar", "SA")),
    ASTURIAN("Asturianu", new Locale("ast", "ES")), // One of the official languages in Spain.
    AZERBAIJANI("Azerbaijani", new Locale("az", "AZ")), // Official language in Azerbaijan, Dagestan.
    BELARUSIAN("TODO", new Locale("be", "BY")),
    BULGARIAN("Български", new Locale("bg", "BG")),
    BRETON("Brezhoneg", new Locale("br_FR")),
    CATALAN("Català", new Locale("ca", "ES")), // Official language in Spain (Catalonia) & Andorra.
    CZECH("Čeština", new Locale("cs", "CZ")),
    WELSH("Cymraeg", new Locale("cy", "GB")), // Official language in Wales.
    DANISH("Dansk", new Locale("da", "DK")),
    GERMAN("Deutsch", new Locale("de", "DE")),
    GREEK("Ελληνικά", new Locale("el", "GR")),
    AUSTRALIAN_ENGLISH("Australian English", new Locale("en", "AU")),
    CANADIAN_ENGLISH("Canadian English", new Locale("en", "CA")),
    BRITISH_ENGLISH("English (UK)", new Locale("en", "GB")),
    NEW_ZEALAND_ENGLISH("New Zealand English", new Locale("en_NZ")),
    ENGLISH_UPSIDE_DOWN("English (upside down)", new Locale("en", "GB")),
    PIRATE_ENGLISH("Pirate Speak", new Locale("en", "PT")), // Mojang joke / Minecraft easter egg.
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
    FINNISH("Suomi", new Locale("fi", "FI")),
    FAROESE("TODO", new Locale("fo_FO")),
    FRENCH("Français (Fr)", new Locale("fr", "FR")),
    CANADIAN_FRENCH("Français (Ca)", new Locale("fr", "CA")),
    FRISIAN("Frysk", new Locale("fy", "NL")),
    IRISH("Gaeilge", new Locale("ga", "IE")),
    SCOTTISH_GAELIC("Gàdhlig", new Locale("gd", "GB")),
    GALICIAN("Galician", new Locale("gl", "ES")), // Galicia (Spain)
    MANX("Gaelg", new Locale("gv", "IM")), // Isle of Man
    HEBREW("עברית", new Locale("he", "IL")), // Israel
    HINDI("हिन्दी", new Locale("hi", "IN")), // India
    CROATIAN("Hrvatski", new Locale("hr", "HR")),
    HUNGARIAN("Magyar", new Locale("hu", "HU")),
    ARMENIAN("Armenian", new Locale("hy", "AM")), // Armenian country name doesn't work with UTF-8 I think?
    INDONESIAN("Bahasa Indonesia", new Locale("id", "ID")),
    ICELANDIC("Íslenska", new Locale("is", "IS")),
    ITALIAN("Italiano", new Locale("it", "IT")),
    JAPANESE("日本語", new Locale("ja", "JP")),
    LOJBAN("la .lojban.", new Locale("jbo", "EN")),
    GEORGIAN("ქართული", new Locale("ka", "GE")),
    KOREAN("한국어", new Locale("ko", "KR")), // North Korea and South Korea
    RIPUARIAN("Kölsch/Ripoarisch", new Locale("ksh_DE")),
    CORNWALL("Kernowek", new Locale("kw", "GB")), // Cornwall
    LATIN("Lingua Latina", new Locale("la", "VA")),
    LUXEMBOURGISH("Lëtzebuergesch", new Locale("lb", "LU")),
    LIMBURGISH("Limburgs", new Locale("li", "LI")),
    LOLCAT("LOLCAT", new Locale("lol", "US")),
    LITHUANIAN("Lietuvių", new Locale("lt", "LT")), // Lithuania
    LATVIAN("Latviešu", new Locale("lv", "LV")), // Latvia
    MAORI("Te Reo Māori", new Locale("mi", "NZ")), // Aotearoa
    MACEDONIAN("TODO", new Locale("mk", "MK")),
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
    SOMALI("Af-Soomaali", new Locale("so", "SO")),
    ALBANIAN("Shquip", new Locale("sq_AL")),
    SERBIAN("Српски", new Locale("sr", "SP")),
    SWEDISH("Svenska", new Locale("sv", "SE")),
    THAI("Svenska", new Locale("th", "TH")),
    FILLIPINO("Filipino", new Locale("tl", "PH")),
    KLINGON("tlhIngan Hol", new Locale("tlh", "AA")), // Constructed language (Star Trek: the Klingon Empire)
    TURKISH("Türkçe", new Locale("tr", "TR")),
    TALOSSAN("Talossan", new Locale("tzl", "TZL")), // Constructed language
    UKRAINIAN("Українська", new Locale("uk", "UA")),
    VALENCIAN("Valencià", new Locale("ca-val", "ES")), // Spain.
    VIETNAMESE("Tiếng Việt", new Locale("vi", "VN")),
    CHINESE_SIMPLIFIED("简体中文", new Locale("zh", "CH")), // China, Singapore
    CHINESE_TRADITIONAL("繁體中文", new Locale("zh", "TW")); // Taiwan, Hong Kong, Macau


    private String name;
    private Locale locale;


    /**
     * @param name   The name of the language in it's own language. (e.g Français)
     * @param locale The related {@link Locale}
     */
    MinecraftLocale(String name, Locale locale)
    {
        this.name = name;
        this.locale = locale;
    }


    /**
     * @see Locale#toString()
     */
    @NotNull
    @Override
    public String toString()
    {
        return locale.toString();
    }


    /**
     * @see Locale#getISOCountries()
     */
    @NotNull
    public static String[] getISOCountries()
    {
        return Locale.getISOCountries();
    }


    /**
     * @see Locale#getDisplayCountry()
     */
    @Contract("null -> !null")
    public String getDisplayCountry(Locale inLocale)
    {
        return locale.getDisplayCountry(inLocale);
    }


    /**
     * @see Locale#getLanguage()
     */
    @Contract(pure = true)
    public String getLanguage()
    {
        return locale.getLanguage();
    }


    /**
     * @see Locale#getUnicodeLocaleKeys()
     */
    public Set<String> getUnicodeLocaleKeys()
    {
        return locale.getUnicodeLocaleKeys();
    }


    /**
     * @see Locale#getISO3Country()
     */
    public String getISO3Country() throws MissingResourceException
    {
        return locale.getISO3Country();
    }


    /**
     * @see Locale#getDisplayLanguage()
     */
    public String getDisplayLanguage()
    {
        return locale.getDisplayLanguage();
    }


    /**
     * @see Locale#getExtension(char)
     */
    public String getExtension(char key)
    {
        return locale.getExtension(key);
    }


    /**
     * @see Locale#getDisplayVariant()
     */
    public String getDisplayVariant()
    {
        return locale.getDisplayVariant();
    }


    /**
     * @see Locale#getISO3Language()
     */
    public String getISO3Language() throws MissingResourceException
    {
        return locale.getISO3Language();
    }


    /**
     * @see Locale#getUnicodeLocaleType(String)
     */
    public String getUnicodeLocaleType(String key)
    {
        return locale.getUnicodeLocaleType(key);
    }


    /**
     * @see Locale#getDisplayScript(Locale)
     */
    @Contract("null -> !null")
    public String getDisplayScript(Locale inLocale)
    {
        return locale.getDisplayScript(inLocale);
    }


    /**
     * @see Locale#getScript()
     */
    @Contract(pure = true)
    public String getScript()
    {
        return locale.getScript();
    }


    /**
     * @see Locale#getExtensionKeys()
     */
    public Set<Character> getExtensionKeys()
    {
        return locale.getExtensionKeys();
    }


    /**
     * @see Locale#getDisplayName(Locale)
     */
    public String getDisplayName(Locale inLocale)
    {
        return locale.getDisplayName(inLocale);
    }


    public String getDisplayName(MinecraftLocale inLocale)
    {
        return locale.getDisplayName(inLocale.toLocale());
    }


    /**
     * @see Locale#toLanguageTag()
     */
    public String toLanguageTag()
    {
        return locale.toLanguageTag();
    }


    /**
     * @see Locale#getDisplayScript()
     */
    public String getDisplayScript()
    {
        return locale.getDisplayScript();
    }


    /**
     * @see Locale#getISOLanguages()
     */
    @NotNull
    public static String[] getISOLanguages()
    {
        return Locale.getISOLanguages();
    }


    /**
     * @see Locale#getDisplayLanguage()
     */
    @Contract("null -> !null")
    public String getDisplayLanguage(Locale inLocale)
    {
        return locale.getDisplayLanguage(inLocale);
    }


    /**
     * @see Locale#getCountry()
     */
    @Contract(pure = true)
    public String getCountry()
    {
        return locale.getCountry();
    }


    /**
     * @see Locale#getDisplayName()
     */
    public String getDisplayName()
    {
        return locale.getDisplayName();
    }


    /**
     * @see Locale#getVariant()
     */
    @Contract(pure = true)
    public String getVariant()
    {
        return locale.getVariant();
    }


    /**
     * @see Locale#getUnicodeLocaleAttributes()
     */
    public Set<String> getUnicodeLocaleAttributes()
    {
        return locale.getUnicodeLocaleAttributes();
    }


    /**
     * @see Locale#getDisplayVariant(Locale)
     */
    public String getDisplayVariant(Locale inLocale)
    {
        return locale.getDisplayVariant(inLocale);
    }


    /**
     * @see Locale#getDisplayCountry()
     */
    public String getDisplayCountry()
    {
        return locale.getDisplayCountry();
    }


    /**
     * Get the related {@link Locale}
     *
     * @return The related {@link Locale}
     */
    @Contract(pure = true)
    public Locale toLocale()
    {
        return this.locale;
    }


    /**
     * Get a {@link MinecraftLocale} from it's language languageTag.
     * Returns null if no {@link MinecraftLocale} with the provided language languageTag could be found.
     *
     * @param languageTag The language languageTag to query for.
     * @return The {@link MinecraftLocale} if a {@link MinecraftLocale} was found, else it returns null.
     */
    // One can not override valueOf(), so use this.
    @Nullable
    public static MinecraftLocale fromLanguageTag(String languageTag)
    {
        for (MinecraftLocale minecraftLocale : MinecraftLocale.values())
        {
            if (minecraftLocale.toLanguageTag().equals(languageTag.replace('_', '-'))) return minecraftLocale;
        }

        return null;
    }


    @Nullable
    public static MinecraftLocale fromLocale(Locale locale)
    {
        for (MinecraftLocale minecraftLocale : MinecraftLocale.values())
        {
            if (minecraftLocale.toLocale().equals(locale)) return minecraftLocale;
        }

        return null;
    }


    /**
     * Get the default {@link MinecraftLocale}.
     *
     * @return The default {@link MinecraftLocale}.
     */
    @NotNull
    public static MinecraftLocale getDefault()
    {
        return NinCore.get().getLocalizationManager().getDefaultMinecraftLocale();
    }


    public static void setDefault(MinecraftLocale minecraftLocale)
    {
        NinCore.get().getLocalizationManager().setDefaultMinecraftLocale(minecraftLocale);
    }
}