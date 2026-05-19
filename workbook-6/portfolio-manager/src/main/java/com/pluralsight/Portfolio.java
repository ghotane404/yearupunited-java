package com.pluralsight;
import com.pluralsight.finance.Valuable;

import java.util.ArrayList;
import java.util.Collections;

public class Portfolio implements Valuable{
	String name;
	String owner;
	ArrayList<Valuable> assets = new ArrayList<>();

	public Portfolio (String name, String owner){
		this.name = name;
		this.owner = owner;
	}

	public void add(Valuable asset){
		assets.add(asset);
	}

	public Valuable getMostValuable(){
		Valuable max = assets.get(0);      // setting the first value from AL as the max

		for(Valuable asset : assets){
			if (asset.getValue() > max.getValue()) {
				max = asset;
			}
		}
//		return Collections.max(assets);
		return max;
	}

	public Valuable getLeastValuable(){
		Valuable min = assets.get(0);      // setting the first value from AL as the min
		for(Valuable asset : assets){
			if (asset.getValue() < min.getValue()) {
				min = asset;
			}
		}
//		return  Collections.min(assets);
		return min;
	}

	@Override
	public double getValue(){
		double totalValue = 0;
		for(Valuable asset : assets){
			totalValue += asset.getValue();
		}
		return totalValue;
	}
}
