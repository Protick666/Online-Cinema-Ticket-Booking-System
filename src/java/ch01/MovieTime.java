
package ch01;

public class MovieTime 
{
   
    public String movie_name;
    public String genre;
    public int length;
    public String date;
    public String start_time;
    public String hall_type;
    public int price;

    public MovieTime(String movie_name,String genre,int length,String date,String start_time,String h,int t) {
        this.movie_name = movie_name;
        this.genre = genre;
        this.length = length;
        this.date=date;
        this.start_time=start_time;
        this.hall_type=h;
        this.price=t;
        
    }
}
