package Lesson_1;

import java.util.Arrays;

public enum CameraRollType {

    ColorCamera(1, "ColorCameraRoll"),
    BlackAndWhite(2, "BlackAndWhiteCameraRoll");

    private final int id;
    private final String name;

    CameraRollType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static CameraRollType getById(int id) {
        return Arrays.stream(values())
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
