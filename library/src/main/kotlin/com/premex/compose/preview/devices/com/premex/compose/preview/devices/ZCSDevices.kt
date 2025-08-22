package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZCS device specifications for Android Compose previews.
 *
 * This extension provides ZCS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZCS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZCS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZCS, code=Z91, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZCS, code=Z91, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val Z91 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZCS, code=Z92, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZCS, code=Z92, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val Z92 = "spec:width=720,height=1280,unit=px,dpi=240"

  }
