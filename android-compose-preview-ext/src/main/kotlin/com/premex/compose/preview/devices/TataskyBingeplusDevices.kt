package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TataSky_BingePlus device specifications for Android Compose previews.
 *
 * This extension provides TataSky_BingePlus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TataskyBingeplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TataskyBingeplus: Any
  get() = object {
      /** TataSky_BingePlus usw4026tat */
      val USW4026TAT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
