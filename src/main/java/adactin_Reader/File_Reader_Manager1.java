package adactin_Reader;

public class File_Reader_Manager1 {

	private File_Reader_Manager1() {
		
	}
	
	public static File_Reader_Manager1 getInstanceFRM() {
		File_Reader_Manager1 frm = new File_Reader_Manager1();
		return frm;
	}
	
	public Configg_Reader getInstanceCR() throws Throwable {
	Configg_Reader reader = new Configg_Reader();
	return reader;
	}
}
