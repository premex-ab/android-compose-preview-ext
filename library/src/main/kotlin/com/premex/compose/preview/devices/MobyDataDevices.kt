package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MobyData device specifications for Android Compose previews.
 *
 * This extension provides MobyData device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MobyData.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MobyData: Any
  get() = object {
      /** MobyData M72 */
      val M72 = "spec:width=480,height=800,unit=px,dpi=240"

  }
