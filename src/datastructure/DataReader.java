package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//copied the path pf self-driving-car
		String textFile = "C:\\Users\\alistair\\MidtermJuly2017\\src\\data\\self-driving-car";

		FileReader fr = new FileReader(textFile);		//used to read the file
		BufferedReader br = new BufferedReader(fr);

		String ln = "";

		while((ln = br.readLine()) != null){
			System.out.println(ln);
		}

		br.close(); // fixed the error by using throws IOException or we can also use try catch method



	}

}
