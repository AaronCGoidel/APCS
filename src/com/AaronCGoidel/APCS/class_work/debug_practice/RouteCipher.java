package com.AaronCGoidel.APCS.class_work.debug_practice;

public class RouteCipher {
	private String[][] letterBlock;
	private int numRows;
	private int numCols;
	
	public RouteCipher(int r, int c) {
		numRows = r;
		numCols = c;
		letterBlock = new String[numRows][numCols];
	}
	
	private void fillBlock(String str) {
		int index = 0;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if (index < str.length()) {
					letterBlock[i][j] = str.substring(index, index + 1);
					index++;
				} else {
					letterBlock[i][j] = "A";
				}
			}
		}
	}
	
	private String encryptBlock() {
		String encryptedBlock = "";
		for (int c = 1; c < numCols; c++) {
			for (int r = 1; r < numRows; r++) {
				encryptedBlock += letterBlock[r][c];
			}
		}
		return encryptedBlock;
	}
	
	public String encryptMessage(String message) {
		String encryptedMessage = "";
		int chunkSize = numRows * numCols;
		int index = 0;
		while (index < message.length()) {
			fillBlock(message.substring(index));
			encryptedMessage += encryptBlock();
			index += chunkSize;
		}
		return encryptedMessage;
	}
}
