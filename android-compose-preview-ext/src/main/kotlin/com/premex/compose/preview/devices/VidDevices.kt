package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VID device specifications for Android Compose previews.
 *
 * This extension provides VID device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vid: Any
  get() = object {
      /** VID GQ3115TF5_VID */
      val GQ3115TF5_VID = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
