package XiTu.MachineLearning;

import XiTu.MachineLearning.Data.LabelAndFeatures;
import XiTu.MachineLearning.LogisticRegression.LogisticRegression;
import XiTu.MachineLearning.LogisticRegression.LogisticRegressionModel;

import java.util.List;

/**
 * Created by tuxi1 on 11/18/2016.
 */
public class Program {
    public static void main(String[] args) {
        try {
            List<LabelAndFeatures> input = LabelAndFeatures.readFromSourceFile("trainingData");

            LogisticRegression lr = new LogisticRegression(input.get(0).features.length, 100, 0.1, 0.01);
            LogisticRegressionModel model = lr.train(input);

            List<LabelAndFeatures> testData = LabelAndFeatures.readFromSourceFile("testData");


        } catch (Exception ex) {

        }
    }
}
