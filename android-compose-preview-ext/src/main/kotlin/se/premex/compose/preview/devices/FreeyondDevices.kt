package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FreeYond device specifications for Android Compose previews.
 *
 * This extension provides FreeYond device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freeyond.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freeyond: Any
  get() = object {
      /** FreeYond F9 */
      val F9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FreeYond F9S */
      val F9S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** FreeYond F9S_EEA */
      val F9S_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** FreeYond FreeYondA5 */
      val FREEYONDA5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** FreeYond FreeYondP6 */
      val FREEYONDP6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FreeYond M5 */
      val M5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FreeYond M5A */
      val M5A = "spec:width=720,height=1612,unit=px,dpi=320"

      /** FreeYond M6 */
      val M6 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
