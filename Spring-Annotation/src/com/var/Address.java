package com.var;

public class Address {
		private int houseNo;
		private String locality;
		private String city;
		
		public Address() {
			houseNo=0;
			locality="";
			city="";
		}
		public Address(int houseNo,String locality,String city) {
			this.houseNo = houseNo;
			this.locality = locality;
			this.city=city;
		}
		@Override
		public String toString() {
			return "House No"+houseNo+
					",\n"+locality+
					",\n"+city;
		}

}
