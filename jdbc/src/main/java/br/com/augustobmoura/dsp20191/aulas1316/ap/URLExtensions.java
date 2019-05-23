package br.com.augustobmoura.dsp20191.aulas1316.ap;

import lombok.experimental.ExtensionMethod;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

@ExtensionMethod(URL.class)
public class URLExtensions {

  public static String getText(final URL url, final Charset charset) throws IOException {
    try (final InputStream in = url.openStream()) {
      return new String(in.readAllBytes(), charset);
    }
  }

  public static String getText(final URL url) throws IOException {
    return getText(url, Charset.defaultCharset());
  }

}
