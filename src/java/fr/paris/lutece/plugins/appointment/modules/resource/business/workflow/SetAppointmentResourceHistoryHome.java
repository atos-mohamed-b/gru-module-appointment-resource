/*
 * Copyright (c) 2002-2018, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.appointment.modules.resource.business.workflow;

import fr.paris.lutece.plugins.workflow.modules.appointment.service.WorkflowAppointmentPlugin;
import fr.paris.lutece.portal.service.plugin.Plugin;
import fr.paris.lutece.portal.service.plugin.PluginService;
import fr.paris.lutece.portal.service.spring.SpringContextService;

import java.util.List;

/**
 * Home for set appointment resource history
 */
public final class SetAppointmentResourceHistoryHome
{
    private static ISetAppointmentResourceHistoryDAO _dao = SpringContextService.getBean( ISetAppointmentResourceHistoryDAO.BEAN_NAME );
    private static Plugin _plugin = PluginService.getPlugin( WorkflowAppointmentPlugin.PLUGIN_NAME );

    /**
     * Private default constructor
     */
    private SetAppointmentResourceHistoryHome( )
    {
        // Nothing to do
    }

    /**
     * Create a new history
     * 
     * @param historyNotif
     *            The history to insert into the database
     */
    public static void create( SetAppointmentResourceHistory historyNotif )
    {
        _dao.create( historyNotif, _plugin );
    }

    /**
     * Get an history from its primary key
     * 
     * @param nId
     *            The primary key
     * @return The history
     */
    public static SetAppointmentResourceHistory findByPrimaryKey( int nId )
    {
        return _dao.findByPrimaryKey( nId, _plugin );
    }

    /**
     * Get the list of history associated with a given history id
     * 
     * @param nIdHistory
     *            The history id
     * @return the list of history, or an empty list if none was found
     */
    public static List<SetAppointmentResourceHistory> findByIdHistory( int nIdHistory )
    {
        return _dao.findByIdHistory( nIdHistory, _plugin );
    }

    /**
     * Remove an history from its primary key
     * 
     * @param nId
     *            The primary key
     */
    public static void delete( int nId )
    {
        _dao.delete( nId, _plugin );
    }

    /**
     * Remove every history associated with a given appointment
     * 
     * @param nIdAppointment
     *            The id of the appointment
     */
    public static void deleteByIdAppointment( int nIdAppointment )
    {
        _dao.deleteByIdAppointment( nIdAppointment, _plugin );
    }
}
