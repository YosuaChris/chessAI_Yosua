package com.chess.engine.pieces;

import java.util.List;

/**
 *
 * @author Yosua PC
 */
public abstract class Piece {
    
    protected final int piecePosition;
    protected final Alliance  pieceAlliance;
    
    Piece(final int piecePosition, final Alliance pieAlliance){
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieAlliance;
    }
    
    public abstract List<Move> calculateLegalMove(final Board board);
}
