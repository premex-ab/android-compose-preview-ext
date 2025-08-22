package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * naomicase device specifications for Android Compose previews.
 *
 * This extension provides naomicase device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Naomicase.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Naomicase: Any
  get() = object {
      /** naomicase N4 */
      val N4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** naomicase N4MAX */
      val N4MAX = "spec:width=720,height=1600,unit=px,dpi=320"

  }
