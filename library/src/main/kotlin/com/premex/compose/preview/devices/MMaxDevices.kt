package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mMax device specifications for Android Compose previews.
 *
 * This extension provides mMax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MMax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MMax: Any
  get() = object {
      /** mMax M55 */
      val M55 = "spec:width=480,height=800,unit=px,dpi=240"

  }
