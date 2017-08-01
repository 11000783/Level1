
public class movieList {
public static void main(String[] args) {

	String[]movieList={"BayWatch","Emoji Movie","Transformer","Planet of The Apes"};

	for (int i = 0; i <movieList.length; i++) {
	System.out.println(movieList[i]);
}
	String[]otherList=new String[2];
	otherList[0]="other";
	otherList[1]="things";
	for (String movie:otherList) {
		System.out.println(movie);
	}
}
}