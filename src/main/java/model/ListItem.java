/**
 * @author CyrusBrucker - cbrucker19
 * CIS175 - Spring 2022
 * ${date}
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ListItem {
		@Id
		@GeneratedValue
		@Column(name = "ID")
		private int id;
		@Column(name = "STORE")
		private String store;
		@Column(name = "ITEM")
		private String item;

		//Default no argument Contrustor
		public ListItem() {

		}
		//Constructor
		public ListItem(String store, String item) {
			this.store = store;
			this.item = item;
		}
		//Getters and Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStore() {
			return store;
		}
		public void setStore(String store) {
			this.store = store;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		@Override
		public String toString() {
			return "ListItem [id=" + id + ", store=" + store + ", item=" + item + "]";
		}
		//Printing method
		public String returnItemDetails() {
			return this.store + ":" + this.item;
		}
}
