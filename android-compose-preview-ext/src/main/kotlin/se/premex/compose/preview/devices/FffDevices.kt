package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FFF device specifications for Android Compose previews.
 *
 * This extension provides FFF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fff.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fff: Any
  get() = object {
      /** FFF F3T10WD4 */
      val F3T10WD4 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
