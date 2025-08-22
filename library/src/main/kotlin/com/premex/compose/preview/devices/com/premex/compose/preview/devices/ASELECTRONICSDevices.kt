package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AS_ELECTRONICS device specifications for Android Compose previews.
 *
 * This extension provides AS_ELECTRONICS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASELECTRONICS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASELECTRONICS: Any
  get() = object {
      /** DeviceSpec(manufacturer=AS_ELECTRONICS, code=AS1, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AS_ELECTRONICS, code=AS1,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val AS1 = "spec:width=720,height=1612,unit=px,dpi=280"

  }
