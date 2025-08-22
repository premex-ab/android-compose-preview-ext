package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UTime device specifications for Android Compose previews.
 *
 * This extension provides UTime device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Utime.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Utime: Any
  get() = object {
      /** UTime TH602 */
      val TH602 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
