package com.mycompany.view.controller;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import redis.clients.jedis.Jedis;

public class WelcomePage extends WebPage {

	public WelcomePage() {
		
		add(new Label("lbl", new Model<String>("<h1><align=center/><b>WELCOME TO CONNECT<h1>")));
		
		
		
	}	
		
		
}
