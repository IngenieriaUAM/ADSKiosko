package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CDDAOFactory{
  //Atributos
  private String     url = "jdbc:mysql://localhost/BDBicicletas?";
  private String     usuario = "root";
  private String     password = "";
  private Connection conexion;

  public CDDAOFactory()  {
      try {
            loadDriver();
	  } 
      catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
  }

  /*Carga el driver de la conexiÛn a la base de datos*/
  private void loadDriver() throws ClassNotFoundException{
      try{
            //Instancia de una nueva clase para el puente "sun.jdbc.odbc.JdbcOdbcDriver"
            //El puente sirve entre la aplicaciÛn y el driver.
            Class.forName("com.mysql.jdbc.Driver");
      } catch(ClassNotFoundException e){
          throw new ClassNotFoundException("No se pudo cargar el puente JDBC-ODBC"+e.getMessage());
      }
  }

 /*Obtiene una conexiÛn con el nombre del driver especificado*/
  public Connection abreConexion() throws SQLException {
      //este es el nombre del driver que se d· en:
      // "Panel de control->OrÌgenes de datos (ODBC)" Û
      //"Panel de control->Herramientas administrativas->OrÌgenes de datos (ODBC)"
      System.out.println("Estableciendo conexión con " + url);
      try {
            conexion = DriverManager.getConnection( url+"BDBicicletas", usuario, password);
	} catch (SQLException e) {
            e.printStackTrace(); //Para efectos de depuraciÛn
	    throw new SQLException("No se estableciÛ la conexiÛn con:\t " + url);
	}
      System.out.println("Conexión establecida con:\t " + url);
      return conexion;
  }
}
