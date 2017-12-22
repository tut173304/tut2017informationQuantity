package s4.b173304; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID. 
import java.lang.*;
import s4.specification.*;

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

/*
package s4.specification;
public interface InformationEstimatorInterface{
    void setTarget(byte target[]); //情報量を計算するためのデータを設定する
    void setSpace(byte space[]); //サンプル空間のデータをコンピュータ確率に設定する
    double estimation(); //ターゲットが設定されていないか、ターゲットの長さがゼロの場合は0.0を返します。
// true値が無限大の場合、または空白が設定されていない場合は、Double.MAX_VALUEを返します。
// true値がfineteでDouble.MAX_VALUEより大きい場合の動作は未定義です。
//これは、スペースが不当に大きい場合にのみ発生することに注意してください。 とにかく他の問題に遭遇します。
//そうでなければ、情報量の推定、
}                        
*/

public class TestCase {
    public static void main(String[] args) {
	try {
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("<< checking s4.b173304.Frequencer >>");
	    myObject = new s4.b173304.Frequencer();
		myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    //myObject.setSpace("".getBytes());		
		myObject.setTarget("Ho".getBytes());
	    //myObject.setTarget("".getBytes());		
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
		System.out.println("Exception occurred: STOP");
	    System.out.println(e);
	}

	try {
	    InformationEstimatorInterface myObject;
		double value;
	    System.out.println("");
	    System.out.println("<< checking s4.b173304.InformationEstimator >>");
	    myObject = new s4.b173304.InformationEstimator();
		myObject.setSpace("3210321001230123".getBytes());
		//myObject.setTarget("0".getBytes());
	    value = myObject.estimation();
	    System.out.println("target doesn't set : "+value);// not set
		myObject.setTarget("".getBytes());// length == 0
	    value = myObject.estimation();
	    System.out.println("length = 0 : "+value);
	    myObject.setTarget("0".getBytes());
	    value = myObject.estimation();
		System.out.println(">0 "+value);
	    myObject.setTarget("01".getBytes());//Get Byte
	    value = myObject.estimation();
	    System.out.println(">01 "+value);
	    myObject.setTarget("0123".getBytes());
	    value = myObject.estimation();
	    System.out.println(">0123 "+value);
	    myObject.setTarget("00".getBytes());
	    value = myObject.estimation();
	    System.out.println(">00 "+value);
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

	// try {
	//     FrequencerInterface  myObject;
	//     int freq;
	//     System.out.println("checking s4.b173304.Frequencer");
	//     myObject = new s4.b173304.Frequencer();
	//     myObject.setSpace("pen-pineapple apple-pen".getBytes());
	//     myObject.setTarget("p".getBytes());
	//     freq = myObject.frequency();
	// 	System.out.println("\"p\" in \"pen-pineapple apple-pen\" appears "+freq+" times. ");
	// 	myObject.setTarget("apple".getBytes());
	//     freq = myObject.frequency();
	//     System.out.println("\"apple\" in \"pen-pineapple apple-pen\" appears "+freq+" times. ");
	//     if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	// }
	// catch(Exception e) {
	//     System.out.println("Exception occurred: STOP");
	// }

	// try {
	//     InformationEstimatorInterface myObject;
	//     double value;
	//     System.out.println("checking s4.b173304.InformationEstimator");
	//     myObject = new s4.b173304.InformationEstimator();
	//     myObject.setSpace("543210543210012345012345".getBytes());
	//     myObject.setTarget("0".getBytes());
	//     value = myObject.estimation();
	//     System.out.println(">0 "+value);
	//     myObject.setTarget("01".getBytes());//Get Byte
	//     value = myObject.estimation();
	//     System.out.println(">01 "+value);
	//     myObject.setTarget("0123".getBytes());
	//     value = myObject.estimation();
	//     System.out.println(">0123 "+value);
	//     myObject.setTarget("00".getBytes());
	//     value = myObject.estimation();
	// 	System.out.println(">00 "+value);
	// 	myObject.setTarget("5".getBytes());
	//     value = myObject.estimation();
	// 	System.out.println(">5 "+value);
	// 	myObject.setTarget("05".getBytes());
	//     value = myObject.estimation();
	// 	System.out.println(">05 "+value);
	// 	myObject.setTarget("012345".getBytes());
	//     value = myObject.estimation();
	// 	System.out.println(">012345 "+value);
	// }
	// catch(Exception e) {
	//     System.out.println("Exception occurred: STOP");
	// }
	}
}	    
	    
