package iconst;

public enum NodeCellTyp {
	NULL, BOOLEAN, INT, LONG, FLOAT, STRING, ID, FUNC,
	PTR, KWD, LOCVAR, FLDVAR, GLBVAR;
	
	public static final NodeCellTyp values[] = values();
}
