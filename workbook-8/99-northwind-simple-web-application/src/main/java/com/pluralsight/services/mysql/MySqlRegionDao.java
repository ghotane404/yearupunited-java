package com.pluralsight.services.mysql;

import com.pluralsight.models.Region;
import com.pluralsight.services.RegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;

@Service
public class MySqlRegionDao implements RegionDao {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public MySqlRegionDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public ArrayList<Region> getRegions() {
		ArrayList<Region> regions = new ArrayList<>();

		String sql = """
				    SELECT RegionID
				        , RegionDescription
				    FROM Region
				""";

		SqlRowSet row = jdbcTemplate.queryForRowSet(sql);

		while (row.next()) {
			Region region = mapRowToRegion(row);
			regions.add(region);
		}

		return regions;
	}

	public Region getRegion(int regionId) {
		String sql = """
				    SELECT RegionID
				        , RegionDescription
				    FROM Region
				    WHERE RegionID = ?
				""";

		SqlRowSet row = jdbcTemplate.queryForRowSet(sql, regionId);
		if (row.next()) {
			Region region = mapRowToRegion(row);
			return region;
		}
		return null;
	}

	public void addRegion(Region region) {
		String sql = """
		        INSERT INTO Region (RegionDescription, RegionID) 
		        VALUES (?, ?)
				""";

		jdbcTemplate.update(sql
				, region.getRegionDescription()
				, region.getRegionId());
	}

	public void updateRegion(Region region) {
		String sql = """
		        UPDATE Region
		        SET RegionDescription= ?
		            , RegionID = ?
		        WHERE RegionID = ?
				""";

		jdbcTemplate.update(sql
				, region.getRegionDescription()
				, region.getRegionId());
	}

	public void deleteRegion(int regionId) {
		String sql = """
				DELETE FROM Region
				WHERE RegionID = ?
				""";

		jdbcTemplate.update(sql, regionId);
	}

	private Region mapRowToRegion(SqlRowSet row) {
		int regionId = row.getInt("RegionID");
		String regionDescription = row.getString("RegionDescription");

		return new Region(regionId, regionDescription);
	}
	
	
}
