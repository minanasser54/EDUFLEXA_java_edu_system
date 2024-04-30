package Material;

public class Lesson {
    private String text;
    private String video_url;
    private Chapter chapter;
    private Course course = chapter.getCourse();
}
