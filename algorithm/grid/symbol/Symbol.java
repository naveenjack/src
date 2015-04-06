package algorithm.grid.symbol;

/**
 * Defines the all possible symbols in the grid
 * 
 * @author nkumar5
 * 
 */
public enum Symbol {
	DOT("."), AT("@"), X("X"), ASTERIX("*"), TILDE("~"), CAP("^");
	/**
	 * Holds all symbols in an array
	 */
	private static final Symbol[] values = { Symbol.ASTERIX, Symbol.AT,
			Symbol.CAP, Symbol.TILDE, Symbol.DOT, Symbol.X };
	private final String symbol;

	/**
	 * Constructs Symbol
	 * 
	 * @param symbol
	 */
	Symbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * Returns character representation of the symbol
	 * 
	 * @return symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Returns Symbol instance for character representation of the symbol
	 * 
	 * @param symbolValue
	 *            character representation of the symbol
	 * @return Symbol
	 */
	public static Symbol valueFromSymbol(String symbolValue) {
		Symbol foundValue = null;
		for (Symbol symbol : values) {
			if (symbol.getSymbol().equals(symbolValue)) {
				foundValue = symbol;
				break;
			}
		}
		return foundValue;
	}
}
