package OopStudyIteratorPattern;

public class PatternTest {
	
	public static void main(String[] args) {
	SongIterator r = new RockSongs();
	SongIterator p = new PopSongs();
	DiskJocey dj = new DiskJocey(r, p);
	dj.ShowSongs();
	}
	
	
}
