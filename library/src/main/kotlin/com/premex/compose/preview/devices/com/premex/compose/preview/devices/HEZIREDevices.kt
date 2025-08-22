package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HEZIRE device specifications for Android Compose previews.
 *
 * This extension provides HEZIRE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HEZIRE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HEZIRE: Any
  get() = object {
      /** DeviceSpec(manufacturer=HEZIRE, code=HBook-Prime, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEZIRE, code=HBook-Prime,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val HBOOK_PRIME = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=HEZIRE, code=HBook-Pro, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HEZIRE, code=HBook-Pro, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val HBOOK_PRO = "spec:width=800,height=1280,unit=px,dpi=210"

  }
