package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AMGx13e device specifications for Android Compose previews.
 *
 * This extension provides AMGx13e device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amgx13e.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amgx13e: Any
  get() = object {
      /** AMGx13e ASPE2201 */
      val ASPE2201 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
