package XiTu.MachineLearning.Utils;

/**
 * Created by tuxi1 on 11/18/2016.
 */
public class MathFormula {
    public static double sigmoid(double z) {
        return 1.0 / (1.0 + Math.exp(-z));
    }

}
