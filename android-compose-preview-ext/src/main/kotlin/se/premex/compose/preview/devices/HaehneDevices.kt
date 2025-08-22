package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HAEHNE device specifications for Android Compose previews.
 *
 * This extension provides HAEHNE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Haehne.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Haehne: Any
  get() = object {
      /** HAEHNE A863K_EEA */
      val A863K_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

  }
