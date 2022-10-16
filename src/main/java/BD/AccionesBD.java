package BD;

        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.Statement;
        import java.sql.ResultSet;
        import java.util.Scanner;

public class AccionesBD {
    Conexion objetoConexion = new Conexion();
    Statement statement = objetoConexion.crearConexion();
    Connection conexion = objetoConexion.devolverConexion();
    Scanner sc = new Scanner(System.in);

    public void leerTodosLosDatos() {
        try {
            ResultSet result = statement.executeQuery("SELECT * FROM library.libreria");
            while(result.next()){
                System.out.println(result.getString("titulo")+ "     " + result.getString("autor") + "     " + result.getString("precio"));
                System.out.println("-------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void leerLibrosPorAutor(){
        try{
            System.out.println("Dime el autor por el cual quieres filtar los libros: ");
            String autor = sc.nextLine();

            PreparedStatement preparedStatement = conexion.prepareStatement("SELECT * FROM library.libreria WHERE autor=?");
            preparedStatement.setString(1, autor);

            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println(result.getString("titulo")+ "     " + result.getString("autor") + "     " + result.getString("precio"));
                System.out.println("-------------------------------------------------------------------------");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void actualizarLibroPorId(){
        try{
            System.out.println("Dime el id por el cual quieres identificar el libro para actualizar: ");
            int id = sc.nextInt();
            sc.skip("\n");

            System.out.println("Dime el título: ");
            String titulo = sc.nextLine();

            System.out.println("Dime el autor: ");
            String autor = sc.nextLine();

            System.out.println("Dime el precio: ");
            int precio = sc.nextInt();

            PreparedStatement preparedStatement = conexion.prepareStatement("UPDATE library.libreria SET titulo=?, autor=?, precio=? WHERE id=?");

            preparedStatement.setString(1, titulo);
            preparedStatement.setString(2, autor);
            preparedStatement.setInt(3, precio);
            preparedStatement.setInt(4,id);

            preparedStatement.executeUpdate();

            System.out.println("Información actualizada!");
        } catch (Exception e){
            System.out.println("Has introducido un id incorrecto o ha ocurrido otro error.");
            System.out.println(e);
        }
    }

    public void eliminarLibroPorId(){
        try{
            System.out.println("Dime el id por el cual quieres identificar el libro que quieres borrar: ");
            int id = sc.nextInt();

            PreparedStatement preparedStatement = conexion.prepareStatement("DELETE FROM library.libreria WHERE id=?");

            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

            System.out.println("Información borrada!");
        } catch (Exception e){
            System.out.println("Has introducido un id incorrecto o ha ocurrido otro error.");
            System.out.println(e);
        }
    }
}
