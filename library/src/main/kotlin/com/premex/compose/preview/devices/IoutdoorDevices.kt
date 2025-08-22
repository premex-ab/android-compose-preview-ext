package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ioutdoor device specifications for Android Compose previews.
 *
 * This extension provides ioutdoor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ioutdoor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ioutdoor: Any
  get() = object {
      /** ioutdoor Polar3 */
      val POLAR3 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
