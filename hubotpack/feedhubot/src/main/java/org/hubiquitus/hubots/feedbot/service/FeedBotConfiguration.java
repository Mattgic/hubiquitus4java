/*
 * Copyright (c) Novedia Group 2012.
 *
 *     This file is part of Hubiquitus.
 *
 *     Hubiquitus is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Hubiquitus is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Hubiquitus.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * 
 */
package org.hubiquitus.hubots.feedbot.service;

import java.util.List;

/**
 * @author a.benkirane
 *
 */
public interface FeedBotConfiguration {

	public String getNodeName();

    public String getTitle();

    public List<String> getAllowedRosterGroups();

    public String getFeedLink();

    public int getInterval();

    public String getMainConfJSON();

    public String toString();
}
