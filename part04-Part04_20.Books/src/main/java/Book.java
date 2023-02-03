public class Book {
    private String book1;
    private String pages;
    private String year;

    public Book (String kniha, String strany, String rok) {
        this.book1=kniha;
        this.pages=strany;
        this.year=rok;
    }
    public String getEverything () {
        return this.book1 + ", " + this.pages + " pages, " + this.year;
    }

    public String getBook () {
        return this.book1;
    }
}
