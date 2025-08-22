package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BULSATCOM device specifications for Android Compose previews.
 *
 * This extension provides BULSATCOM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BULSATCOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BULSATCOM: Any
  get() = object {
      /** BULSATCOM UPD-BJ00R */
      val UPD_BJ00R = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
