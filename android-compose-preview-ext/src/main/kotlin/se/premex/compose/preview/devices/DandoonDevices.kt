package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DANDOON device specifications for Android Compose previews.
 *
 * This extension provides DANDOON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dandoon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dandoon: Any
  get() = object {
      /** DANDOON A2 */
      val A2 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
