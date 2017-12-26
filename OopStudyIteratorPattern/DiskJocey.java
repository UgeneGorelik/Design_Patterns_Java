package OopStudyIteratorPattern;

import java.util.Iterator;

public class DiskJocey {
	SongIterator  Rock;
	SongIterator  Pop;

	
	public DiskJocey(SongIterator Rock,SongIterator Pop) {
		this.Rock=Rock;
		this.Pop=Pop;
	}
	
	public void ShowSongs()
	{
		Iterator RockIter=Rock.CreateIterator();
		PlaySongs(RockIter);
				
	}

	private void PlaySongs(Iterator SongIter) {
		while(SongIter.hasNext()) {
			SongInfo s= (SongInfo) SongIter.next();
			System.out.println(s.GetName());
		}
		
	}
	

}
