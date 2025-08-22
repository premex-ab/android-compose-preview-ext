package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * swisstone device specifications for Android Compose previews.
 *
 * This extension provides swisstone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swisstone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swisstone: Any
  get() = object {
      /** swisstone SD5103G */
      val SD5103G = "spec:width=480,height=854,unit=px,dpi=240"

      /** swisstone SD5304G */
      val SD5304G = "spec:width=720,height=1280,unit=px,dpi=320"

  }
