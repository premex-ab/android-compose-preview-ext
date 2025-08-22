package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Four device specifications for Android Compose previews.
 *
 * This extension provides Four device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Four.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Four: Any
  get() = object {
      /** Four S186_Sky_3 */
      val S186_SKY_3 = "spec:width=480,height=854,unit=px,dpi=240"

  }
