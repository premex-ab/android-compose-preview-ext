package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Digit device specifications for Android Compose previews.
 *
 * This extension provides Digit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digit: Any
  get() = object {
      /** Digit Digitplay1 */
      val DIGITPLAY1 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
