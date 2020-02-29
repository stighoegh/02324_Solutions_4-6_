import java.io.File;
public class ReadDir {
    public static void main(String[] args) {

        File file = null;
        String[] paths;

        if (args.length !=1) {
            System.out.println("Du har ikke indtastet katalog navn på commandolinien, prøv igen");
            System.exit(0);
        }

        String s  = args[0];
        // dette af hensyn til test
        //s="M:\\2014";


        try{
            // create new file object
            file = new File(s);

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }
        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }
}