package qa.qcri.aidr.trainer.pybossa.impl;

/**
 * Created with IntelliJ IDEA.
 * User: jlucas
 * Date: 10/18/13
 * Time: 2:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class MicromapperInput {

    private String tweetID;
    private String tweet;
    private String author;
    private String lat;
    private String lng;
    private String url;
    private String created;

    public MicromapperInput(){

    }

    public MicromapperInput(String tweetID, String tweet, String author, String lat, String lng , String url, String created){
        this.tweetID = tweetID;
        this.tweet = tweet;
        this.author = author;
        this.lat = lat;
        this.lng = lng;
        this.url = url;
        this.created = created;
    }

    public String getTweetID() {
        return tweetID;
    }

    public void setTweetID(String tweetID) {
        this.tweetID = tweetID;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }


}
