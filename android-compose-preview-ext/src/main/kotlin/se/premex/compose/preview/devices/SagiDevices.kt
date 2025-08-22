package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SAGI device specifications for Android Compose previews.
 *
 * This extension provides SAGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sagi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sagi: Any
  get() = object {
      /** SAGI E5501 */
      val E5501 = "spec:width=480,height=960,unit=px,dpi=240"

  }
