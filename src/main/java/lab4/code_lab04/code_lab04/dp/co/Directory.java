package lab4.code_lab04.code_lab04.dp.co;


public class Directory implements FileSystemElement {
	
	private String name;
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public boolean rename(String newName) {
		this.name = newName;
		return true;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
	

}
