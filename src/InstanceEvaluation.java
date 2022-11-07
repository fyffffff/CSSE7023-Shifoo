public class InstanceEvaluation {
    /**
     * Evaluates the instance type of a given object, reports back the type.
     * Returns "Integer" if an instance of Integer is passed,
     * "Double" if an instance of Double is passed,
     * "String" if an instance of String is passed,
     * "null" if no object (i.e. null) is passed,
     *  otherwise "".
     * @param object The object to be evaluated.
     * @return String referring to the type of object that is passed.
     */
    public static String evaluateInstanceType(Object object) {
        if (object instanceof Integer) {
            return "Integer";
        } else if (object instanceof  Double) {
            return "Double";
        } else if (object instanceof String) {
            return "String";
        } else if (object == null) {
            return "null";
        }
        return "";
    }
}