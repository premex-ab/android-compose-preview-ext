package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AllCall device specifications for Android Compose previews.
 *
 * This extension provides AllCall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Allcall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Allcall: Any
  get() = object {
      /** AllCall AllCall_S1_X */
      val ALLCALL_S1_X = "spec:width=480,height=960,unit=px,dpi=240"

      /** AllCall HERO_20_PRO */
      val HERO_20_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

      /** AllCall MIX2 */
      val MIX2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** AllCall S5500 */
      val S5500 = "spec:width=480,height=960,unit=px,dpi=240"

  }
