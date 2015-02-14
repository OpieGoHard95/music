public class MusicDriver {
    public static void main(String[] args) {
	Music myMusic = new Music();
	System.out.println(myMusic.toString());
	Music anotherMusic = new Music("Back in Black", "AC/DC", "Metal", "CD");
	System.out.println(anotherMusic.toString());
	Music rageAgainstTheMachine = new Music("Rage Against the Machine");
	System.out.println(rageAgainstTheMachine.toString());
	}
}
