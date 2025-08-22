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
      /** DeviceSpec(manufacturer=CHEMIST_WAREHOUSE, code=JR_MB603, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHEMIST_WAREHOUSE, code=JR_MB603,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val JR_MB603 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
