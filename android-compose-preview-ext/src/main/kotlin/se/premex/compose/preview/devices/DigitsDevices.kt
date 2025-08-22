package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * digITS device specifications for Android Compose previews.
 *
 * This extension provides digITS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digits.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digits: Any
  get() = object {
      /** digITS T1 */
      val T1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
