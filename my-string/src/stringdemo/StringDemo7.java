package stringdemo;

public class StringDemo7 {
    /*
        截取身份证号码的信息，只截取生日（第7位~14位）和性别（第17位）就可以
     */
    public static void main(String[] args) {
        String idCardNum="210104199507014913";
        System.out.println("人物信息：");
        System.out.println("出生年月日为："+getBirth(idCardNum));
        System.out.println("性别为："+getGender(idCardNum));
    }

    //截取身份证号的生日信息
    public static String getBirth(String input){
        String birth= input.substring(6,14);
        StringBuilder sb=new StringBuilder(birth);
        return sb.insert(4,"年").insert(7,"月").insert(10,"日").toString();
    }

    //截取性别信息
    public static String getGender(String input){
        String Gender = input.substring(16,17);
        String [] genderNum={"1","3","5","7","9"};
        for (int i = 0; i < genderNum.length; i++) {
            if(Gender.equals(genderNum[i])){
                Gender="男";
                break;
            }else {
                Gender="女";
                break;
            }
        }
        return Gender;
    }
}
