import com.javanotetaking.designpattern.abstractfactory.simplefactory.ChatChannel;
import com.javanotetaking.designpattern.abstractfactory.simplefactory.ChatFactory;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class ChatFactoryTest {


    @Test
    void test() {
        ChatChannel channel = ChatFactory.connect("WeChat");
        Optional.ofNullable(channel).ifPresent(chatChannel -> chatChannel.connect());
    }
}