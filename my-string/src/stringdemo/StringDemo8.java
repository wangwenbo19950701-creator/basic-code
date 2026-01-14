package stringdemo;

public class StringDemo8 {
    /*
        敏感词替换
     */
    public static void main(String[] args) {
        String words="123,cnm,cnm";
        System.out.println(changeWords(words));
    }

    //判断并替换敏感词
    public static String changeWords(String input){
        String[] wordsDataBase = {"cnm","fuckyou","fuck you","rnm","sb"};

        String checkWords = input;
        for (int i = 0; i <wordsDataBase.length ; i++) {
//            if(checkWords.equals(wordsDataBase[i])){
                checkWords= checkWords.replace(wordsDataBase[i],"***");
//                   break;
//            }
        }
        return checkWords;
    }
}
