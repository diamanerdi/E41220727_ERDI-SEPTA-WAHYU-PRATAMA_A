package e41220727.Acara8;

public class SequientialSearch_Acara8 {  // Membuat class public SequientialSearch 

    public static void main(String[] args) { // Membuat method yang berfungsi menjalankan program ini
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1}; // Deklarasi dan inisialisasi sebuah array dengan 
                                                                // tipe data INT dengan panjang data 9 dan elemen
                                                                // elemennnya memiliki nilai berturut - turut
                                                                // 2, 9, 6, 7, 4, 5, 3, 0, dan 1
                                                                
        int target = 4; // deklarasi dan inisialisasi sebuah variabel dengan nama "target" 
                        // yang memiliki tipe data integer (int) dan diberi nilai awal 4
        sequentialSearch(exampleVariableOne, target);// Pemanggilan sebuah fungsi atau metode SequentialSearch
    }

    public static void sequentialSearch(int[] parametersOne, int parameterTwo) { // Deklarasi fungsi / method 
                                                                                 // sequentialSearch yang akan mencari
                                                                                 // keberadaan nilai array INT 
                                                                                 // ParametersOne dan ParameterTwo
        int index = -1; // inisialisasi variabel index dengan tipe data int yang diberi nilai awal -1
        
        // Melakukan perulangan dengan mencari setiap index pada array sampai mendapatkan index terakhir 
        for (int i = 0; i < parametersOne.length; i++) {
            if (parametersOne[i] == parameterTwo) {
                
                // Jika target tidak ada, index int di set dengan nilai dari i dan looping akan berhenti
                index = i;
                break;
            }
        }
        // Kondisi if else dimana jika nilai dari variabel index = -1 maka akan mengeksekusi program akan mengeksekusi
        // Targetmu integer tidak ada pada array 
        if (index == -1) { 
            System.out.println(" Targetmu integer tidak ada pada array ");
        // Namun jika tidak program akan mengeksekusi
        // Target integermu + nilai dari variabel index + ada pada array
        } else {
            System.out.println(" Target integermu = " + index + " ada pada array");
        }
    }
}

