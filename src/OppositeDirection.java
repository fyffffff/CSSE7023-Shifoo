public class OppositeDirection {
    /**
     * Determines and returns the opposite direction.
     * Returns "up" if direction is "down", "down" if direction is "up",
     * "right" if direction is "left", "left" if direction is "right", "none" if
     * direction is anything else.
     * Return value is case sensitive.
     *
     * @param direction The direction to be evaluated.
     * @return String containing the opposite direction from the provided direction.
     */
    public String oppositeDirection(String direction) {
        // write your code here
        if (direction.equals("up")){
            return "down";
        } else if (direction.equals("down")) {
            return "up";
        } else if (direction.equals("left")) {
            return "right";
        } else if (direction.equals("right")) {
            return "left";
        }
        else {
            return "none";
        }
    }
}
