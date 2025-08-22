package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASTON device specifications for Android Compose previews.
 *
 * This extension provides ASTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASTON: Any
  get() = object {
      /** ASTON Hyper_Max_Power */
      val HYPER_MAX_POWER = "spec:width=800,height=1280,unit=px,dpi=160"

  }
