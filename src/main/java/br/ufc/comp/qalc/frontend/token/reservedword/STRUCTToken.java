package br.ufc.comp.qalc.frontend.token.reservedword;

import br.ufc.comp.qalc.frontend.token.Token;

public class STRUCTToken extends Token {

    public STRUCTToken(long line, long start, long end) {
        super(line, start, end);
        stringValue = "struct";
    }

    @Override
    public String getTokenIdentifier() {
        return "STRUCT";
    }
}
