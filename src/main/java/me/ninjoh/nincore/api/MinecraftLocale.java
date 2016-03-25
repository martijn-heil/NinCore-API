package me.ninjoh.nincore.api;

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
    FINNISH("Suomi", new Locale("fi", "FI")),
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
    ITALIAN("Italiano", new Locale("it", "IT")),
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
     * @param name   The name of the language in it's own language. (e.g Français)
     * @param locale The related {@link Locale}
     */
    MinecraftLocale(String name, Locale locale)
    {
        this.name = name;
        this.locale = locale;
    }


    /**
     * Returns a string representation of this <code>Locale</code>
     * object, consisting of language, country, variant, script,
     * and extensions as below:
     * <blockquote>
     * language + "_" + country + "_" + (variant + "_#" | "#") + script + "-" + extensions
     * </blockquote>
     * <p>
     * Language is always lower case, country is always upper case, script is always title
     * case, and extensions are always lower case.  Extensions and private use subtags
     * will be in canonical order as explained in {@link #toLanguageTag}.
     * <p>
     * <p>When the locale has neither script nor extensions, the result is the same as in
     * Java 6 and prior.
     * <p>
     * <p>If both the language and country fields are missing, this function will return
     * the empty string, even if the variant, script, or extensions field is present (you
     * can't have a locale with just a variant, the variant must accompany a well-formed
     * language or country code).
     * <p>
     * <p>If script or extensions are present and variant is missing, no underscore is
     * added before the "#".
     * <p>
     * <p>This behavior is designed to support debugging and to be compatible with
     * previous uses of <code>toString</code> that expected language, country, and variant
     * fields only.  To represent a Locale as a String for interchange purposes, use
     * {@link #toLanguageTag}.
     * <p>
     * <p>Examples: <ul>
     * <li><tt>en</tt></li>
     * <li><tt>de_DE</tt></li>
     * <li><tt>_GB</tt></li>
     * <li><tt>en_US_WIN</tt></li>
     * <li><tt>de__POSIX</tt></li>
     * <li><tt>zh_CN_#Hans</tt></li>
     * <li><tt>zh_TW_#Hant-x-java</tt></li>
     * <li><tt>th_TH_TH_#u-nu-thai</tt></li></ul>
     *
     * @return A string representation of the Locale, for debugging.
     * @see #getDisplayName
     * @see #toLanguageTag
     */
    @Override
    public String toString()
    {
        return locale.toString();
    }


    /**
     * Returns a list of all 2-letter country codes defined in ISO 3166.
     * Can be used to create Locales.
     * <p>
     * <b>Note:</b> The <code>Locale</code> class also supports other codes for
     * country (region), such as 3-letter numeric UN M.49 area codes.
     * Therefore, the list returned by this method does not contain ALL valid
     * codes that can be used to create Locales.
     *
     * @return An array of ISO 3166 two-letter country codes.
     */
    public static String[] getISOCountries()
    {
        return Locale.getISOCountries();
    }


    /**
     * Returns a name for the locale's country that is appropriate for display to the
     * user.
     * If possible, the name returned will be localized according to inLocale.
     * For example, if the locale is fr_FR and inLocale
     * is en_US, getDisplayCountry() will return "France"; if the locale is en_US and
     * inLocale is fr_FR, getDisplayCountry() will return "Etats-Unis".
     * If the name returned cannot be localized according to inLocale.
     * (say, we don't have a Japanese name for Croatia),
     * this function falls back on the English name, and finally
     * on the ISO code as a last-resort value.  If the locale doesn't specify a country,
     * this function returns the empty string.
     *
     * @param inLocale The locale for which to retrieve the display country.
     * @return The name of the country appropriate to the given locale.
     * @throws NullPointerException if <code>inLocale</code> is <code>null</code>
     */
    public String getDisplayCountry(Locale inLocale)
    {
        return locale.getDisplayCountry(inLocale);
    }


    /**
     * Returns the language code of this Locale.
     * <p>
     * <p><b>Note:</b> ISO 639 is not a stable standard&mdash; some languages' codes have changed.
     * Locale's constructor recognizes both the new and the old codes for the languages
     * whose codes have changed, but this function always returns the old code.  If you
     * want to check for a specific language whose code has changed, don't do
     * <pre>
     * if (locale.getLanguage().equals("he")) // BAD!
     *    ...
     * </pre>
     * Instead, do
     * <pre>
     * if (locale.getLanguage().equals(new Locale("he").getLanguage()))
     *    ...
     * </pre>
     *
     * @return The language code, or the empty string if none is defined.
     * @see #getDisplayLanguage
     */
    public String getLanguage()
    {
        return locale.getLanguage();
    }


    /**
     * Returns the set of Unicode locale keys defined by this locale, or the empty set if
     * this locale has none.  The returned set is immutable.  Keys are all lower case.
     *
     * @return The set of Unicode locale keys, or the empty set if this locale has
     * no Unicode locale keywords.
     * @since 1.7
     */
    public Set<String> getUnicodeLocaleKeys()
    {
        return locale.getUnicodeLocaleKeys();
    }


    /**
     * Returns a three-letter abbreviation for this locale's country.
     * If the country matches an ISO 3166-1 alpha-2 code, the
     * corresponding ISO 3166-1 alpha-3 uppercase code is returned.
     * If the locale doesn't specify a country, this will be the empty
     * string.
     * <p>
     * <p>The ISO 3166-1 codes can be found on-line.
     *
     * @return A three-letter abbreviation of this locale's country.
     * @throws MissingResourceException Throws MissingResourceException if the
     *                                  three-letter country abbreviation is not available for this locale.
     */
    public String getISO3Country() throws MissingResourceException
    {
        return locale.getISO3Country();
    }


    /**
     * Returns {@code true} if this {@code Locale} has any <a href="#def_extensions">
     * extensions</a>.
     *
     * @return {@code true} if this {@code Locale} has any extensions
     * @since 1.8
     */
    public boolean hasExtensions()
    {
        return locale.hasExtensions();
    }


    /**
     * Returns a name for the locale's language that is appropriate for display to the
     * user.
     * If possible, the name returned will be localized for the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale.
     * For example, if the locale is fr_FR and the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale
     * is en_US, getDisplayLanguage() will return "French"; if the locale is en_US and
     * the default {@link Locale.Category#DISPLAY DISPLAY} locale is fr_FR,
     * getDisplayLanguage() will return "anglais".
     * If the name returned cannot be localized for the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale,
     * (say, we don't have a Japanese name for Croatian),
     * this function falls back on the English name, and uses the ISO code as a last-resort
     * value.  If the locale doesn't specify a language, this function returns the empty string.
     *
     * @return The name of the display language.
     */
    public String getDisplayLanguage()
    {
        return locale.getDisplayLanguage();
    }


    /**
     * Returns the extension (or private use) value associated with
     * the specified key, or null if there is no extension
     * associated with the key. To be well-formed, the key must be one
     * of <code>[0-9A-Za-z]</code>. Keys are case-insensitive, so
     * for example 'z' and 'Z' represent the same extension.
     *
     * @param key the extension key
     * @return The extension, or null if this locale defines no
     * extension for the specified key.
     * @throws IllegalArgumentException if key is not well-formed
     * @since 1.7
     */
    public String getExtension(char key)
    {
        return locale.getExtension(key);
    }


    /**
     * Returns a name for the locale's variant code that is appropriate for display to the
     * user.  If possible, the name will be localized for the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale.  If the locale
     * doesn't specify a variant code, this function returns the empty string.
     *
     * @return The name of the display variant code appropriate to the locale.
     */
    public String getDisplayVariant()
    {
        return locale.getDisplayVariant();
    }


    /**
     * Returns a three-letter abbreviation of this locale's language.
     * If the language matches an ISO 639-1 two-letter code, the
     * corresponding ISO 639-2/T three-letter lowercase code is
     * returned.  The ISO 639-2 language codes can be found on-line,
     * see "Codes for the Representation of Names of Languages Part 2:
     * Alpha-3 Code".  If the locale specifies a three-letter
     * language, the language is returned as is.  If the locale does
     * not specify a language the empty string is returned.
     *
     * @return A three-letter abbreviation of this locale's language.
     * @throws MissingResourceException Throws MissingResourceException if
     *                                  three-letter language abbreviation is not available for this locale.
     */
    public String getISO3Language() throws MissingResourceException
    {
        return locale.getISO3Language();
    }


    /**
     * Returns the Unicode locale type associated with the specified Unicode locale key
     * for this locale. Returns the empty string for keys that are defined with no type.
     * Returns null if the key is not defined. Keys are case-insensitive. The key must
     * be two alphanumeric characters ([0-9a-zA-Z]), or an IllegalArgumentException is
     * thrown.
     *
     * @param key the Unicode locale key
     * @return The Unicode locale type associated with the key, or null if the
     * locale does not define the key.
     * @throws IllegalArgumentException if the key is not well-formed
     * @throws NullPointerException     if <code>key</code> is null
     * @since 1.7
     */
    public String getUnicodeLocaleType(String key)
    {
        return locale.getUnicodeLocaleType(key);
    }


    /**
     * Returns a name for the locale's script that is appropriate
     * for display to the user. If possible, the name will be
     * localized for the given locale. Returns the empty string if
     * this locale doesn't specify a script code.
     *
     * @param inLocale The locale for which to retrieve the display script.
     * @return the display name of the script code for the current default
     * {@link Locale.Category#DISPLAY DISPLAY} locale
     * @throws NullPointerException if <code>inLocale</code> is <code>null</code>
     * @since 1.7
     */
    public String getDisplayScript(Locale inLocale)
    {
        return locale.getDisplayScript(inLocale);
    }


    /**
     * Returns a copy of this {@code Locale} with no <a href="#def_extensions">
     * extensions</a>. If this {@code Locale} has no extensions, this {@code Locale}
     * is returned.
     *
     * @return a copy of this {@code Locale} with no extensions, or {@code this}
     * if {@code this} has no extensions
     * @since 1.8
     */
    public Locale stripExtensions()
    {
        return locale.stripExtensions();
    }


    /**
     * Returns the script for this locale, which should
     * either be the empty string or an ISO 15924 4-letter script
     * code. The first letter is uppercase and the rest are
     * lowercase, for example, 'Latn', 'Cyrl'.
     *
     * @return The script code, or the empty string if none is defined.
     * @see #getDisplayScript
     * @since 1.7
     */
    public String getScript()
    {
        return locale.getScript();
    }


    /**
     * Returns the set of extension keys associated with this locale, or the
     * empty set if it has no extensions. The returned set is unmodifiable.
     * The keys will all be lower-case.
     *
     * @return The set of extension keys, or the empty set if this locale has
     * no extensions.
     * @since 1.7
     */
    public Set<Character> getExtensionKeys()
    {
        return locale.getExtensionKeys();
    }


    /**
     * Returns a name for the locale that is appropriate for display
     * to the user.  This will be the values returned by
     * getDisplayLanguage(), getDisplayScript(),getDisplayCountry(),
     * and getDisplayVariant() assembled into a single string.
     * The non-empty values are used in order,
     * with the second and subsequent names in parentheses.  For example:
     * <blockquote>
     * language (script, country, variant)<br>
     * language (country)<br>
     * language (variant)<br>
     * script (country)<br>
     * country<br>
     * </blockquote>
     * depending on which fields are specified in the locale.  If the
     * language, script, country, and variant fields are all empty,
     * this function returns the empty string.
     *
     * @param inLocale The locale for which to retrieve the display name.
     * @return The name of the locale appropriate to display.
     * @throws NullPointerException if <code>inLocale</code> is <code>null</code>
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
     * Returns a well-formed IETF BCP 47 language tag representing
     * this locale.
     * <p>
     * <p>If this <code>Locale</code> has a language, country, or
     * variant that does not satisfy the IETF BCP 47 language tag
     * syntax requirements, this method handles these fields as
     * described below:
     * <p>
     * <p><b>Language:</b> If language is empty, or not <a
     * href="#def_language" >well-formed</a> (for example "a" or
     * "e2"), it will be emitted as "und" (Undetermined).
     * <p>
     * <p><b>Country:</b> If country is not <a
     * href="#def_region">well-formed</a> (for example "12" or "USA"),
     * it will be omitted.
     * <p>
     * <p><b>Variant:</b> If variant <b>is</b> <a
     * href="#def_variant">well-formed</a>, each sub-segment
     * (delimited by '-' or '_') is emitted as a subtag.  Otherwise:
     * <ul>
     * <p>
     * <li>if all sub-segments match <code>[0-9a-zA-Z]{1,8}</code>
     * (for example "WIN" or "Oracle_JDK_Standard_Edition"), the first
     * ill-formed sub-segment and all following will be appended to
     * the private use subtag.  The first appended subtag will be
     * "lvariant", followed by the sub-segments in order, separated by
     * hyphen. For example, "x-lvariant-WIN",
     * "Oracle-x-lvariant-JDK-Standard-Edition".
     * <p>
     * <li>if any sub-segment does not match
     * <code>[0-9a-zA-Z]{1,8}</code>, the variant will be truncated
     * and the problematic sub-segment and all following sub-segments
     * will be omitted.  If the remainder is non-empty, it will be
     * emitted as a private use subtag as above (even if the remainder
     * turns out to be well-formed).  For example,
     * "Solaris_isjustthecoolestthing" is emitted as
     * "x-lvariant-Solaris", not as "solaris".</li></ul>
     * <p>
     * <p><b>Special Conversions:</b> Java supports some old locale
     * representations, including deprecated ISO language codes,
     * for compatibility. This method performs the following
     * conversions:
     * <ul>
     * <p>
     * <li>Deprecated ISO language codes "iw", "ji", and "in" are
     * converted to "he", "yi", and "id", respectively.
     * <p>
     * <li>A locale with language "no", country "NO", and variant
     * "NY", representing Norwegian Nynorsk (Norway), is converted
     * to a language tag "nn-NO".</li></ul>
     * <p>
     * <p><b>Note:</b> Although the language tag created by this
     * method is well-formed (satisfies the syntax requirements
     * defined by the IETF BCP 47 specification), it is not
     * necessarily a valid BCP 47 language tag.  For example,
     * <pre>
     *   new Locale("xx", "YY").toLanguageTag();</pre>
     * <p>
     * will return "xx-YY", but the language subtag "xx" and the
     * region subtag "YY" are invalid because they are not registered
     * in the IANA Language Subtag Registry.
     *
     * @return a BCP47 language tag representing the locale
     * @since 1.7
     */
    public String toLanguageTag()
    {
        return locale.toLanguageTag();
    }


    /**
     * Returns a name for the the locale's script that is appropriate for display to
     * the user. If possible, the name will be localized for the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale.  Returns
     * the empty string if this locale doesn't specify a script code.
     *
     * @return the display name of the script code for the current default
     * {@link Locale.Category#DISPLAY DISPLAY} locale
     * @since 1.7
     */
    public String getDisplayScript()
    {
        return locale.getDisplayScript();
    }


    /**
     * Returns a list of all 2-letter language codes defined in ISO 639.
     * Can be used to create Locales.
     * <p>
     * <b>Note:</b>
     * <ul>
     * <li>ISO 639 is not a stable standard&mdash; some languages' codes have changed.
     * The list this function returns includes both the new and the old codes for the
     * languages whose codes have changed.
     * <li>The <code>Locale</code> class also supports language codes up to
     * 8 characters in length.  Therefore, the list returned by this method does
     * not contain ALL valid codes that can be used to create Locales.
     * </ul>
     *
     * @return Am array of ISO 639 two-letter language codes.
     */
    public static String[] getISOLanguages()
    {
        return Locale.getISOLanguages();
    }


    /**
     * Returns a name for the locale's language that is appropriate for display to the
     * user.
     * If possible, the name returned will be localized according to inLocale.
     * For example, if the locale is fr_FR and inLocale
     * is en_US, getDisplayLanguage() will return "French"; if the locale is en_US and
     * inLocale is fr_FR, getDisplayLanguage() will return "anglais".
     * If the name returned cannot be localized according to inLocale,
     * (say, we don't have a Japanese name for Croatian),
     * this function falls back on the English name, and finally
     * on the ISO code as a last-resort value.  If the locale doesn't specify a language,
     * this function returns the empty string.
     *
     * @param inLocale The locale for which to retrieve the display language.
     * @return The name of the display language appropriate to the given locale.
     * @throws NullPointerException if <code>inLocale</code> is <code>null</code>
     */
    public String getDisplayLanguage(Locale inLocale)
    {
        return locale.getDisplayLanguage(inLocale);
    }


    /**
     * Returns the country/region code for this locale, which should
     * either be the empty string, an uppercase ISO 3166 2-letter code,
     * or a UN M.49 3-digit code.
     *
     * @return The country/region code, or the empty string if none is defined.
     * @see #getDisplayCountry
     */
    public String getCountry()
    {
        return locale.getCountry();
    }


    /**
     * Returns a name for the locale that is appropriate for display to the
     * user. This will be the values returned by getDisplayLanguage(),
     * getDisplayScript(), getDisplayCountry(), and getDisplayVariant() assembled
     * into a single string. The the non-empty values are used in order,
     * with the second and subsequent names in parentheses.  For example:
     * <blockquote>
     * language (script, country, variant)<br>
     * language (country)<br>
     * language (variant)<br>
     * script (country)<br>
     * country<br>
     * </blockquote>
     * depending on which fields are specified in the locale.  If the
     * language, script, country, and variant fields are all empty,
     * this function returns the empty string.
     *
     * @return The name of the locale appropriate to display.
     */
    public String getDisplayName()
    {
        return locale.getDisplayName();
    }


    /**
     * Returns the variant code for this locale.
     *
     * @return The variant code, or the empty string if none is defined.
     * @see #getDisplayVariant
     */
    public String getVariant()
    {
        return locale.getVariant();
    }


    /**
     * Returns the set of unicode locale attributes associated with
     * this locale, or the empty set if it has no attributes. The
     * returned set is unmodifiable.
     *
     * @return The set of attributes.
     * @since 1.7
     */
    public Set<String> getUnicodeLocaleAttributes()
    {
        return locale.getUnicodeLocaleAttributes();
    }


    /**
     * Returns a name for the locale's variant code that is appropriate for display to the
     * user.  If possible, the name will be localized for inLocale.  If the locale
     * doesn't specify a variant code, this function returns the empty string.
     *
     * @param inLocale The locale for which to retrieve the display variant code.
     * @return The name of the display variant code appropriate to the given locale.
     * @throws NullPointerException if <code>inLocale</code> is <code>null</code>
     */
    public String getDisplayVariant(Locale inLocale)
    {
        return locale.getDisplayVariant(inLocale);
    }


    /**
     * Returns a name for the locale's country that is appropriate for display to the
     * user.
     * If possible, the name returned will be localized for the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale.
     * For example, if the locale is fr_FR and the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale
     * is en_US, getDisplayCountry() will return "France"; if the locale is en_US and
     * the default {@link Locale.Category#DISPLAY DISPLAY} locale is fr_FR,
     * getDisplayCountry() will return "Etats-Unis".
     * If the name returned cannot be localized for the default
     * {@link Locale.Category#DISPLAY DISPLAY} locale,
     * (say, we don't have a Japanese name for Croatia),
     * this function falls back on the English name, and uses the ISO code as a last-resort
     * value.  If the locale doesn't specify a country, this function returns the empty string.
     *
     * @return The name of the country appropriate to the locale.
     */
    public String getDisplayCountry()
    {
        return locale.getDisplayCountry();
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
            if (minecraftLocale.toLanguageTag().equals(languageTag)) return minecraftLocale;
        }

        return null;
    }


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
    public static MinecraftLocale getDefault()
    {
        return NinCore.getImplementation().getDefaultMinecraftLocale();
    }


    public static void setDefault(MinecraftLocale minecraftLocale)
    {
        NinCore.getImplementation().setDefaultMinecraftLocale(minecraftLocale);
    }
}