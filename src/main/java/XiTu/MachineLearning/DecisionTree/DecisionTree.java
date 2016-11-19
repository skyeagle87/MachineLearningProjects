package XiTu.MachineLearning.DecisionTree;

/**
 * Created by tuxi1 on 11/18/2016.
 *
 * GrowTree(D, F) – grow a feature tree from training data.

 Input : data D; set of features F.
 Output : feature tree T with labelled leaves.
 if Homogeneous(D) then return Label(D) ;
 S = BestSplit(D, F) ;
 split D into subsets Di according to the literals in S;
 for each i do
 if Di not empty then Ti = GrowTree(Di, F) else Ti is a leaf labelled with Label(D);
 end
 return a tree whose root is labelled with S and whose children are Ti


 BestSplit(D, F) – find the best split for a decision tree.

 Input : data D; set of features F.
 Output : feature f to split on.
 Imin  =1;
 for each f ∈ F do
 split D into subsets D1 ,..., Dl according to the values Vj of f;
 if Impurity({D1 ,..., Dl}) < Imin then
 Imin = Impurity({D1 ,..., Dl});
 fbest =  f;
 end
 end
 return fbest
 */
public class DecisionTree {

    /*public void train(List<DataSample> trainingData, List<Feature> features) {
        root = growTree(trainingData, features, 1);
    }

    protected Node growTree(List<DataSample> trainingData, List<Feature> features, int currentDepth) {

        Label currentNodeLabel = null;
        // if dataset already homogeneous enough (has label assigned) make this node a leaf
        if ((currentNodeLabel = getLabel(trainingData)) != null) {
            log.debug("New leaf is created because data is homogeneous: {}", currentNodeLabel.getName());
            return Node.newLeafNode(currentNodeLabel);
        }

        boolean stoppingCriteriaReached = features.isEmpty() || currentDepth >= maxDepth;
        if (stoppingCriteriaReached) {
            Label majorityLabel = getMajorityLabel(trainingData);
            log.debug("New leaf is created because stopping criteria reached: {}", majorityLabel.getName());
            return Node.newLeafNode(majorityLabel);
        }

        Feature bestSplit = findBestSplitFeature(trainingData, features); // get best set of literals
        log.debug("Best split found: {}", bestSplit.toString());
        List<List<DataSample>> splitData = bestSplit.split(trainingData);
        log.debug("Data is split into sublists of sizes: {}", splitData.stream().map(List::size).collect(Collectors.toList()));

        // remove best split from features (TODO check if it is not slow)
        List<Feature> newFeatures = features.stream().filter(p -> !p.equals(bestSplit)).collect(toList());
        Node node = Node.newNode(bestSplit);
        for (List<DataSample> subsetTrainingData : splitData) { // add children to current node according to split
            if (subsetTrainingData.isEmpty()) {
                // if subset data is empty add a leaf with label calculated from initial data
                node.addChild(Node.newLeafNode(getMajorityLabel(trainingData)));
            } else {
                // grow tree further recursively
                node.addChild(growTree(subsetTrainingData, newFeatures, currentDepth + 1));
            }
        }

        return node;
    }*/
}
