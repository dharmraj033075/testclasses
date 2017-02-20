package dharm;
import java.util.*;
import java.nio.file.Paths;
import java.io.IOException;

public class euler_new {
    public static void main(String... vargs) throws IOException {
        String triangleFileName = "F:\\java\\p067_triangle.txt";
        Scanner fileScanner = new Scanner(Paths.get(triangleFileName));
        Scanner lineScanner;
        int[] parentLevel = { Integer.parseInt(fileScanner.nextLine().trim()) };
        int[] childLevel;
        int nChildrenInLevel = 1;
        int childIndex, maxParentWeight, childWeight;
        int heaviestPathWeight = 0;
        while (fileScanner.hasNextLine()) {
            lineScanner = new Scanner(fileScanner.nextLine());
            childLevel = new int[++nChildrenInLevel];
            childIndex = 0;
            while (lineScanner.hasNextInt()) {
                if (childIndex == 0) {
                    maxParentWeight = parentLevel[0];
                } else if (childIndex == nChildrenInLevel - 1) {
                    maxParentWeight = parentLevel[childIndex - 1];
                } else {
                    maxParentWeight = Math.max(parentLevel[childIndex - 1], parentLevel[childIndex]);
                }
                childWeight = lineScanner.nextInt();
                childLevel[childIndex] = maxParentWeight + childWeight;
                heaviestPathWeight = Math.max(heaviestPathWeight, childLevel[childIndex]);
                childIndex++;
            }
            parentLevel = childLevel;
            lineScanner.close();
            System.gc();
        }
        fileScanner.close();
        System.out.println(heaviestPathWeight);
        System.exit(0);
    }
}