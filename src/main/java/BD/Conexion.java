package BD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {
    private Connection conexion;
    public Statement crearConexion(){
        Statement statement = null;
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "55829536");
            statement = conexion.createStatement();
            System.out.println("Base de datos conectada con éxitos");
        }catch(Exception e){
            System.out.println("Ha habido un error a la hora de crear la conexión con la base de datos mysql." + e);
        }
        return statement;
    }

    public Connection devolverConexion(){
        return conexion;
    }
}
