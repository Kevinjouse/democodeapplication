package com.wrkspot.democodeapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemocodeapplicationApplication {
    static String b = "Can I block your calendar from 5:30 to 6pm today to review/discuss on test case scenarios for HK dashboard cards ";


    public static void main(String[] args) {

        SpringApplication.run(DemocodeapplicationApplication.class, args);
        String[] arr = b.split(" ");
        int c = arr.length;
        for (int i =0;i<c;i++)
        {
            for (int j=0;j<c;j++)
            {
                if ((arr[i].length()>arr[j].length()))
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

}
