package com.kata.sgcib.ManageBankAccount.Enum;

public enum Operation {
		
		/** The deposit. */
		DEPOSIT(1),
		
		/** The withdrawal. */
		WITHDRAWAL(2);
		
		/** The value. */
		private int value;

		/**
		 * Instantiates a new operation.
		 *
		 * @param value the value
		 */
		private Operation(int value) {
		      this.value = value;
		   }

		/**
		 * Gets the value.
		 *
		 * @return the value
		 */
		public int getValue() {
			return value;
		}
}
