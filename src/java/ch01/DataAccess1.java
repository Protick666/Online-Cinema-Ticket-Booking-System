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
public class DataAccess1 
{
    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    String username = "hr";
    String password = "hr";

    Connection conn = null;
    public DataAccess1()
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

    public int createAccount(String firstName, String lastName, String jobtype, 
            String username,String  pass)
    {
        try
        {
            System.out.println("flag22 "+firstName+" "+ lastName+" "+jobtype+ " "+username+" "+pass);
            int f=1;
            
            String insertCommand = "insert into employee values(?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(insertCommand); 
            
            stmt.setString(3, firstName);
            stmt.setString(4, lastName);
            stmt.setString(5,jobtype );
            stmt.setString(1, username);
            stmt.setString(2, pass);
            
            int count = stmt.executeUpdate();
            conn.commit();
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
    
    
    
    
    public int coy1(String movie_id,String movie_name,String genre,int length)
    {
        
        String selectStatement="insert into movie values(?,?,?,?)";
        try
        {    
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            
            stmt.setString(4, movie_id);
            stmt.setString(1, movie_name);
            stmt.setString(2,genre );
            stmt.setInt(3, length);
            
            /*SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
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
            stmt.setDate(1,df);*/
            int count = stmt.executeUpdate();
            conn.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        return 1;
        
    }
    
    
    
    
    
    
    
    public int coy2(String dt,String start_time,String s,String movie_id,String show_id,int hall_no)
    {
        
        String selectStatement="insert into show values(?,?,?,?,?,?)";
        try
        {    
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            System.out.println("final check dada"+dt +" "+start_time +" "+ s +" "+ movie_id  +" "+show_id  +" "+hall_no);
            stmt.setString(2, start_time);
            stmt.setString(3, s);
            stmt.setString(4,movie_id);
            stmt.setString(5, show_id);
            stmt.setInt(6, hall_no);
            
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
            int count = stmt.executeUpdate();
            conn.commit();
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        
        return 1;
        
    }
    
   
    public int existUser(String username,String password)
    {
        try
        {
            String query = "select * from employee where user_name=? and password=?";
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
    public ArrayList<employtime> existUser()
    {
        ArrayList<employtime> transactions = new ArrayList<employtime>();
        String selectStatement="select e.user_name,e.password,e.first_name,e.last_name,e.j_type from employee e";
        System.out.println("yoooooooooo");
        try
        {    
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            
            
            //stmt.setString
            ResultSet rs = stmt.executeQuery();
            //System.out.print("jdfk");
            while(rs.next())
            {
                String a = rs.getString("user_name");
                String b = rs.getString("password");
                String c = rs.getString("first_name");
                
                String g=rs.getString("last_name");
                String j=rs.getString("j_type");
                
                employtime trans = new employtime(a,b,c,g,j);
                System.out.println(a+" "+b+" "+c+" "+c+" "+g+" "+j);
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
    
    public ArrayList<dorkar> existUser(int l)
    {
        ArrayList<dorkar> transactions = new ArrayList<dorkar>();
        String selectStatement="select s.show_id,s.start_time,s.hall_no,m.movie_name,m.genre,m.length from show s join movie m on (s.movie_id=m.movie_id)";
        System.out.println("yoooooooooo");
        try
        {    
            PreparedStatement stmt = conn.prepareStatement(selectStatement);
            //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            
            
            //stmt.setString
            ResultSet rs = stmt.executeQuery();
            //System.out.print("jdfk");
            while(rs.next())
            {
                String a = rs.getString("show_id");
                String b = rs.getString("start_time");
                int n=rs.getInt("hall_no");
                String c = rs.getString("movie_name");
                
                String g=rs.getString("genre");
                int j=rs.getInt("length");
                
                
                dorkar trans = new dorkar(a,b,c,g,j,n);
                System.out.println(a+" "+b+" "+c+" "+j+" "+g+" "+n);
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

