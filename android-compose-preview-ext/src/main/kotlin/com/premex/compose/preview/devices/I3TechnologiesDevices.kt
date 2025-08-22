package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * i3-Technologies device specifications for Android Compose previews.
 *
 * This extension provides i3-Technologies device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.I3Technologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.I3Technologies: Any
  get() = object {
      /** i3-Technologies i3TOUCH-X3 */
      val I3TOUCH_X3 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
