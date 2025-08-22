package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ONYX device specifications for Android Compose previews.
 *
 * This extension provides ONYX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onyx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onyx: Any
  get() = object {
      /** ONYX BOOX */
      val BOOX = "spec:width=1404,height=1872,unit=px,dpi=240"

  }
