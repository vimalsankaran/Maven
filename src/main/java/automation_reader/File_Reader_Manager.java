package automation_reader;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager rdm = new File_Reader_Manager();
		return rdm;
	}
	
	public Config_Reader getInstanceCR() throws Throwable {
	Config_Reader reader = new Config_Reader();
	return reader;
	}
}
