
package ch01;

public class TicketTime 
{
   
    public String movie_name;
    public int Ticket_no;
    public int hall_no;
    public String date;
    public String start_time;
    public String hall_type;
    public int price;

    public TicketTime(String movie_name,int genre,int length,String date,String start_time,String h,int t) {
        this.movie_name = movie_name;
        this.Ticket_no = genre;
        this.hall_no = length;
        this.date=date;
        this.start_time=start_time;
        this.hall_type=h;
        this.price=t;
        
    }
}
