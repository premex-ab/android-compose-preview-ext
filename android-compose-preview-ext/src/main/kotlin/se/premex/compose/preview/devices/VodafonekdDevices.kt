package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VodafoneKD device specifications for Android Compose previews.
 *
 * This extension provides VodafoneKD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vodafonekd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vodafonekd: Any
  get() = object {
      /** VodafoneKD diw362 */
      val DIW362 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
