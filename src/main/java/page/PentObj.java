package page;

import java.util.ArrayList;
import java.util.HashMap;
import iconst.PageTyp;

public class PentObj {

	private Store store;
	private int clsIdx;
	private int superClsIdx;
	private int pubFldCount;
	private int prvFldCount;
	public HashMap<String, Integer> fldMap;
	public ArrayList<AddrNode> fldList;

	public PentObj(int clsIdx, Store store) {
		this.store = store;
		this.clsIdx = clsIdx;
		superClsIdx = -1;
		pubFldCount = 0;
		prvFldCount = 0;
		fldMap = new HashMap<String, Integer>();
		fldList = new ArrayList<AddrNode>();
	}

	public PentObj(PentObj pentClass, Store store) {
		int fldCount;
		int i;
		AddrNode srcNode;
		AddrNode destNode;
		int header;
		int addr = 0;
		PageTyp pgtyp;
		
		this.store = store;
		clsIdx = pentClass.clsIdx;
		superClsIdx = pentClass.superClsIdx;
		pubFldCount = pentClass.pubFldCount;
		prvFldCount = pentClass.prvFldCount;
		fldCount = pubFldCount + prvFldCount;
		fldMap = new HashMap<String, Integer>();
		fldList = new ArrayList<AddrNode>();
		fldMap.putAll(pentClass.fldMap);
		for (i = 0; i < fldCount; i++) {
			srcNode = pentClass.fldList.get(i);
			header = srcNode.getHeader();
			pgtyp = srcNode.getHdrPgTyp();
			switch (pgtyp) {
			case INTVAL: 
			case BOOLEAN:
				addr = 0;
				break;
			case LONG:
				addr = store.allocLong(0L);
				break;
			case FLOAT:
				addr = store.allocFloat(0.0);
				break;
			case STRING:
				addr = store.allocString("");
				break;
			default:
				addr = 0;
			}
			destNode = new AddrNode(header, addr);
			fldList.add(destNode);
		}
	}
}
