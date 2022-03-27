package com.customer.dao;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.customer.bean.UserResponse;
import com.opencsv.CSVReader;

@Repository
public class CustomerDao {
	private static final String CSV_PATH = "customer.csv";

	public List<UserResponse> readCsvData() {
		List<UserResponse> customerList = new ArrayList<>();
		InputStream is = getClass().getClassLoader().getResourceAsStream(CSV_PATH);
		CSVReader reader = null;
		try {
			reader = new CSVReader(new InputStreamReader(is, StandardCharsets.UTF_8));
			String[] nextLine = null;
			while ((nextLine = reader.readNext()) != null && nextLine.length == 4) {
				UserResponse response = new UserResponse();

				response.setId(nextLine[0]);

				response.setName(nextLine[1]);

				response.setAddress(nextLine[2]);

				response.setDob(nextLine[3]);
				customerList.add(response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}
}
