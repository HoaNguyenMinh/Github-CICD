package com.hnguyen.jee.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author hnguyen
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Score {
	
	int wins;
	int losses;
	int ties;

}
