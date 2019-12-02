package array;

public class array {
    public static void main(String[] args) {

        int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};
        String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};

        System.out.println(countnumbers(numbers));
        System.out.println(counttom(names));
        System.out.println(mostandleast(numbers));


    }



    /**
     *  checks the number of sevens in the array
     * @param numbers
     * @return seven
     */
    private static int countnumbers(int[]numbers) {
        int seven = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 7) {

                seven++;
            }
        }
        return seven;

    }

    /**
     * Checks how many is named tom
     * @param names
     * @return tom
     */
    private static int counttom(String[]names) {
        int tom = 0;
        for (int i = 0; i < names.length; i++) {

            if (names[i] == "Tom") {
                tom ++;
            }
        }
        return tom;
    }

    public static int mostandleast(int[]numbers) {

        int count = 1, tempcount;
        int popular = numbers[0];
        int temp = 0;

        for (int i = 0; i < (numbers.length - 1); i++) {
            temp = numbers[i];
            tempcount = 0;
            for (int j = 1; j < numbers.length; j++) {
                if (temp == numbers[j]) {
                    tempcount++;
                }
                if (tempcount > count) {
                    popular = temp;
                    count = tempcount;
                }
            }
            return popular;
        }


    }
}
