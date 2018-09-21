package org.adempiere.util;

/*
 * #%L
 * de.metas.swat.base
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


import org.adempiere.test.UnitTestTools;
import org.junit.Assert;
import org.junit.Test;

import de.metas.util.time.SystemTime;

public class MiscUtilsIsTodayTest {

	@Test
	public void today() {
		
		Assert.assertTrue(MiscUtils.isToday(SystemTime.asTimestamp()));
	}

	@Test
	public void yesterDay() {

		Assert.assertFalse(MiscUtils.isToday(UnitTestTools.daysBefore(1)));
	}

	@Test
	public void tomorrow() {

		Assert.assertFalse(MiscUtils.isToday(UnitTestTools.daysAfter(1)));
	}

}
