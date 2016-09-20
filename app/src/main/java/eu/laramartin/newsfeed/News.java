package eu.laramartin.newsfeed;

/**
 * Created by lara on 20/9/16.
 */
public class News {

    String headline;
    String author;
    String url;
    String date;
    String section;

    public News(String headline, String author, String url, String date, String section) {
        this.headline = headline;
        this.author = author;
        this.url = url;
        this.date = date;
        this.section = section;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "News{" +
                "headline='" + headline + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
