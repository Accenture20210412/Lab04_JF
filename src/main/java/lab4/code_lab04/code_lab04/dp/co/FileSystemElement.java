package lab4.code_lab04.code_lab04.dp.co;

public interface FileSystemElement {

	public boolean rename(String newName);
	default boolean remove() {
		 return this.remove();
	}
	public void print();

}
