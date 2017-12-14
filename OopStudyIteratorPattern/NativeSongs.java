package OopStudyIteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class NativeSongs implements SongIterator {
	
	Hashtable<Integer, SongInfo> Songs= new Hashtable<Integer, SongInfo>();
	int counter=0;
	
	NativeSongs(){
		
		AddSong("Eyal");
		AddSong("Margol");
		AddSong("Dudu");
	}
	
	public void AddSong(String Name) {
		
		SongInfo s= new SongInfo(Name);
		Songs.put(counter, s);
	}
	
	public Hashtable<Integer, SongInfo> GetSongs(){
		return Songs;
		
	}

	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
