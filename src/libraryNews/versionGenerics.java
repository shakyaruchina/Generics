package libraryNews;

import java.util.List;

import java.util.ArrayList;
public class versionGenerics {
	private List options = new ArrayList();
	public void addMedia(Media x) {
		options.add(x);
	}
	public Media retrieveList() {
		int size = options.size();
		if(size>0) {
			return (Media)options.get(size-1);
		}
		return null;
	}

	
}

interface Media{
	
}

interface Book extends Media{
	
}

interface Video extends Media{
	
}

interface Newspaper extends Media{
	
}


//Generic Version

/* import java.util.List;
 * import java.util.AttayList;
 * 
 * public class Library<E extends Media>{
 * 		private List<E> resources = new ArrayList<E>();
 * 		public void addMedia(E x){
 * 			resources.add(x);}
 * 
 * 		public E retrieveLast(){
 * 				int size = resources.size();
 * 				if(size>0){
 * 					return resources.get(size-1);
 * 		}
 * 		return null;
 * 		}}*/
