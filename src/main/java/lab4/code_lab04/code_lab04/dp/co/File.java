package lab4.code_lab04.code_lab04.dp.co;

public class File implements FileSystemElement {

	private String name;

	public String getName() {
		return name;
	}

	public File(String name) {
		this.name = name;
	}
	
	@Override
	public boolean rename(String newName) {
		this.name = newName;
		return true;
	}

	@Override
	public void print() {
		System.out.println(name);
	}

}
