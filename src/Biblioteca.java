import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Media> mediaList;

    public Biblioteca() {
        this.mediaList = new ArrayList<>();
    }

    public void adaugaMedia(Media media) {
        mediaList.add(media);
    }

    public Media preiaMedia(int index) {
        if (index >= 0 && index < mediaList.size()) {
            return mediaList.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index invalid");
        }
    }
}