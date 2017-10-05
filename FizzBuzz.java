/*

    俺たち、FizzBuzzしてる場合なのかな…
    本当はポスター作らないとまずいんじゃないのかな?
    そんな気持ちで作ったFizzBuzzは思いの他、綺麗。

    created by Maeda. (2017/09/28)

*/


public class FizzBuzz{
    public static void main(String args[]){

        //どんだけFizzBuzzしたいんや???
        int NUM = 20;

        for(int i = 1;i < NUM + 1;i++){
            //これを出力するんやで
            String outPut = "";

            //さんの倍数はFizz追加ぁ！
            if(i % 3 == 0){
                outPut += "Fizz";
            }

            //五の倍数のはBuzzを追加やぁ！
            if(i % 5 == 0){
                outPut += "Buzz";
            }

            //あかん…出力する文字列が空っぽや…数字でも入れとこ。
            if(outPut.length() == 0){
                outPut += i;
            }

            //出力ぅぅぅ！！お待たせ！
            System.out.println(outPut);



        }
        return;

    }
}
