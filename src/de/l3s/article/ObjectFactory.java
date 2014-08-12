//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 07:25:57 PM CEST 
//


package de.l3s.article;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.l3s.article package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewsDesk_QNAME = new QName("", "news_desk");
    private final static QName _Lastname_QNAME = new QName("", "lastname");
    private final static QName _Snippet_QNAME = new QName("", "snippet");
    private final static QName _TypeOfMaterial_QNAME = new QName("", "type_of_material");
    private final static QName _Kicker_QNAME = new QName("", "kicker");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _SectionName_QNAME = new QName("", "section_name");
    private final static QName _DocumentType_QNAME = new QName("", "document_type");
    private final static QName _Xlargewidth_QNAME = new QName("", "xlargewidth");
    private final static QName _Time_QNAME = new QName("", "time");
    private final static QName _Rank_QNAME = new QName("", "rank");
    private final static QName _SubsectionName_QNAME = new QName("", "subsection_name");
    private final static QName _Height_QNAME = new QName("", "height");
    private final static QName _Id_QNAME = new QName("", "_id");
    private final static QName _Xlargeheight_QNAME = new QName("", "xlargeheight");
    private final static QName _Contributor_QNAME = new QName("", "contributor");
    private final static QName _WordCount_QNAME = new QName("", "word_count");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Value_QNAME = new QName("", "value");
    private final static QName _IsMajor_QNAME = new QName("", "is_major");
    private final static QName _Role_QNAME = new QName("", "role");
    private final static QName _Offset_QNAME = new QName("", "offset");
    private final static QName _Xlarge_QNAME = new QName("", "xlarge");
    private final static QName _Abstract_QNAME = new QName("", "abstract");
    private final static QName _Middlename_QNAME = new QName("", "middlename");
    private final static QName _Status_QNAME = new QName("", "status");
    private final static QName _PubDate_QNAME = new QName("", "pub_date");
    private final static QName _PrintPage_QNAME = new QName("", "print_page");
    private final static QName _Wideheight_QNAME = new QName("", "wideheight");
    private final static QName _Width_QNAME = new QName("", "width");
    private final static QName _WebUrl_QNAME = new QName("", "web_url");
    private final static QName _Copyright_QNAME = new QName("", "copyright");
    private final static QName _Firstname_QNAME = new QName("", "firstname");
    private final static QName _Wide_QNAME = new QName("", "wide");
    private final static QName _Url_QNAME = new QName("", "url");
    private final static QName _Thumbnailwidth_QNAME = new QName("", "thumbnailwidth");
    private final static QName _Main_QNAME = new QName("", "main");
    private final static QName _Hits_QNAME = new QName("", "hits");
    private final static QName _Thumbnail_QNAME = new QName("", "thumbnail");
    private final static QName _Source_QNAME = new QName("", "source");
    private final static QName _LeadParagraph_QNAME = new QName("", "lead_paragraph");
    private final static QName _Subtype_QNAME = new QName("", "subtype");
    private final static QName _Original_QNAME = new QName("", "original");
    private final static QName _Seo_QNAME = new QName("", "seo");
    private final static QName _PrintHeadline_QNAME = new QName("", "print_headline");
    private final static QName _ContentKicker_QNAME = new QName("", "content_kicker");
    private final static QName _Widewidth_QNAME = new QName("", "widewidth");
    private final static QName _Thumbnailheight_QNAME = new QName("", "thumbnailheight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.l3s.article
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Docs }
     * 
     */
    public Docs createDocs() {
        return new Docs();
    }

    /**
     * Create an instance of {@link Multimedia }
     * 
     */
    public Multimedia createMultimedia() {
        return new Multimedia();
    }

    /**
     * Create an instance of {@link Legacy }
     * 
     */
    public Legacy createLegacy() {
        return new Legacy();
    }

    /**
     * Create an instance of {@link Headline }
     * 
     */
    public Headline createHeadline() {
        return new Headline();
    }

    /**
     * Create an instance of {@link Keywords }
     * 
     */
    public Keywords createKeywords() {
        return new Keywords();
    }

    /**
     * Create an instance of {@link Byline }
     * 
     */
    public Byline createByline() {
        return new Byline();
    }

    /**
     * Create an instance of {@link NyResults }
     * 
     */
    public NyResults createNyResults() {
        return new NyResults();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Meta }
     * 
     */
    public Meta createMeta() {
        return new Meta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "news_desk")
    public JAXBElement<String> createNewsDesk(String value) {
        return new JAXBElement<String>(_NewsDesk_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLastname(String value) {
        return new JAXBElement<String>(_Lastname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snippet")
    public JAXBElement<String> createSnippet(String value) {
        return new JAXBElement<String>(_Snippet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type_of_material")
    public JAXBElement<String> createTypeOfMaterial(String value) {
        return new JAXBElement<String>(_TypeOfMaterial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kicker")
    public JAXBElement<String> createKicker(String value) {
        return new JAXBElement<String>(_Kicker_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "section_name")
    public JAXBElement<String> createSectionName(String value) {
        return new JAXBElement<String>(_SectionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "document_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xlargewidth")
    public JAXBElement<BigInteger> createXlargewidth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Xlargewidth_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time")
    public JAXBElement<BigInteger> createTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_Time_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rank")
    public JAXBElement<BigInteger> createRank(BigInteger value) {
        return new JAXBElement<BigInteger>(_Rank_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subsection_name")
    public JAXBElement<String> createSubsectionName(String value) {
        return new JAXBElement<String>(_SubsectionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "height")
    public JAXBElement<BigInteger> createHeight(BigInteger value) {
        return new JAXBElement<BigInteger>(_Height_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "_id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xlargeheight")
    public JAXBElement<BigInteger> createXlargeheight(BigInteger value) {
        return new JAXBElement<BigInteger>(_Xlargeheight_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contributor")
    public JAXBElement<String> createContributor(String value) {
        return new JAXBElement<String>(_Contributor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "word_count")
    public JAXBElement<String> createWordCount(String value) {
        return new JAXBElement<String>(_WordCount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is_major")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIsMajor(String value) {
        return new JAXBElement<String>(_IsMajor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "role")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRole(String value) {
        return new JAXBElement<String>(_Role_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "offset")
    public JAXBElement<BigInteger> createOffset(BigInteger value) {
        return new JAXBElement<BigInteger>(_Offset_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xlarge")
    public JAXBElement<String> createXlarge(String value) {
        return new JAXBElement<String>(_Xlarge_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "abstract")
    public JAXBElement<String> createAbstract(String value) {
        return new JAXBElement<String>(_Abstract_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "middlename")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMiddlename(String value) {
        return new JAXBElement<String>(_Middlename_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pub_date")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPubDate(String value) {
        return new JAXBElement<String>(_PubDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "print_page")
    public JAXBElement<String> createPrintPage(String value) {
        return new JAXBElement<String>(_PrintPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wideheight")
    public JAXBElement<BigInteger> createWideheight(BigInteger value) {
        return new JAXBElement<BigInteger>(_Wideheight_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "width")
    public JAXBElement<BigInteger> createWidth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Width_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "web_url")
    public JAXBElement<String> createWebUrl(String value) {
        return new JAXBElement<String>(_WebUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "copyright")
    public JAXBElement<String> createCopyright(String value) {
        return new JAXBElement<String>(_Copyright_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "firstname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFirstname(String value) {
        return new JAXBElement<String>(_Firstname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wide")
    public JAXBElement<String> createWide(String value) {
        return new JAXBElement<String>(_Wide_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thumbnailwidth")
    public JAXBElement<BigInteger> createThumbnailwidth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Thumbnailwidth_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "main")
    public JAXBElement<String> createMain(String value) {
        return new JAXBElement<String>(_Main_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hits")
    public JAXBElement<BigInteger> createHits(BigInteger value) {
        return new JAXBElement<BigInteger>(_Hits_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thumbnail")
    public JAXBElement<String> createThumbnail(String value) {
        return new JAXBElement<String>(_Thumbnail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lead_paragraph")
    public JAXBElement<String> createLeadParagraph(String value) {
        return new JAXBElement<String>(_LeadParagraph_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubtype(String value) {
        return new JAXBElement<String>(_Subtype_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "original")
    public JAXBElement<String> createOriginal(String value) {
        return new JAXBElement<String>(_Original_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "seo")
    public JAXBElement<String> createSeo(String value) {
        return new JAXBElement<String>(_Seo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "print_headline")
    public JAXBElement<String> createPrintHeadline(String value) {
        return new JAXBElement<String>(_PrintHeadline_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content_kicker")
    public JAXBElement<String> createContentKicker(String value) {
        return new JAXBElement<String>(_ContentKicker_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "widewidth")
    public JAXBElement<BigInteger> createWidewidth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Widewidth_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thumbnailheight")
    public JAXBElement<BigInteger> createThumbnailheight(BigInteger value) {
        return new JAXBElement<BigInteger>(_Thumbnailheight_QNAME, BigInteger.class, null, value);
    }

}
