public class MediaUploader {
    public void uploadMedia(String mediaName) {
        if (mediaName == null || mediaName.trim().isEmpty()) {
            System.out.println("No media attached.");
        } else {
            System.out.println("Media uploaded: " + mediaName);
        }
    }
}