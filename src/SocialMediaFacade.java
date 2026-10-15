public class SocialMediaFacade {
    private final ContentValidator validator = new ContentValidator();
    private final MediaUploader uploader = new MediaUploader();
    private final PostStorage storage = new PostStorage();
    private final NotificationService notifications = new NotificationService();

    public void publishPost(String text, String mediaName) {
        if (!validator.isValid(text)) {
            System.out.println("Error: post text cannot be empty.");
            return;
        }

        uploader.uploadMedia(mediaName);
        storage.savePost(text);
        notifications.notifyFollowers();

        System.out.println("Post published successfully!");
    }
}