package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FREETEL device specifications for Android Compose previews.
 *
 * This extension provides FREETEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freetel: Any
  get() = object {
      /** FREETEL Cricket_Wave */
      val CRICKET_WAVE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FREETEL FTJ152D */
      val FTJ152D = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** FREETEL FTJ161A */
      val FTJ161A = "spec:width=480,height=800,unit=px,dpi=240"

      /** FREETEL FTJ161B */
      val FTJ161B = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** FREETEL FTU161G */
      val FTU161G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FREETEL Priori4 */
      val PRIORI4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FREETEL Priori5 */
      val PRIORI5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FREETEL RAIJIN */
      val RAIJIN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** FREETEL SAKURA_FTE1 */
      val SAKURA_FTE1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** FREETEL SAMURAI_KIWAMI2 */
      val SAMURAI_KIWAMI2 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** FREETEL SAMURAI_REI2 */
      val SAMURAI_REI2 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
