/**
 * 
 */
package com.cnj.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author richard-park
 *
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class User {
	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	private Date timestamp;
	

}
