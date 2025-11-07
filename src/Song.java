public class Song {
    String title;
    Song next;
    Song prev;
    public Song(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedPlaylist {
    Song head;
    Song tail;
    Song current;
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            tail = newSong;
            current = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
    }
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("NS: Now Playing: " + current.title);
        } else {
            System.out.println("End of playlist");
        }
    }
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("PS: Now Playing: " + current.title);
        } else {
            System.out.println("End of playlist");
        }
    }
}