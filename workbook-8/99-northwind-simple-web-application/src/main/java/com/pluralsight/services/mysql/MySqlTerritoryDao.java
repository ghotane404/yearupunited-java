package com.pluralsight.services.mysql;

import com.pluralsight.models.Territory;
import com.pluralsight.services.TerritoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;

@Service
public class MySqlTerritoryDao implements TerritoryDao {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public MySqlTerritoryDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public ArrayList<Territory> getTerritoriesByRegion(int searchRegionId) {
		ArrayList<Territory> territories = new ArrayList<>();

		String sql = """
			    SELECT TerritoryID
			        , TerritoryDescription
				    , RegionID
			    FROM territories
			    WHERE RegionID = ?
				""";

		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, searchRegionId);

		while (row.next()) {
			Territory territory = mapRowToTerritory(row);
			territories.add(territory);
		}

		return territories;
	}

	public Territory getTerritory(int territoryId) {
		String sql = """
			    SELECT TerritoryID
			 		, TerritoryDescription
				    , RegionID
			    FROM territories
			    WHERE TerritoryID = ?
				""";

		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, territoryId);

		if (row.next()) {
			Territory territory = mapRowToTerritory(row);
			return territory;
		}
		return null;
	}

	public void addTerritory(Territory territory) {
		String sql = """
		        INSERT INTO territories (TerritoryID, TerritoryDescription, RegionID) 
		        VALUES (?, ?, ?)
				""";

		jdbcTemplate.update(sql
		, territory.getTerritoryDescription()
		, territory.getRegionId()
		, territory.getRegionId());
	}

	public void updateTerritory(Territory territory) {
		String sql = """
		        UPDATE territories
		        SET TerritoryDescription= ?
		            , RegionID= ? 
		        WHERE TerritoryID = ?
				""";

		jdbcTemplate.update(sql
				, territory.getTerritoryDescription()
				, territory.getRegionId()
				, territory.getTerritoryId());
	}

	public void deleteTerritory(int territoryId) {
		String sql = """
				DELETE FROM territories
				WHERE TerritoryID = ?
				""";

		jdbcTemplate.update(sql, territoryId);
	}

	private Territory mapRowToTerritory(SqlRowSet row) {
		int territoryId = row.getInt("TerritoryID");
		String territoryDescription = row.getString("TerritoryDescription");
		int regionId = row.getInt("RegionID");

		return new Territory(territoryId, territoryDescription, regionId);
	}

}