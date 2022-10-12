/*
 * Protonaut is an open source tool for simulate network protocols.
 *
 * Copyright (C) 2022-present  Arpan Mukhopadhyay. All rights reserved.
 * DO NOT MODIFY OR DELETE THIS FILE HEADER OR THE COPYRIGHT NOTICE.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.protonaut.engine.api;

import io.protonaut.core.message.api.IMessage;

/**
 * @author Arpan Mukhopadhyay<arixion@outlook.com>
 *
 */
public interface TransportEngine {

	/**
	 * Starts the transport engine.
	 */
	void start();

	/**
	 * Stops the transport engine.
	 */
	void stop();

	/**
	 * Releases the transport engine and underlying connections.
	 */
	void release();

	/**
	 * Sends a message over the transport layer with the given details.
	 * 
	 * @param message the message
	 */
	void send(IMessage message);
}
