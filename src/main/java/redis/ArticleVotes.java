package redis;

import redis.clients.jedis.Jedis;

/**
 * @author :weixiao
 * @description :实现对文章进行投票
 * @date :2020/7/6 14:09
 */
public class ArticleVotes {

    private static final int ONE_WEEK_IN_SECONDS = 7 * 86400;
    private static final int VOTE_SCORE = 432;

    public static void main(String[] args) {

        Jedis conn = new Jedis("localhost");
        conn.select(14);



    }

    public String postArticle(Jedis conn,String user,String title,String link){

        return null;
    }


}
