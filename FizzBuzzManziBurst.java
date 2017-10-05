/*

    最低のFizzBuzzをお届け.
    ACE大坪 a.k.a Lightning Gazer　が意外と普通なプログラム作ってて悲しい.
    私は最低なプログラムを作り続ける.

    created by KingDom Po"Say"DoN a.k.a Maeda . (2017/09/28)

*/


public class FizzBuzzManziBurst{
    public static void main( String[]  args ) {

        for(int i = 1;i < 21;i++){

            //FizzBuzzしてないか保存しとくぜ…。卍ィ!!
            boolean manzi = true;

            //1から20のうち三の倍数のもの！！
            if(i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18){
                System.out.print("Fizz!!");
                manzi = false;
            }

            //1から20のうち後の倍数のもの！！
            if(i == 5 || i == 10 || i == 15 || i == 20){
                System.out.print("Buzz!!");
                manzi = false;
            }

            //FizzBuzzしてねぇなら数字出しとけ!!
            if(manzi){
                System.out.print(i);
            }

            System.out.println();


        }
        return;

    }
}
