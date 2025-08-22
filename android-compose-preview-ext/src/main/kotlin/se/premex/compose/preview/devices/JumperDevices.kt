package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Jumper device specifications for Android Compose previews.
 *
 * This extension provides Jumper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jumper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jumper: Any
  get() = object {
      /** Jumper EZpad_M10 */
      val EZPAD_M10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Jumper EZpad_M10S */
      val EZPAD_M10S = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Jumper EZpad_M11 */
      val EZPAD_M11 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
