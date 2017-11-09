import java.io.File;
import java.io.FileFilter;

/**
 * Created by RB034746 on 07/18/2017.
 */
public class FirstLambda {

    public static void main(String[] args){

        /**
         * This is anonymous class implementing FileFilter with one abstract method accept
         */
//        FileFilter filter = new FileFilter() {
//
//            public boolean accept(File pathName) {
//                return pathName.getName().endsWith(".java");
//            }
//        };

        /**
         * This is conversion of that Anonymous class to lambda.
         */
        FileFilter filter = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("/Users/rb034746/temp");
        File[] files = dir.listFiles(filter);

        for(File file: files){
            System.out.println(file);
        }
    }
}
