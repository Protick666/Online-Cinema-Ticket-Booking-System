/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01;

import java.sql.CallableStatement;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import sukarna.models.BankTransaction;

/**
 *
 * @author samsung
 */
public class DataAccess 
{
    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    String username = "hr";
    String password = "hr";

    Connection conn = null;
    public DataAccess()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(dbURL, username, password);
            if(conn!=null) System.out.println("Connection successfully established.");
            else System.out.println("Could not establish connection");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public int createAccount(String firstName, String lastName, String username, 
            String password,String  email,String credit)
    {
        try
        {
            int f=1;
            try
            {
                String query = "select * from customer";
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();
                while(rs.next())
                {
                    f++;
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            String insertCommand = "insert into customer values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(insertCommand); 
            String s="u_"+f;
            stmt.setString(3, s);
            stmt.setString(4, firstName);
            stmt.setString(5, lastName);
            stmt.setString(1, username);
            stmt.setString(6, email);
            stmt.setString(2, password);
            stmt.setString(7, credit);
            int count = stmt.executeUpdate();
            System.out.println("somossa ki>"+count);
            return count;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("kbfdjbdfj");
            return 0;
        }       
    }
    
   
    public int existUser(String username,String password)
    {
        try
        {
            String query = "select * from customer where user_name=? and password=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            System.out.println("dffdkjbkjdfjkdfj");
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
                return 1;
            }
            return 0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    
    }
    public ArrayList<MovieTime> existUser(String dt)
    {
        ArrayList<MovieTime> transactions = new ArrayList<MovieTime>();
        String selectStatement="select e.movie_name,e.genre,e.length,f.start_time,f.dt,g.price,g.hall_type from show f join movie e on(f.movie_id=e.movie_id and f.dt=?) join price_listing g on (f.movie_id=g.movie_id)";
        try
        {    
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String d;
            
            Date date = null;
            try {
                date=formatter.parse(dt);
                System.out.println(dt);
            } catch (ParseException ex) {
                System.out.println("dT NOT FOUNNT");
            }
            java.sql.Date df=new java.sql.Date(date.getTime());
            System.out.print(df);
            stmt.setDate(1,df);
            //stmt.setString
            ResultSet rs = stmt.executeQuery();
            //System.out.print("jdfk");
            while(rs.next())
            {
                String a = rs.getString("movie_name");
                String b = rs.getString("genre");
                int de = rs.getInt("length");
                String c = rs.getString("dt");
                c=c.replaceAll(" 00:00:00.0","");
                String g=rs.getString("start_time");
                String j=rs.getString("hall_type");
                int k=rs.getInt("price");
                MovieTime trans = new MovieTime(a,b,de,c,g,j,k);
                System.out.println(a+" "+b+" "+de+" "+c+" "+g+" "+j+" "+k);
                transactions.add(trans);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return transactions;
    }
    
    /*public ArrayList<TicketTime> existUser(int dt)
    {
        ArrayList<MovieTime> transactions = new ArrayList<MovieTime>();
        String selectStatement="select e.movie_name,e.genre,e.length,f.start_time,f.dt,g.price,g.hall_type from movie e join show f on(e.movie_id=f.movie_id) join price_listing g on (f.show_id=g.show_id and f.dt=?)";
        try
        {    
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String d;
            
            Date date = null;
            try {
                date=formatter.parse(dt);
                System.out.println(dt);
            } catch (ParseException ex) {
                System.out.println("dT NOT FOUNNT");
            }
            java.sql.Date df=new java.sql.Date(date.getTime());
            System.out.print(df);
            stmt.setDate(1,df);
            //stmt.setString
            ResultSet rs = stmt.executeQuery();
            //System.out.print("jdfk");
            while(rs.next())
            {
                String a = rs.getString("movie_name");
                String b = rs.getString("genre");
                int de = rs.getInt("length");
                String c = rs.getString("dt");
                c=c.replaceAll(" 00:00:00.0","");
                String g=rs.getString("start_time");
                String j=rs.getString("hall_type");
                int k=rs.getInt("price");
                MovieTime trans = new MovieTime(a,b,de,c,g,j,k);
                System.out.println(a+" "+b+" "+de+" "+c+" "+g+" "+j+" "+k);
                transactions.add(trans);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return transactions;
    }*/

            
}

