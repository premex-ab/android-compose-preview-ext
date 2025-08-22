package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IndiHome device specifications for Android Compose previews.
 *
 * This extension provides IndiHome device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IndiHome.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IndiHome: Any
  get() = object {
      /** DeviceSpec(manufacturer=IndiHome, code=B866FV1_1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IndiHome, code=B866FV1_1,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val B866FV1_1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IndiHome, code=HG680, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IndiHome, code=HG680, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HG680 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
