package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Invens device specifications for Android Compose previews.
 *
 * This extension provides Invens device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Invens.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Invens: Any
  get() = object {
      /** Invens K1 */
      val K1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Invens MAX5 */
      val MAX5 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** Invens MAX8 */
      val MAX8 = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** Invens MAX9 */
      val MAX9 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
