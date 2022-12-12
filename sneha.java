import java.sql.*;

class sneha
{
    public static void main(String arg[]) throws Exception
    {
    
    
        //class.forName("com.mysql.cj.jdbc.Driver");
        String URL = "jdbc:mysql://localhost:3306/ppa41";
        String Username = "root";
        String Password = "sneha@123";
        String Query = "select * from student";
        Connection cobj = DriverManager.getConnection(URL,Username,Password);
        
	
	
	
        Statement sobj = cobj.createStatement();

        ResultSet robj = sobj.executeQuery(Query);

        while(robj.next())
        {
            System.out.println("RID : "+robj.getInt("RID"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("City"));
            System.out.println("Marks : "+robj.getInt("Marks"));                                    
        }
    }
}

//export CLASSPATH=/usr/share/java/mysql-connector-java-8.0.20.jar:$CLASSPATH
