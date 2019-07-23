package com.techchefs.warehouse.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="items")
public class ItemsBean implements Serializable{
	@Id
	@Column(name="item_id")
	private int itemId;
	@Column(name="item_name")
	private String itemName;
	@Column(name="cost")
	private double cost;
	@Column(name="description")
	private String description;
	@Column(name="capacity")
	private int capacity;
}
