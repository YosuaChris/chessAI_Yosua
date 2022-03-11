/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chess.engine.pieces;

import java.util.List;

/**
 *
 * @author Yosua PC
 */
public class Knight extends Piece{

    Knight(int piecePosition, final Alliance pieceAlliance){
        super(piecePosition, pieceAlliance);
    }

    @Override
    public List<Move> calculateLegalMove(Board board) {
        return null;
    }
    
}
