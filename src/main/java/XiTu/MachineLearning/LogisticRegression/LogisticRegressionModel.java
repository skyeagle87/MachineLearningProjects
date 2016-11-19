package XiTu.MachineLearning.LogisticRegression;

/**
 * Created by tuxi1 on 11/18/2016.
 */
public class LogisticRegressionModel {
    private double[] coefficients;

    public LogisticRegressionModel(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public int getNumberOfFeatures() {
        return coefficients.length-1;
    }

    //features.length = coefficients.length-1;
    public int classify(double[] features) {
        if(getNumberOfFeatures()!=features.length) throw new RuntimeException("Number of features incorrect!");

        double sum = coefficients[0];
        for(int i=1; i<coefficients.length;++i) {
            sum += coefficients[i] * features[i-1];
        }

        return sum>0.5 ? 1 : 0;
    }
}
