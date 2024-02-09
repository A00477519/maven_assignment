package com.smu.mscda;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This program capitalizes input strings and md5");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an input");
        String input = sc.nextLine();
//        System.out.println((input));
        System.out.println("md5 is: "+ GenerateMD5(input));
        System.out.println("md5 is: "+ GenerateCapital(input));
    }
    public static String GenerateMD5(String input){
        String md5Hex = DigestUtils.md5Hex(input);
        return md5Hex;
    }

    public static String GenerateCapital(String input){
        String Capital = StringUtils.capitalize(input);
        return Capital;
    }



}




