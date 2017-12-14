package OopStudyIteratorPattern;

import java.util.Iterator;
import java.util.Arrays;

public class PopSongs implements SongIterator{
	
	public String [] Songs;
	int place=0;
	
	PopSongs(){
		Songs = new String[3];
		AddSong("Britney");
		AddSong("Backstreet");
		AddSong("Spice");
	}

	
	public void AddSong(String name){
		Songs[place]="Name";
		place++;
		
	}
	
	public String [] GetSongs() {
		return Songs;
		
	}

	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(Songs).iterator();
	}
	
	
}
