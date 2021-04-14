package lab4.code_lab04.code_lab04.dp.co;


import java.util.LinkedList;
import java.util.List;

public class Directory implements DirectoryElement {
	
	private String name;
	private List<FileSystemElement> elements = new LinkedList<>();

	public Directory(String name, List<FileSystemElement> elements) {
		this.name = name;
		this.elements = elements;
	}

	public String getName() {
		return name;
	}

	public List<FileSystemElement> getElements() {
		return elements;
	}

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public boolean addElement(FileSystemElement element) {
		return elements.add(element);
	}

	@Override
	public boolean removeElement(FileSystemElement element) {
		return elements.remove(element);
	}

	@Override
	public boolean rename(String newName) {
		this.name = newName;
		return newName.equals(this.name);
	}


	@Override
	public boolean moveTo(Directory directory, FileSystemElement element) {
		directory.getElements().add(element);
		this.removeElement(element);
		return true;
	}
	public String directoryToString(String beforeString) {
		StringBuilder result = new StringBuilder();
		result.append(beforeString)
				.append(this.name)
				.append(": \n ");
		beforeString += "\t";
		for (FileSystemElement i : elements) {
			if (i instanceof File) {
				result.append(beforeString)
						.append(((File) i).getName())
						.append("\n");
			} else if( i instanceof Directory) {
				result.append(
						((Directory) i).directoryToString(beforeString))
						.append("\n");
			}
		}
		return result.toString();
	}



	@Override
	public void print() {
		System.out.println(directoryToString(""));
	}
}
