package com.capgemini.bechdalo.dao;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.bechdalo.pojo.userDetails;

public class registerDAO {
static ArrayList<userDetails> user=new ArrayList<userDetails>();
static userDetails uDetails;
static {
	user.add(new userDetails("tanya","tan1","tanya@gmail.com","Winter.1480","Pagal khana","9540752995","female"));
	user.add(new userDetails("tanya","tan1","tanya@gmail.com","Winter.1480","Pagal khana","9540752995","female"));
	user.add(new userDetails("tanya","tan1","tanya@gmail.com","Winter.1480","Pagal khana","9540752995","female"));
	
}
public static void insert(userDetails u)
{
	
	user.add(u);
	System.out.println(user);
}

public static int validate(String userName, String password) {
	int flag=0;
	java.util.Iterator<userDetails> itr=user.iterator();
	while(itr.hasNext())
	{
		userDetails uD=(userDetails)itr.next();
	if(userName.equals(uD.getUserName()) && password.equals(uD.getPassword()))
	{
		flag=1;
		break;
	}
	}
		return flag;
		
	
	}
}
