/*
 * VerticalBox -- Tries to look same as JavaFX 's VBox
 * Copyright (C) 2022 Omega UI

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package omegaui.component;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JComponent;

public class VerticalBox extends JPanel{

	private int gap = 5;

	public VerticalBox(){
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setAlignmentX(CENTER_ALIGNMENT);
	}

	public VerticalBox addGap(){
		addGap(gap);
		return this;
	}

	public VerticalBox addGap(int gap){
		add(Box.createVerticalStrut(gap));
		return this;
	}

	public VerticalBox push(JComponent c){
		add(c);
		c.setAlignmentX(getAlignmentX());
		addGap();
		return this;
	}

	public int getGap() {
		return gap;
	}
	
	public VerticalBox setGap(int gap) {
		this.gap = gap;
		return this;
	}

	public static VerticalBox create(){
		return new VerticalBox();
	}

}
