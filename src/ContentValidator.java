public class ContentValidator {
    public boolean isValid(String text) {
        return text != null && !text.trim().isEmpty();
    }
}