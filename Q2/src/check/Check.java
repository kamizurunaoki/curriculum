package check;					
import java.util.jar.Attributes.Name;					
					
public class Check {					
					
public static void main(String[] args) {					
					
//Q1 test1インスタンスを生成(苗字と名前は１のものを使うこと)					

User user = new User ("firstName1","lastName1") ;
					
//Q2 test2インスタンスを生成(苗字と名前は２のものを使うこと)					
					
Name name = new Name ("firstName2","lastName2")	;	

//Q3 test1とtest2の2人の名前を表示					
user.printAccountInfo ();
name.printAccountInfo ();		
//Q5 上記で作成したtest1インスタンスを利用してCheck2.javaのQ4 ageメソッド動かすこと(※ 先にQ4の問題を解くこと)					
					
					
//Q6 上記で作成したtest2インスタンスを利用してCheck2.javaのQ4 ageメソッド動かすこと(※ 先にQ4の問題を解くこと)					
					
					
//Q7 Check2.javaのQ4 ageメソッドの出力結果が「値は無効です」となるようにageメソッドを動かすこと(※ 先にQ4の問題を解くこと)					
					
					
 //Q9 上記で作成したtest1インスタンスを利用してCheck2.javaのQ8 nameOneメソッドを動かすこと(※ 先にQ8の問題を解くこと)					
					
}					
}					