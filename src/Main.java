public class Main {
    public static void main(String[] args) {
        String ABC = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String txt = "ЗТЕФТИ ЧЦФТ!\n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";

        CDecode dec = new CDecode(ABC);

        String[] str = txt.split("\n");
        System.out.println(dec.decode(str[0], -4));
        System.out.println(dec.decode(str[1], +8));
        for (int i = -16; i<17; i++) {
            System.out.println(dec.decode(str[2], i));
        }

        String[] words = str[3].split(" ");
        for (int i = 0; i < 10; i++) {
            for (int j = -16; j<17; j++){
                System.out.print(dec.decode(words[i], j) + " ");
            }
            System.out.println();
        }
    }
}
