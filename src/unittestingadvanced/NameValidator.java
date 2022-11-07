package unittestingadvanced;

// IMPORTANT: do not change the below NameValidator class
/**
 * Contains a utility method to check whether a person's name is valid or not.
 */
public class NameValidator {
    /**
     * Returns true if the given name is valid.
     *
     * A valid name must not be blank (that is, it must have at least one
     * non-whitespace character) and must be at least two words (that is, it
     * must have at least one space character " ".
     *
     * A null name results in an IllegalArgumentException.
     *
     * @param name person's name to validate
     * @return true if name is valid; false otherwise
     * @throws IllegalArgumentException if the given name is null
     */
    public boolean validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (name.isBlank()) { // checks if name is entirely whitespace
            return false;
        }
        if (!name.contains(" ")) {
            return false;
        }
        return true;
    }
}

// ^^^ IMPORTANT: do not change the above NameValidator class