public class Album {
    private String artist;
    private String albumName;
    private int total; 
    private int rent;
    
    public Album(String artist, String albumName, int total, int rent) {
        this.artist = artist;
        this.albumName = albumName;
        this.total = total;
        this.rent = rent;
    }
    
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getTotal() {
        return total;
    }
    public String getAlbumName() {
        return albumName;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
}