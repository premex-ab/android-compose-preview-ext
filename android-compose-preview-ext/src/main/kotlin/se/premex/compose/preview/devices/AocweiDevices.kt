package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AOCWEI device specifications for Android Compose previews.
 *
 * This extension provides AOCWEI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aocwei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aocwei: Any
  get() = object {
      /** AOCWEI X800_EEA */
      val X800_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** AOCWEI X800_US */
      val X800_US = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
