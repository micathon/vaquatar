package iconst;

public enum BifTyp {
	NULL, LEN, RANGE, LYFUNC, CRPATH, RPLACA, RPLACD; //, CAR, CDR
	
	public static final BifTyp values[] = values();
}
/*
   92 pny
  578 Config
    6 BifTyp
   19 IConst
   19 KeywordTyp
    7 NodeCellTyp
    4 PageTyp
   41 RunConst
    4 SysFnTyp
   14 TokenTyp
   
 1050 InitMain
 
  123 AddrNode
   93 Node
  762 Page
 1610 Store
 
  562 RunCall
 1030 RunFlowCtrl
 1611 RunOperators
 1175 RunPushPop
 1536 RunScanner
 1575 RunTime
  178 RunUTime
  
 2212 ScanSrc
 1980 SynChk
 1255 SynChkExpr
  950 SynChkStmt
  
  181 ConfigTest
  135 GeneralCommonTest
   41 RtCallTest
  102 RtFlowTest
   90 RtMainTest
  195 RtOperTest
   27 RtScanTest
  158 ScanSrcTest
   72 SynChkCommonTest
  286 SynChkExprTest
  472 SynChkStmtTest
  500 SynChkTopTest
*/