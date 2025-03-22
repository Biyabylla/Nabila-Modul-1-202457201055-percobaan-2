/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NabilaModul1_202457201055_Percobaan2;

/**
 *
 * @author Nabila
 */
public class NabilaModul1_202457201055_Percobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PERCOBAAN KEDUA
        String [][] data = {
            {"ABDUL", "085646668991", "Kediri"},
            {"KUSNO", "085646668992", "Trenggalek"},
            {"PONIRAN", "085646668999", "Bojonegoro"},
        };
        System.out.println("-------------+--------------+---------------");
        System.out.printf("| %-10s | %-12s | %-12s |%n", 
                centerText("NAMA", 10), 
                centerText("TELEPON", 12), 
                centerText("ALAMAT", 12)
        );
        System.out.println("-------------+--------------+---------------");
        
        for (String[] row : data){
            System.out.printf("| %-10s | %-12s | %-12s |%n", row[0], row[1], row[2]);
        }
        System.out.println("-------------+--------------+---------------");
    }
        public static String centerText(String text, int width){
            int padding = (width - text.length()) / 2;
            String format = "%" + (padding + text.length()) + "s";
            return String.format(format, text);
    }
}