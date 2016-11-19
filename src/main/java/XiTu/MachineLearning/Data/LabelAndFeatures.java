package XiTu.MachineLearning.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tuxi1 on 11/18/2016.
 */
public class LabelAndFeatures {
    public double label;
    public double[] features;

    public LabelAndFeatures(double label, double[] features) {
        this.label = label;
        this.features = features;
    }

    public static List<LabelAndFeatures> readFromSourceFile(String filename) throws FileNotFoundException {
        List<LabelAndFeatures> dataset = new ArrayList<LabelAndFeatures>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("#")) {
                    continue;
                }
                String[] columns = line.split("\\s+");

                // skip first column and last column is the label
                int i = 1;
                double[] data = new double[columns.length-2];
                for (i=1; i<columns.length-1; i++) {
                    data[i-1] = Integer.parseInt(columns[i]);
                }
                int label = Integer.parseInt(columns[i]);
                LabelAndFeatures instance = new LabelAndFeatures(label, data);
                dataset.add(instance);
            }
        }
        finally {
            if (scanner != null)
                scanner.close();
        }

        return dataset;

    }
}
