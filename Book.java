public class book{
    private String title;
    private String author;
    private int year;
    private int pages;
    private String color;
    private boolean isHardCover = true; 

    // Creating setter methods
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }

    // Creating getter methods
    public int getYear(){
        return year;
    }
    public String getAuthor(){
        return author;
    } 
    
}