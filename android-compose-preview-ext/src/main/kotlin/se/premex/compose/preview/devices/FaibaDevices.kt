package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Faiba device specifications for Android Compose previews.
 *
 * This extension provides Faiba device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Faiba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Faiba: Any
  get() = object {
      /** Faiba M1 */
      val M1 = "spec:width=720,height=1600,unit=px,dpi=280"

  }
