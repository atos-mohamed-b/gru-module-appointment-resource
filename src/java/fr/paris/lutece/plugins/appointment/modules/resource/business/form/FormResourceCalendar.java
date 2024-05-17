/*
 * Copyright (c) 2002-2024, City of Paris
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
package fr.paris.lutece.plugins.appointment.modules.resource.business.form;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalTime;

/**
 * 
 * Calendar used to represent the earliest possible time, latest possible time, and duration for an appointment in a given form
 *
 */
public class FormResourceCalendar implements Serializable
{
    private static final long serialVersionUID = -3019091766087633610L;

    /**
     * ID of the form being used
     */
    private int _nIdForm;

    /**
     * Starting time of the first possible appointment
     */
    private LocalTime _startingTime;

    /**
     * Ending time of the last possible appointment
     */
    private LocalTime _endingTime;

    /**
     * Duration of an appointment
     */
    private int _nDuration;

    /**
     * Default empty constructor
     */
    public FormResourceCalendar( )
    {
    }

    /**
     * Constructor with parameters
     * 
     * @param idForm
     *            The Form's ID
     * @param startingTime
     *            Earliest starting time for an appointment
     * @param endingTime
     *            Latest ending time for an appointment
     * @param duration
     *            Duration of an appointment
     */
    public FormResourceCalendar( int idForm, LocalTime startingTime, LocalTime endingTime, int duration )
    {
        super( );
        _nIdForm = idForm;
        _startingTime = startingTime;
        _endingTime = endingTime;
        _nDuration = duration;
    }

    public int getIdForm( )
    {
        return _nIdForm;
    }

    public void setIdForm( int idForm )
    {
        _nIdForm = idForm;
    }

    public LocalTime getStartingTime( )
    {
        return _startingTime;
    }

    public void setStartingTime( Timestamp startingTime )
    {
        _startingTime = startingTime.toLocalDateTime( ).toLocalTime( );
    }

    public LocalTime getEndingTime( )
    {
        return _endingTime;
    }

    public void setEndingTime( Timestamp endingTime )
    {
        _endingTime = endingTime.toLocalDateTime( ).toLocalTime( );
    }

    public int getDuration( )
    {
        return _nDuration;
    }

    public void setDuration( int duration )
    {
        _nDuration = duration;
    }
}
