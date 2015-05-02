package com.example.a0131914.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.ConflictException;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.cmd.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Named;

import static com.example.a0131914.myapplication.backend.OfyService.ofy;

@Api(name = "newsStoryEndpoint", version = "v1", namespace = @ApiNamespace(ownerDomain = "api.tinyMouse.com", ownerName = "api.tinyMouse.com", packagePath=""))
public class NewsStoryEndpoint {

    // Make sure to add this endpoint to your web.xml file if this is a web application.

    private static final Logger LOG = Logger.getLogger(NewsStoryEndpoint.class.getName());

    public NewsStoryEndpoint() {
    }

    /**
     * Return a collection of NewsStorys
     *
     * @param count The number of NewsStorys
     * @return a list of NewsStorys
     */
    @ApiMethod(name = "listNewsStory")
    public CollectionResponse<NewsStory> listNewsStory(@Nullable @Named("cursor") String cursorString,
                                               @Nullable @Named("count") Integer count) {

        Query<NewsStory> query = ofy().load().type(NewsStory.class);
        if (count != null) query.limit(count);
        if (cursorString != null && cursorString != "") {
            query = query.startAt(Cursor.fromWebSafeString(cursorString));
        }

        List<NewsStory> records = new ArrayList<NewsStory>();
        QueryResultIterator<NewsStory> iterator =  query.iterator();
        int num = 0;
        while (iterator.hasNext()) {
            records.add(iterator.next());
            if (count != null) {
                num++;
                if (num == count) break;
            }
        }

        //Find the next cursor
        if (cursorString != null && cursorString != "") {
            Cursor cursor = iterator.getCursor();
            if (cursor != null) {
                cursorString = cursor.toWebSafeString();
            }
        }
        return CollectionResponse.<NewsStory>builder().setItems(records).setNextPageToken(cursorString).build();
    }

    /**
     * This inserts a new <code>NewsStory</code> object.
     * @param NewsStory The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertNewsStory")
    public NewsStory insertNewsStory(NewsStory NewsStory) throws ConflictException {
        //If if is not null, then check if it exists. If yes, throw an Exception
        //that it is already present
        if (NewsStory.getId() != null) {
            if (findRecord(NewsStory.getId()) != null) {
                throw new ConflictException("Object already exists");
            }
        }
        //Since our @Id field is a Long, Objectify will generate a unique value for us
        //when we use put
        ofy().save().entity(NewsStory).now();
        return NewsStory;
    }

    /**
     * This updates an existing <code>NewsStory</code> object.
     * @param NewsStory The object to be added.
     * @return The object to be updated.
     */
    @ApiMethod(name = "updateNewsStory")
    public NewsStory updateNewsStory(NewsStory NewsStory)throws NotFoundException {
        if (findRecord(NewsStory.getId()) == null) {
            throw new NotFoundException("NewsStory Record does not exist");
        }
        ofy().save().entity(NewsStory).now();
        return NewsStory;
    }

    /**
     * This deletes an existing <code>NewsStory</code> object.
     * @param id The id of the object to be deleted.
     */
    @ApiMethod(name = "removeNewsStory")
    public void removeNewsStory(@Named("id") Long id) throws NotFoundException {
        NewsStory record = findRecord(id);
        if(record == null) {
            throw new NotFoundException("NewsStory Record does not exist");
        }
        ofy().delete().entity(record).now();
    }

    //Private method to retrieve a <code>NewsStory</code> record
    private NewsStory findRecord(Long id) {
        return ofy().load().type(NewsStory.class).id(id).now();
        //or return ofy().load().type(NewsStory.class).filter("id",id).first.now();
    }

}