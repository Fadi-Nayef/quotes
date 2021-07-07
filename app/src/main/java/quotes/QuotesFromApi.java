package quotes;

public class QuotesFromApi {
    private String text;
    private String author;

    public QuotesFromApi (String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "quoteText='" + text + '\'' +
                ", quoteAuthor='" + author + '\'' +
                '}';
    }
}
