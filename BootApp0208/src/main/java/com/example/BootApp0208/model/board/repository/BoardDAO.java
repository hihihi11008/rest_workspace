package com.example.BootApp0208.model.board.repository;

import java.util.List;

import com.example.BootApp0208.model.domain.Board;

public interface BoardDAO {
	public List selectAll();
	public Board select(int board_id);
	public void insert(Board board);
	public void update(Board board);
	public void delete(int board_id);
}
