package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KCCL device specifications for Android Compose previews.
 *
 * This extension provides KCCL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kccl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kccl: Any
  get() = object {
      /** KCCL N9109M */
      val N9109M = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
