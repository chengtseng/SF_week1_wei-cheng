
public class Dancer extends Performer{
	private final String style;
	
	public Dancer(Audition audition, String style) {
		super(audition);
		this.style = style;
	}
	
	@Override
	public void perform() {
		System.out.println(style + " - " + super.id + " dancer");
	}

	public String getStyle() {
		return style;
	}

}
