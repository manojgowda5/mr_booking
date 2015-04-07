/*
 *  Copyright (c) Microsoft. All rights reserved. Licensed under the MIT license. See full license at the bottom of this file.
 */
package com.microsoft.office365.snippetapp.helpers;

import android.content.Context;

import com.microsoft.office365.snippetapp.O365Stories.AcceptEventInviteStory;
import com.microsoft.office365.snippetapp.O365Stories.BaseUserStory;
import com.microsoft.office365.snippetapp.O365Stories.CreateContactStory;
import com.microsoft.office365.snippetapp.O365Stories.CreateEventStory;
import com.microsoft.office365.snippetapp.O365Stories.CreateNewFileStory;
import com.microsoft.office365.snippetapp.O365Stories.CreateOneDriveFolderStory;
import com.microsoft.office365.snippetapp.O365Stories.DeclineEventInviteStory;
import com.microsoft.office365.snippetapp.O365Stories.DeleteFileFromServerStory;
import com.microsoft.office365.snippetapp.O365Stories.DeleteOneDriveFolderStory;
import com.microsoft.office365.snippetapp.O365Stories.DownloadFileStory;
import com.microsoft.office365.snippetapp.O365Stories.EventsFetcherStory;
import com.microsoft.office365.snippetapp.O365Stories.ForwardEmailMessageStory;
import com.microsoft.office365.snippetapp.O365Stories.GetContactsStory;
import com.microsoft.office365.snippetapp.O365Stories.GetEmailMessagesStory;
import com.microsoft.office365.snippetapp.O365Stories.GetFilesAndFoldersStory;
import com.microsoft.office365.snippetapp.O365Stories.ReplyToEmailMessageStory;
import com.microsoft.office365.snippetapp.O365Stories.SendEmailMessageStory;
import com.microsoft.office365.snippetapp.O365Stories.UpdateContactStory;
import com.microsoft.office365.snippetapp.O365Stories.UpdateEventStory;
import com.microsoft.office365.snippetapp.O365Stories.UpdateFileContentsOnServerStory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandList {
    /**
     * An array of story scenarios.
     */
    public List<BaseUserStory> ITEMS = new ArrayList<>();

    /**
     * A map of story scenarios, by ID.
     */
    static final Map<String, BaseUserStory> ITEM_MAP = new HashMap<>();

    /*
    * Add stories to the public story list and story map.
     */
    public CommandList(Context context) {
        List<BaseUserStory> baseUserStories = Arrays.asList(
                new SendEmailMessageStory(context),
                new GetEmailMessagesStory(),
                new ReplyToEmailMessageStory(context),
                new ForwardEmailMessageStory(context),
                new GetContactsStory(),
                new CreateContactStory(context),
                new UpdateContactStory(context),
                new CreateEventStory(context),
                new EventsFetcherStory(),
                new UpdateEventStory(context),
                new AcceptEventInviteStory(),
                new DeclineEventInviteStory(context),
                new GetFilesAndFoldersStory(),
                new CreateNewFileStory(),
                new UpdateFileContentsOnServerStory(),
                new DeleteFileFromServerStory(),
                new DownloadFileStory(),
                new CreateOneDriveFolderStory(),
                new DeleteOneDriveFolderStory()
        );
        for (BaseUserStory object : baseUserStories) {
            ITEM_MAP.put(object.getId(), object);
        }
        ITEMS = baseUserStories;
    }
}
// *********************************************************
//
// O365-Android-Snippets, https://github.com/OfficeDev/O365-Android-Snippets
//
// Copyright (c) Microsoft Corporation
// All rights reserved.
//
// MIT License:
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//
// *********************************************************
