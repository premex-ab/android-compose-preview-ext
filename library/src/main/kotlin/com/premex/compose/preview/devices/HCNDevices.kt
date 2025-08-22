package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HCN device specifications for Android Compose previews.
 *
 * This extension provides HCN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HCN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HCN: Any
  get() = object {
      /** HCN IMT-H6300 */
      val IMT_H6300 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
