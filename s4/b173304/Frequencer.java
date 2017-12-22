package s4.b173304; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID. 
import java.lang.*;
import s4.specification.*;

/*
interface FrequencerInterface {     // This interface provides the design for frequency counter.
    void setTarget(byte[]  target); // set the data to search.
    void setSpace(byte[]  space);  // set the data to be searched target from.
    int frequency(); //It return -1, when TARGET is not set or TARGET's length is zero
                    //Otherwise, it return 0, when SPACE is not set or Space's length is zero
                    //Otherwise, get the frequency of TAGET in SPACE
    int subByteFrequency(int start, int end);
    // get the frequency of subByte of taget, i.e target[start], taget[start+1], ... , target[end-1].
    // For the incorrect value of START or END, the behavior is undefined.
*/

/*
interface FrequencerInterface {     //このインタフェースは、周波数カウンタの設計を提供します。
    void setTarget(byte[]  target); //検索するデータを設定します。
    void setSpace(byte[]  space);  //検索対象となるデータを設定します。
    int frequency(); // TARGETが設定されていないか、TARGETの長さがゼロの場合は-1を返します
                    //それ以外の場合は、SPACEが設定されていないか、スペースの長さがゼロの場合は0を返します
                    //それ以外の場合は、SPACEのTARGETの頻度を取得します。
    int subByteFrequency(int start, int end);
    // target [start]、target [start + 1]、...、target [end-1]のように、targetのsubByteの頻度を取得します。
    // STARTまたはENDの値が正しくない場合の動作は未定義です。
}
*/


public class Frequencer implements FrequencerInterface{
    // Code to Test, *warning: This code  contains intentional problem*
    byte [] myTarget;
	byte [] mySpace;
	boolean flag1 = false;
	boolean flag2 = false;
	
    public void setTarget(byte [] target) { myTarget = target; flag1 = true; }
    public void setSpace(byte []space) { mySpace = space; flag2 = true; }
    public int frequency() {
		if(flag1 == false || myTarget.length == 0) { return -1; }
		else if(flag2 == false || mySpace.length == 0) { return 0; }

		int targetLength = myTarget.length;
		int spaceLength = mySpace.length;
		int count = 0;
		//System.out.println(targetLength+" "+spaceLength);
		for(int start = 0; start < spaceLength ; start++) { // Is it OK?
			boolean abort = false;
			for(int i = 0; i<targetLength; i++) {
				//System.out.println(i+start+" "+spaceLength);
				if( (i+start) == spaceLength || myTarget[i] != mySpace[start+i]) { abort = true; break; }
			}
			if(abort == false) { count++; }
		}
		return count;
    }

    // I know that here is a potential problem in the declaration.
    public int subByteFrequency(int start, int length) { 
	// Not yet, but it is not currently used by anyone.

	return -1;
    }

    public static void main(String[] args) {
	Frequencer myObject;
	int freq;
	try {
	    System.out.println("checking my Frequencer");
	    myObject = new Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}
    }
}	    
	    
