package com.example.todo.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.dao.Dao;

public class ToDoManager {
	private Dao<ToDo, Integer> todoDao = null;

	public void setTodoDao(Dao<ToDo, Integer> todoDao) {
		this.todoDao = todoDao;
	}

	public List<ToDo> getTodos() throws SQLException {
		return todoDao.queryForAll();
	}
	
	public ToDoManager() {
		super();
	}

	public void removeAtId(int id) throws SQLException {
		todoDao.deleteById(id);
		
	}

	public ToDo findById(int id) throws SQLException {
		return todoDao.queryForId(id);
	}

}
