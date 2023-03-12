package codewars.kaniosx;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PingPong {
    public static String pingPong(String sounds) {
        int pingScore = 0;
        int pongScore = 0;
        String lastWord = "";
        String[] words = sounds.split("-");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("ping") && words[i + 1].equals("pong")) {
                pingScore++;
            } else if (words[i].equals("ping") && !words[i + 1].equals("pong")) {
                lastWord = "pong";
            } else if (words[i].equals("pong") && words[i + 1].equals("ping")) {
                pongScore++;
            } else if (words[i].equals("pong") && !words[i + 1].equals("ping")) {
                lastWord = "ping";
            }
        }

        if (pingScore > pongScore) {
            return "ping";
        }

        if (pongScore > pingScore) {
            return "pong";
        }

        return lastWord;
    }
}

/*
/*
function pingPong(sounds) {
  const noices = sounds.split('-');
  const ping = 'ping';
  const pong = 'pong'

  let mrPing = 0;
  let mrPong = 0;
  let lastShoot;

  noices.forEach(checkWhoScored);

  function checkWhoScored(element, index, array) {
    if (element === ping && noices[index+1] === pong)
        mrPing++;
    else if (element === ping && noices[index+1] !== pong)
        lastShoot = pong;
    else if (element === pong && noices[index+1] === ping)
        mrPong++;
    else if (element === pong && noices[index+1] !== ping)
        lastShoot = ping;
    }

  if (mrPing > mrPong)
    return ping;
  else if (mrPong > mrPing)
    return pong;
  else return lastShoot;
}
 */