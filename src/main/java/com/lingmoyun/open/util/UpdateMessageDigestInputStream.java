package com.lingmoyun.open.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/**
 * UpdateMessageDigestInputStream
 *
 * @author guoweifeng
 * @date 2021/8/24 15:17
 */
abstract class UpdateMessageDigestInputStream extends InputStream {
    UpdateMessageDigestInputStream() {
    }

    public void updateMessageDigest(MessageDigest messageDigest) throws IOException {
        int data;
        while ((data = this.read()) != -1) {
            messageDigest.update((byte) data);
        }

    }

    public void updateMessageDigest(MessageDigest messageDigest, int len) throws IOException {
        int data;
        for (int bytesRead = 0; bytesRead < len && (data = this.read()) != -1; ++bytesRead) {
            messageDigest.update((byte) data);
        }

    }
}
