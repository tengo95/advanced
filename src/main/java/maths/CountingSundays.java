//package maths;
//
///*
//You are given the following information, but you may prefer to do some research for yourself.
//
//        1 Jan 1900 was a Monday.
//        Thirty days has September,
//        April, June and November.
//        All the rest have thirty-one,
//        Saving February alone,
//        Which has twenty-eight, rain or shine.
//        And on leap years, twenty-nine.
//
//        A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
//        How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
//*/
//
//public class CountingSundays {
//    public static void main(String[] args) {
//
//        int daysInYear;
//        int numSundays = 0;
//        int totalDays = 0;
//
//       int[][] daysInMonths = new int[12][];
//
//
//
//
//       for (int i = 1; i <= 12; i++) {
//
//           if (i == 9 || i == 4 || i == 6 || i == 11) {
//               daysInMonths[i][31]
//           }
//       }
//
//
//        for (int year = 1901; year <= 2000; year++) {
//            if (year%4 == 0 && year%100 != 0 && year%400 == 0) {
//                daysInYear = 366;
//                totalDays += daysInYear;
//            }
//        }
//
//        for (int i = 0; i < totalDays; i+= 7) {
//            numSundays++;
//            //use daysInMonths[][]
//
//        }
//
//    }
//}
