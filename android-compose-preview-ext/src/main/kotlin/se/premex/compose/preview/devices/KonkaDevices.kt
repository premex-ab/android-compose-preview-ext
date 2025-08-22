package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KONKA device specifications for Android Compose previews.
 *
 * This extension provides KONKA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Konka.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Konka: Any
  get() = object {
      /** KONKA bandra */
      val BANDRA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KONKA capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KONKA KC516 */
      val KC516 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KONKA KC516_Pro */
      val KC516_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONKA kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KONKA keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KONKA KM7012BK */
      val KM7012BK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KONKA lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KONKA M27S */
      val M27S = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** KONKA N15 */
      val N15 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** KONKA N17 */
      val N17 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KONKA N7 */
      val N7 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** KONKA RE1 */
      val RE1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONKA RU1 */
      val RU1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONKA SE1 */
      val SE1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONKA SE2 */
      val SE2 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** KONKA seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KONKA SP10 */
      val SP10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KONKA SP20 */
      val SP20 = "spec:width=444,height=960,unit=px,dpi=240"

      /** KONKA SP6 */
      val SP6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KONKA SP9 */
      val SP9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONKA sugamo */
      val SUGAMO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
