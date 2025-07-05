package com.hnguyen.jee.soap;

import jakarta.ejb.Stateless;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;


/***
 * Service for getting and updating score
 * @author hnguyen
 */
@Stateless
@WebService
public class ScoreService {

	private Score score = new Score(); 
	
	/**
	 * @WebMethod will take methode name
	 * @return
	 */
	public Score getScore() {
		return score;
	}
	
	@WebMethod(operationName = "updateScore")
	public void update(int w, int l, int t) {
		score.wins=w;
		score.losses = l;
		score.ties=t;
	}
}
