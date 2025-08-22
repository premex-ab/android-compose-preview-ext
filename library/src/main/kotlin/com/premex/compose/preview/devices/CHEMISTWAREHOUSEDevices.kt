package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHEMIST_WAREHOUSE device specifications for Android Compose previews.
 *
 * This extension provides CHEMIST_WAREHOUSE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHEMISTWAREHOUSE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHEMISTWAREHOUSE: Any
  get() = object {
      /** CHEMIST_WAREHOUSE JR_MB603 */
      val JR_MB603 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
