package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mobydata device specifications for Android Compose previews.
 *
 * This extension provides Mobydata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobydata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobydata: Any
  get() = object {
      /** Mobydata m63s */
      val M63S = "spec:width=480,height=800,unit=px,dpi=240"

  }
