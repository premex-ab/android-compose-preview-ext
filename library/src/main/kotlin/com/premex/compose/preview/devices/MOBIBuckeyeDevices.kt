package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOBI-Buckeye device specifications for Android Compose previews.
 *
 * This extension provides MOBI-Buckeye device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MOBIBuckeye.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MOBIBuckeye: Any
  get() = object {
      /** MOBI-Buckeye SEI800MOBI */
      val SEI800MOBI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
