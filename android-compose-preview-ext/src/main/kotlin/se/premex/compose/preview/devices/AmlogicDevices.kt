package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Amlogic device specifications for Android Compose previews.
 *
 * This extension provides Amlogic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amlogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amlogic: Any
  get() = object {
      /** Amlogic ampere */
      val AMPERE = "spec:width=720,height=1280,unit=px,dpi=160"

      /** Amlogic p212 */
      val P212 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
