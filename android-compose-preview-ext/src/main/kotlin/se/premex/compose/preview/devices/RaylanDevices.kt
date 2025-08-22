package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RAYLAN device specifications for Android Compose previews.
 *
 * This extension provides RAYLAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Raylan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Raylan: Any
  get() = object {
      /** RAYLAN longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** RAYLAN P5000 */
      val P5000 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** RAYLAN PHOENIX_H1PLUS */
      val PHOENIX_H1PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** RAYLAN PHOENIX_N1 */
      val PHOENIX_N1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** RAYLAN RAYLAN_P20_Plus */
      val RAYLAN_P20_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** RAYLAN XPOWER_P6000 */
      val XPOWER_P6000 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
