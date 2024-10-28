import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("Exception/image/us.gif");
//        java.io.File file = new java.io.File("C:/Users/nikol/OneDrive/Skrivebord/Datamatiker/programering/Min ovelser/Rekursion/rc/ecursivehelpermetode");

        File file2 = new File("File.txt","File2.txt");

        File file3 = new File(file,"navnPåFil.txt");

        System.out.println("Man kan bruge file.isDirectory()" +
                " til at se file er en mappe er  " + file.isDirectory() +
                " for at se om objektet af File er en mappe");

        System.out.println("Man kan bruge file.isFile() er file " + file.isFile() +
                " for at se om objektet af File er en file ");

        System.out.println("\n file.exists() Eksistere filen? " + file.exists());


        System.out.println("\nCan it be read? " + file.canRead() +
                " Returns true hvis abstract path eksistere og applikation" +
                " har tilladelse til at læse filen");

        System.out.println("\nEr file objektet en mappe? " + file.isDirectory());

        System.out.println("\n Er file objektet en fil? " + file.isFile());

        System.out.println("\nCan be written? " + file.canWrite() + "-\n" +
                "-metode finder ud af om program kan skrive (write to) til filen angivet\n" +
                "af det abstract path name så true hvis eksitere og program kan skrive til" +
                "\nReturn true if the file represented by the File object exist an can be written");

        System.out.println("\n Returns true hvis file object er lavet " +
                " ved at bruge absolute path name " + file.isAbsolute());

        System.out.println("\nReturns true " + "(" + file.isHidden() + ")" + "" +
                " hvis file represented i File objektet er gemt(hidden)\n" +
                "Præcis defenition af hidden er system afhængig\n" +
                "på Windows kan man mark en file hidden i File properties dialog box\n" +
                "på Unix system, er en file hidden hvis dets navn begynder med et punktum (.) character");

        System.out.println("\nReturns complete absoulute file or directory name (fil eller mappe)\n" +
                file.getAbsolutePath());

        System.out.println("\nReturns det samme som getAbsolutePath() except\n" +
                "det fjerner overflødig navne så som (.) og (..)  fra path name\n" +
                "resolve symbolic links (on Unix) and converts drive letters\n" +
                "to standard upper case (on Windows) " + file.getCanonicalPath());

        System.out.println("\nReturn navnet på filen us.gif er " + file.getName()+
                "\n Giver last name af complete directory og file name ");

        System.out.println("\nReturnere hele mappen og filnavnet og repræsenteret af " +
                "Fil objektet \nSom hedder: " + file.getPath());

        System.out.println("\nGiver complete parent directory af current directory\n" +
                "or the file represented by the File object "+ file.getParent());

        System.out.println("\nReturn den sidste gang filen var modified " + (file.lastModified()/1000) + "sek");
        System.out.println(new java.util.Date(file.lastModified()) + " CEST = Central European Summer Time");

        System.out.println("\nFilen har længden " + file.length()  +
                "\n returns seize of file, or 0 if file doesn't exist or is a directory ");

        File[] fileArray = file.getParentFile().listFiles();

        System.out.println("\n returns the files under directory for a directory File object" +
                "\n" + Arrays.toString(fileArray));

        System.out.println("\n delete : boolean  Deletes the file or directory" +
                "\nrepresented by the File object" +
                "\n method returns true if deletion succeds file.delete(); ");

        System.out.println("\nRenames the file or directory represented by the File object to " +
                "specified name represented in dest" +
                "\nthe method returns true if operation succeds" +
                "\n file.renameTo(dest: File) boolean; ");

        System.out.println("\nCreates a directory represented in the File object" +
                "\nReturns true if directory is created is created succesfully" +
                "\n file.mkdir();");

        System.out.println(file.mkdir());

        System.out.println("\nSame as mkdir() except that it creates directory along with" +
                "\nparent directories if the parent directories do not exist" +
                "\nfile.mkdirs();");

        System.out.println(file.mkdirs());



    }
}