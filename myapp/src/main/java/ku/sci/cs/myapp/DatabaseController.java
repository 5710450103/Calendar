package ku.sci.cs.myapp;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseController {

	public Connection databaseConnection() throws SQLException;

	public void saveEvent(Calendar c) throws SQLException;

	public void editEvent(int num, Calendar c) throws SQLException;

	public void deleteEvent(int num) throws SQLException;
	
}
