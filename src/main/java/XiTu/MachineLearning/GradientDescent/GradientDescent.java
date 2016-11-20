package XiTu.MachineLearning.GradientDescent;

import XiTu.MachineLearning.Data.LabelAndFeatures;

import java.util.List;

/**
 * Created by tuxi1 on 11/19/2016.
 */
public class GradientDescent {

    private double learningRate;
    private double lambda;

    public GradientDescent(double learningRate, double lambda) {
        this.learningRate = learningRate;
        this.lambda = lambda;
    }


    public double calculate(double[] predicts, List<LabelAndFeatures> list, int index){
        double val = 0;
        
        if(index==0) {

        } else {

        }
        return val;
    }
}
