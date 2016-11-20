package XiTu.MachineLearning.LogisticRegression;

import XiTu.MachineLearning.Data.LabelAndFeatures;
import java.util.List;
/**
 * Created by tuxi1 on 11/18/2016.
 */
public class LogisticRegression {

    private int iteration = 100;

    private double[] weights;
    private double lambda;
    private double learningRate;


    public LogisticRegression(int numOfFeatures, int iteration, double lambda, double learningRate) {
        this.lambda = lambda;
        this.learningRate = learningRate;
        this.weights = new double[numOfFeatures+1]; //w0+w1*x1+w2*x2+w3*x3+...
        this.iteration = iteration;
    }


    public LogisticRegressionModel train(List<LabelAndFeatures> list) {

        for(int i=0; i<iteration; ++i) {

        }

        return new LogisticRegressionModel(this.weights);
    }
}
