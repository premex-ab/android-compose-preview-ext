package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Zpad device specifications for Android Compose previews.
 *
 * This extension provides Zpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zpad: Any
  get() = object {
      /** Zpad ZpadX7 */
      val ZPADX7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Zpad Zpad_X7 */
      val ZPAD_X7 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
