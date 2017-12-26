package OopStudyIteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class RockSongs implements SongIterator{

	ArrayList<SongInfo> Songs;
	
	public RockSongs() {
		Songs =  new ArrayList<SongInfo>();
		AddSong("Korn");
		AddSong("Sepultura");
	}
	
	
	public void AddSong(String Name) {
		SongInfo song=new SongInfo(Name);
		Songs.add(song);
	}
	
	public ArrayList<SongInfo> GetSongs() {
		return Songs;
	}

	
	public Iterator CreateIterator() {
		return Songs.iterator();
	}
	
	
}
