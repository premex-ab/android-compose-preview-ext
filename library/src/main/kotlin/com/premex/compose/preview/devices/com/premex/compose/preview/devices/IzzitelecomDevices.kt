package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * izzi-telecom device specifications for Android Compose previews.
 *
 * This extension provides izzi-telecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Izzitelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Izzitelecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=izzi-telecom, code=HP46A, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=izzi-telecom, code=HP46A,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HP46A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=izzi-telecom, code=HY40A1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=izzi-telecom, code=HY40A1,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HY40A1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
