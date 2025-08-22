package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KXD device specifications for Android Compose previews.
 *
 * This extension provides KXD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kxd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kxd: Any
  get() = object {
      /** KXD A06 */
      val A06 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** KXD A07 */
      val A07 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** KXD A08 */
      val A08 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KXD A1 */
      val A1 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** KXD A11 */
      val A11 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** KXD A8 */
      val A8 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** KXD Blus_Sea_S25_Plus */
      val BLUS_SEA_S25_PLUS = "spec:width=720,height=1612,unit=px,dpi=480"

      /** KXD D26 */
      val D26 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** KXD D58 */
      val D58 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KXD D68S */
      val D68S = "spec:width=600,height=1280,unit=px,dpi=240"

      /** KXD D70 */
      val D70 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** KXD K30M */
      val K30M = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KXD T50 */
      val T50 = "spec:width=240,height=296,unit=px,dpi=120"

      /** KXD T50Y */
      val T50Y = "spec:width=320,height=385,unit=px,dpi=160"

      /** KXD T55 */
      val T55 = "spec:width=320,height=385,unit=px,dpi=160"

      /** KXD T55S */
      val T55S = "spec:width=320,height=385,unit=px,dpi=160"

      /** KXD Universe_S24_Plus */
      val UNIVERSE_S24_PLUS = "spec:width=720,height=1612,unit=px,dpi=480"

      /** KXD W55Y */
      val W55Y = "spec:width=240,height=296,unit=px,dpi=120"

      /** KXD X10 */
      val X10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KXD X7g */
      val X7G = "spec:width=600,height=1024,unit=px,dpi=240"

      /** KXD X7s */
      val X7S = "spec:width=800,height=1280,unit=px,dpi=240"

      /** KXD Y20 */
      val Y20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KXD 6Cb */
      val _6CB = "spec:width=480,height=960,unit=px,dpi=213"

  }
