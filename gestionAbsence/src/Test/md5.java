/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author seck
 */
public class md5
{
    
    public  String hachPassword(String passwordToHash){
       
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return(generatedPassword);
        
    }
    public static void main(String[] args)
    {
        md5 hach =new md5();
        String nom = "saliou";
//        System.out.println(md5.hachPassword(nom));
//        System.out.println(md5.hachPassword("mor"));
//        System.out.println(md5.hachPassword(nom));
    }

}