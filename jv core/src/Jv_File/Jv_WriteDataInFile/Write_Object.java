package Jv_File.Jv_WriteDataInFile;

public class Write_Object {
    private int id;
    private String name;

    public Write_Object(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "My student: " +
                "id=" + id +
                ", name=" + name + '\''
                ;
    }
}
