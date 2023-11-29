
public class Main {
    public static void main(String[] args) {
        Biblioteca bibliotecaCarti = new Biblioteca();
        bibliotecaCarti.adaugaMedia(new Media(new Carte(" 1.Don Quixote; 2.The Lord of the Rings; 3.A Tale of Two Cities")));
        Media mediaCarte = bibliotecaCarti.preiaMedia(0);
        Carte carte = (Carte) mediaCarte.getContent();
        System.out.println("Carte: " + carte.getTitlu());

        Biblioteca bibliotecaVideo = new Biblioteca();
        bibliotecaVideo.adaugaMedia(new Media(new Video(" 1.The Matrix; 2.Agent007; 3.Back to the Future")));
        Media mediaVideo = bibliotecaVideo.preiaMedia(0);
        Video video = (Video) mediaVideo.getContent();
        System.out.println("Video: " + video.getTitlu());

        Biblioteca bibliotecaZiare = new Biblioteca();
        bibliotecaZiare.adaugaMedia(new Media(new Ziar(" 1.New York Times; 2.Jurnal; 3.Chisinau")));
        Media mediaZiar = bibliotecaZiare.preiaMedia(0);
        Ziar ziar = (Ziar) mediaZiar.getContent();
        System.out.println("Ziar: " + ziar.getTitlu());

    }
}