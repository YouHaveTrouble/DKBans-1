package ch.dkrieger.bansystem.lib.player;

import ch.dkrieger.bansystem.lib.BanSystem;
import ch.dkrieger.bansystem.lib.player.history.BanType;
import ch.dkrieger.bansystem.lib.player.history.History;
import ch.dkrieger.bansystem.lib.player.history.value.Ban;
import ch.dkrieger.bansystem.lib.player.history.value.Kick;
import ch.dkrieger.bansystem.lib.player.history.value.Unban;
import ch.dkrieger.bansystem.lib.reason.BanReason;
import ch.dkrieger.bansystem.lib.reason.KickReason;
import ch.dkrieger.bansystem.lib.utils.Document;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class NetworkPlayer {

    private int id;
    private String name, color;
    private UUID uuid;
    private long lastLogin, firstLogin, onlineTime;
    private boolean bypass;
    private History history;
    private Document properties;

    private List<OnlineSession> onlineSessions;

    public NetworkPlayer() {
        /*
        RuntimeTypeAdapterFactory<Animal> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
                .of(Animal.class, "type")
                .registerSubtype(Dog.class, "dog")
                .registerSubtype(Cat.class, "cat");

        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
                .create();
         */
    }

    /*
    RuntimeTypeAdapterFactory<Animal> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
.of(Animal.class, "type")
.registerSubtype(Dog.class, "dog")
.registerSubtype(Cat.class, "cat");

Gson gson = new GsonBuilder()
    .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
    .create();
     */


    /*

    History
     - Last Bans
     - Last Kicks
     -

     */

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getColoredName(){
        return getColor()+this.name;
    }

    public UUID getUUID() {
        return uuid;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public long getFirstLogin() {
        return firstLogin;
    }

    public long getOnlineTime() {
        return onlineTime;
    }

    public boolean hasBypass() {
        return bypass;
    }

    public History getHistory() {
        return history;
    }

    public Document getProperties() {
        return properties;
    }

    public List<OnlineSession> getOnlineSessions() {
        return onlineSessions;
    }

    public Ban getBan(){

    }
    public Ban getBan(BanType type){

    }

    public OnlineNetworkPlayer getOnlinePlayer(){
        return BanSystem.getInstance().getPlayerManager().getOnlinePlayer(this.uuid);
    }

    public boolean isOnline(){
        return getOnlinePlayer() != null;
    }

    public boolean isBanned(){
        return getBan() != null;
    }
    public boolean isBanned(BanType type){
        return getBan(type) != null;
    }

    public Ban ban(BanType type, long duration, TimeUnit unit, int reasonID){

    }

    public Ban ban(BanType type, long duration, TimeUnit unit, NetworkPlayer staff, int reasonID){

    }

    public Ban ban(BanType type, long duration, TimeUnit unit,NetworkPlayer staff, String reason, int reasonID){

    }

    public Ban ban(BanReason reason, UUID staff){

    }

    public Ban ban(BanReason reason){

    }

    public void ban(Ban ban){

    }
    public Kick kick(KickReason reason){
        return kick(reason,null);
    }

    public Kick kick(KickReason reason, UUID staff){

    }

    public Kick kick(Kick kick){


    }



}
