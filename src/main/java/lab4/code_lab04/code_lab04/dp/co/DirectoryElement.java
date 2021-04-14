package lab4.code_lab04.code_lab04.dp.co;

public interface DirectoryElement extends FileSystemElement {
    boolean addElement(FileSystemElement element);
    boolean removeElement(FileSystemElement element);
    public boolean moveTo(Directory directory, FileSystemElement element);
}
